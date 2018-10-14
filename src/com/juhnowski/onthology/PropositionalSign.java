package com.juhnowski.onthology;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class PropositionalSign extends Fact{
    public ArrayList<PropositionalSign> definitions;
    public abstract Thought express(Thought thought);
    public Configuration<SimpleSign> configuration;

    public PropositionalSign(StatesOfAffairs statesOfAffairs){
        configuration = correspond(statesOfAffairs.configuration);
    }

    public PropositionalSign(){}
    public abstract Configuration<SimpleSign> correspond(Configuration<TheObject> conf);
}
