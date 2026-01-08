package com.example;

public class StepBuilder extends StepBuilderHelper<StepBuilder> {

    @Override
    protected StepBuilder self() {
        return this;
    }

    public <I, O> SimpleStepBuilder<I, O> chunk() {
        return new SimpleStepBuilder<I, O>();
    }
}
