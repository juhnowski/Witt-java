package com.juhnowski.onthology;

import java.util.ArrayList;

public abstract class Statement {
    private Complexes complexes;
    private Complexes constituents;
    public boolean hadSense;

    public Statement(Complexes complexes){
        this.complexes = complexes;
    }

    public abstract Result resolve();

    public class Result {
        public ArrayList<Statement> statementsAboutConstituents;
        public ArrayList<Statement> propositionsThatDescribeTheComplexesCompletely;
    }
}
