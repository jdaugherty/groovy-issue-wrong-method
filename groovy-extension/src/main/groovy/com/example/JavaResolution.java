package com.example;

public class JavaResolution {

    void testWithImplementingType() {
        new StepBuilder().chunk().listener(new MyListener());
    }

    void testWithInterfaceType() {
        new StepBuilder().chunk().listener((BaseListener) new MyListener());
    }
}
