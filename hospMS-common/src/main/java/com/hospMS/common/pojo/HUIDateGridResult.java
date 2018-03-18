package com.hospMS.common.pojo;

import java.util.List;

/**
 * Created by Chen on 2017/10/18.
 */
public class HUIDateGridResult {
    private long total;
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
