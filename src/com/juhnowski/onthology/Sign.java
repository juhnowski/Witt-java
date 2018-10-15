package com.juhnowski.onthology;

public abstract class Sign<T> extends PropositionalSign {
    public SignificationMode mode;
    public Object significantUse;
    public Object logicalSyntacticApplication;
    public T instance;
}
