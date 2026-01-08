package com.example;

public class SimpleStepBuilder<I, O> extends AbstractTaskletStepBuilder<SimpleStepBuilder<I, O>> {
    @Override
    protected SimpleStepBuilder<I, O> self() {
        return this;
    }

    @Override
    public SimpleStepBuilder<I, O> listener(Object listener) {
        super.listener(listener);
        return this;
    }
}
