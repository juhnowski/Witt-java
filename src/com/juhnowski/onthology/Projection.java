package com.juhnowski.onthology;

import java.util.ArrayList;

public class Projection {
    public ArrayList<Rule> rules;
    public Proposition proposition;
    public ArrayList<Projected> projected;

    public Projection(Proposition proposition){
        this.proposition = proposition;
    }

    public class Projected{

    }
}
