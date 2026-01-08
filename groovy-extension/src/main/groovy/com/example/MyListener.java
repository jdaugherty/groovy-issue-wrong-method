package com.example;

import groovy.transform.CompileStatic;

@CompileStatic
public class MyListener implements BaseListener {
    public void onEvent(Object event) {
        System.out.println("Event: " + event);
    }
}
