package com.juhnowski.onthology;

public abstract class Event extends GeneralProposition {
    public boolean isFuture;
    public boolean isFresent;
    public abstract void occurs();
}
