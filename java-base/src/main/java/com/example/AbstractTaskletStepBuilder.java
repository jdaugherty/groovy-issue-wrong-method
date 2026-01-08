package com.example;

public abstract class AbstractTaskletStepBuilder<B extends AbstractTaskletStepBuilder<B>> extends StepBuilderHelper<B> {
    @Override
    public B listener(Object listener) {
        return super.listener(listener);
    }
}
