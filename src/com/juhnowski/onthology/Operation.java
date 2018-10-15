package com.juhnowski.onthology;

import java.util.ArrayList;

public abstract class Operation extends Expression<Relation<PropositionStructure>> {
    Proposition result;
    public abstract Proposition execute(ArrayList<Proposition> propositions);
}
