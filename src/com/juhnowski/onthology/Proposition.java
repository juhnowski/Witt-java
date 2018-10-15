package com.juhnowski.onthology;

import com.juhnowski.onthology.logical.Syntax;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Proposition extends Picture<Reality> implements Syntax {
    public Proposition itFollowsFrom;
    public boolean isTrue;
    public Sense sense;
    public Statement statement;
    public Projection projection;
    public Form<Sense> formOfSense;
    public PropositionalVariable propositionalVariable;
    public HashMap<SimpleSign, TheObject> names;
    public StatesOfAffairs statesOfAffairs;

    public void descript(Expression expression){
        this.propositionalVariable.descript(expression);
    }

    public PropositionalSign sign = new PropositionalSign(statesOfAffairs) {
        @Override
        public Thought express(Thought thought) {
            return thought;
        }

        @Override
        public Configuration<SimpleSign> correspond(Configuration<TheObject> conf) {
            return null;
        }
    };

    LogicalPlace place;

    public abstract Sense show();

    public abstract boolean makAgree(Reality reality);

    public abstract Inferences drawInferences();

    public ArrayList<Property> internal;

    public Property formalProperty;

    public Series<Relation<Proposition>> internalRelations;

    public ArrayList<Operation> operations;

}