package com.che.test.design.behavior.responsibility.impl;

import com.che.test.design.behavior.responsibility.AbsHandler;

/**
 * 作者：余天然 on 16/9/12 下午9:44
 */
public class Jiangxi extends AbsHandler {

    public static final String TYPE = "江西";

    @Override
    public void handleRequest(String request) {
        if (request.endsWith(TYPE)) {
            System.out.println("我是" + request + "处理中心，只处理" + request + "事务");
        } else {
            elseTodo(request);
        }
    }

}
