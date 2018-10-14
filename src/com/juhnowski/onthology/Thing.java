package com.juhnowski.onthology;

public class Thing extends All{

    Possibilities<AtomicFact> possibilities;
    Thing() {
        isTheCase = true;
    }

    public Thing(Possibilities possibilities){
        this.possibilities = possibilities;
    }

    Properties properties;


}
