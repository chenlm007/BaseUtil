package com.che.test.design.behavior.responsibility.impl;

import com.che.test.design.behavior.responsibility.AbsHandler;

/**
 * 作者：余天然 on 16/9/12 下午9:44
 */
public class Hunan extends AbsHandler {

    public static final String TYPE = "湖南";

    @Override
    public void handleRequest(String request) {
        if (request.equals(TYPE)) {
            System.out.println("我是" + request + "处理中心，只处理" + request + "事务");
        } else {
            elseTodo(request);
        }
    }

}
