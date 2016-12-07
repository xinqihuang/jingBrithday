/*
 * Copyright (c) 2016.
 * this is a website to dongzijing by huangxinqi
 */

package edu.csu.huangxinqi.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by huangxinqi on 2016/12/4/0004.
 */
public class PublicAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return LOGIN;
    }
}
