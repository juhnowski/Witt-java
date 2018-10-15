package com.juhnowski.onthology;

import java.util.ArrayList;

public abstract class Symbol implements Persiptable {

    ArrayList<PropositionalSign> signs;
    Language language;

    @Override
    public PropositionalSign perceive() {
        return null;
    }

    public void signify(PropositionalSign sign){}

    public Expression<FormalProperties> expression;
}
