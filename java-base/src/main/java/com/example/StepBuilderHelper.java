package com.example;

import java.util.ArrayList;
import java.util.List;

abstract public class StepBuilderHelper<B extends StepBuilderHelper<B>> {
    private final List<BaseListener> listeners = new ArrayList<>();

    protected abstract B self();

    public B listener(Object listener) {
        throw new IllegalStateException("Listener was invoked with object");
    }

    public B listener(BaseListener listener) {
        listeners.add(listener);
        return self();
    }
}
