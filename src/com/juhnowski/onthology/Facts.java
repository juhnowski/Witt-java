package com.juhnowski.onthology;

public abstract class Facts extends Reality{
    public Totality<Fact> facts;

    public Facts(Structure structure) {
        super(structure);
    }
}
