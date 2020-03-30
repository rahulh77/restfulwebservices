package com.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    private String msg;

    public HelloWorldBean(String msg) {
        this.msg = msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
