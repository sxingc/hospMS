/* API method to get paging information */
$.fn.dataTableExt.oApi.fnPagingInfo = function (oSettings) {
	return {
		"iStart": oSettings._iDisplayStart,
		"iEnd": oSettings.fnDisplayEnd(),
		"iLength": oSettings._iDisplayLength,
		"iTotal": oSettings.fnRecordsTotal(),
		"iFilteredTotal": oSettings.fnRecordsDisplay(),
		"iPage": Math.ceil(oSettings._iDisplayStart / oSettings._iDisplayLength),
		"iTotalPages": Math.ceil(oSettings.fnRecordsDisplay() / oSettings._iDisplayLength)
	};
};

/* Bootstrap style pagination control */
$.extend($.fn.dataTableExt.oPagination, {
	"jump_paging": {
		"fnInit": function (oSettings, nPaging, fnDraw) {
			var oLang = oSettings.oLanguage.oPaginate;
			var fnClickHandler = function (e) {
				e.preventDefault();
				if (oSettings.oApi._fnPageChange(oSettings, e.data.action)) {
					fnDraw(oSettings);
				}
			};

			$(nPaging).addClass('pagination').append(
				'<ul>' +
				'<a class="paginate_button first disabled">' + oLang.sFirst + '</a>' +
				'<a class="paginate_button prev disabled">' + oLang.sPrevious + '</a>' +
				'<a class="paginate_button next disabled">' + oLang.sNext + '</a>' +
				'<a class="paginate_button last disabled">' + oLang.sLast + '</a>' +
				'<input type="text" style="margin-left: 20px; margin-bottom: 3px; width: 30px; padding: 0 5px;border: 1px solid #bbb; height: 26px;" id="redirect">' +
				'<span class="paginate_button redirect">GO</span>' +
				'</ul>'
			);

			//datatables分页跳转
			$(nPaging).find("#redirect").keypress(function (e) {
				if (event.keyCode == "13") {
					var ipage = parseInt($(this).val());
					var oPaging = oSettings.oInstance.fnPagingInfo();
					if (oPaging.iTotalPages === 0) {
						return
					}
					if (isNaN(ipage) || ipage < 1) {
						ipage = 1;
					} else if (ipage > oPaging.iTotalPages) {
						ipage = oPaging.iTotalPages;
					}
					$(this).val(ipage);
					ipage--;
					oSettings._iDisplayStart = ipage * oPaging.iLength;
					fnDraw(oSettings);
				}
			});
			$(nPaging).find(".redirect").click(function (e) {
				var ipage = parseInt($(this).prev('input').val());
				var oPaging = oSettings.oInstance.fnPagingInfo();
				if (oPaging.iTotalPages === 0) {
					return
				}
				if (isNaN(ipage) || ipage < 1) {
					ipage = 1;
				} else if (ipage > oPaging.iTotalPages) {
					ipage = oPaging.iTotalPages;
				}
				$(this).prev('input').val(ipage);
				ipage--;
				oSettings._iDisplayStart = ipage * oPaging.iLength;
				fnDraw(oSettings);
			});

			var els = $('a', nPaging);
			$(els[0]).bind('click.DT', {
				action: "first"
			}, fnClickHandler);
			$(els[1]).bind('click.DT', {
				action: "previous"
			}, fnClickHandler);
			$(els[2]).bind('click.DT', {
				action: "next"
			}, fnClickHandler);
			$(els[3]).bind('click.DT', {
				action: "last"
			}, fnClickHandler);

			if (oSettings.oInstance.fnPagingInfo().iTotalPages === 0) {
				$('#redirect').prop('disabled', true);
			}
		},

		"fnUpdate": function (oSettings, fnDraw) {
			var iListLength = 5;
			var oPaging = oSettings.oInstance.fnPagingInfo();
			var an = oSettings.aanFeatures.p;
			var i, ien, j, sClass, iStart, iEnd, iHalf = Math.floor(iListLength / 2);

			if (oPaging.iTotalPages < iListLength) {
				iStart = 1;
				iEnd = oPaging.iTotalPages;
			}
			else if (oPaging.iPage <= iHalf) {
				iStart = 1;
				iEnd = iListLength;
			} else if (oPaging.iPage >= (oPaging.iTotalPages - iHalf)) {
				iStart = oPaging.iTotalPages - iListLength + 1;
				iEnd = oPaging.iTotalPages;
			} else {
				iStart = oPaging.iPage - iHalf + 1;
				iEnd = iStart + iListLength - 1;
			}

			for (i = 0, ien = an.length; i < ien; i++) {
				// Remove the middle elements
				($('a:gt(1)', an[i]).filter(':not(:last)')).filter(':not(:last)').remove();

				// Add the new list items and their event handlers
				for (j = iStart; j <= iEnd; j++) {
					sClass = (j == oPaging.iPage + 1) ? 'class="paginate_button current"' : 'class="paginate_button"';
					$('<a ' + sClass + '>' + j + '</a>')
						.insertBefore($('.next', an[i])[0])
						.bind('click', function (e) {
							e.preventDefault();
							oSettings._iDisplayStart = (parseInt($(this).text(), 10) - 1) * oPaging.iLength;
							fnDraw(oSettings);
						});
				}

				// Add / remove disabled classes from the static elements
				if (oPaging.iTotalPages === 0) {
					$('#redirect').prop('disabled', true);
				} else {
					$('#redirect').prop('disabled', false);
				}

				if (oPaging.iPage === 0) {
					$('a:lt(2)', an[i]).addClass('disabled');
				} else {
					$('a:lt(2)', an[i]).removeClass('disabled');
				}

				if (oPaging.iPage === oPaging.iTotalPages - 1 || oPaging.iTotalPages === 0) {
					$('.next', an[i]).addClass('disabled');
					$('a:last', an[i]).addClass('disabled');
				} else {
					$('.next', an[i]).removeClass('disabled');
					$('a:last', an[i]).removeClass('disabled');
				}
			}
		}
	}
});

/**
 * Created by fan on 2015/08/08.
 */
(function (global, factory) {
	if (typeof exports === 'object' && exports && typeof exports.nodeName !== 'string') {
		factory(exports); // CommonJS
	} else if (typeof define === 'function' && define.amd) {
		define(['exports'], factory); // AMD
	} else {
		global.Table = {};
		factory(Table); // script, wsh, asp
	}
})(this, function (table) {
	'use strict';

	var T = function (selector, options) {
		this.$table = $(selector);
		this.options = T.defaults;
		this.table = null;
		this._options = options;
	};

	T.defaults = {
		paging: true, // 分页
		ordering: true,
		searching: true, // 是否使用搜索
		stateSave: false, // 是否把设置保存到本地 localStorage 中
		lengthChange: false, // 每页数据条数变更
		lengthMenu: [5, 10, 25, 50], //
		pageLength: 10, // 默认每页展示条数
		serverSide: true, // 启用了服务器端处理,所有分页、搜索排序操作
		processing: true,
		"sPaginationType": "jump_paging", //详细分页组，可以支持直接跳转到某页
		dom: '<<<<"cl mb-5"<"fl"r>f>>>t<ip>>',
		ajax: {
			url: '',
			dataSrc: 'data', // 返回数据包裹对象
			type: 'POST'
		},
		language: {
			"sProcessing": '<img src="/public/images/loading.gif" width="20px;">',
			"lengthMenu": "每页显示 _MENU_ 条",
			"zeroRecords": "没有找到匹配的记录",
			"info": "显示 _START_ 到 _END_ ，共 _TOTAL_ 条",
			"infoEmpty": "",
			"infoFiltered": "(共 _MAX_ 条数据)",
			"infoPostFix": "",
			"search": "当前检索",
			"url": "",
			"oPaginate": {
				"sPrevious": "上一页",
				"sNext": "下一页",
				"sLast": "尾页",
				"sFirst": "首页"
			}
		}
	};

	T.prototype.init = function () {
		var _this = this;
		if (this._check()) {
			this._buildData();
			this._buildAjaxData();
			this.table = this.$table.DataTable(this.options);
			this.table.$table = this.$table;
			_this.table.on('xhr', function () {
				var json = _this.table.ajax.json();
				if (typeof json.recordsFiltered == 'undefined' && typeof json.count != 'undefined') {
					json.recordsFiltered = +json.count;
					json.recordsTotal = json.recordsFiltered;
				}

				if (!json['success'] && json['datas'] == -11) {
					var arr = top.location.pathname.split('/');
					if (arr[1] == 'user') {
						top.location.href = '/user/login.shtml';
					} else {
						top.location.href = '/' + arr[1] + '/login.php';
					}
				}
			});
			return this.table;
		}
	};

	T.prototype._check = function () {
		return true;
	};

	// 处理传递到服务器的参数
	T.prototype._buildData = function () {
		// build data
		var _this = this;
		var $columns = _this.$table.find('thead th');
		var aColumns = [];
		for (var i = 0; i < $columns.length; i++) {
			var column = {};
			var $con = $($columns[i]);
			var data_id = $con.attr('data-id');
			if (!data_id) {
				column.defaultContent = '';
			} else if (data_id.indexOf('_') == 0) {
				column.className = 'cell-' + data_id.substr(1);
				column.defaultContent = '';
			} else {
				column.data = data_id;
				column.className = 'cell-' + data_id;
			}
			column.orderable = $con.attr('orderable') || false;
			aColumns.push(column);
		}
		this.options.columns = aColumns;
		$.extend(true, this.options, this._options);
	};

	T.prototype._buildAjaxData = function () {
		var _this = this;
		_this.options.ajax.data = function (data) {
			if (data.order.length > 0) {
				data.order_by = data.columns[data.order[0]['column']]['data'];
				data.order_dir = data.order[0]['dir'];
			} else {
				data.order_by = '';
				data.order_dir = '';
			}
			if (data.search['value']) {
				data.keywords = data.search['value'];
			}

			delete data.columns;
			delete data.order;
			delete data.search;

			if (_this._options.ajaxData && typeof _this._options.ajaxData == 'function') {
				_this._options.ajaxData(data);
			}
		};
	};

	table.create = function (selector, options) {
		var t = new T(selector, options);
		return t.init();
	};
});