package com.juhnowski.onthology;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class ProbabilityProposition extends GeneralProposition {
    ArrayList<Unit> units;

    public class Unit{
        ArrayList<Proposition> propositions;
        Event event;
        Double degree;
    }
}
