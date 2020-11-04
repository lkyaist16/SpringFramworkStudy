package com.po;

public abstract class AbstractTeaFactory {

    public Tea getTea() {
        return this.getInstance();
    }

    protected abstract Tea getInstance();
}
