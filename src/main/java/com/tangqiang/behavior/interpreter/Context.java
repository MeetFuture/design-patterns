package com.tangqiang.behavior.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 包含解释器之外的一些全局信息
 *
 * @author tangqiang
 */
public class Context {
    private String content;

    private List<Expression> list = new ArrayList<Expression>();

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void add(Expression eps) {
        list.add(eps);
    }

    public List<Expression> getList() {
        return list;
    }
}
