package com.juhnowski.onthology;

import java.util.ArrayList;

public abstract class TruthOperation extends Operation{
    public abstract TruthFunction truthFunctionFactory(ArrayList<ElementaryProposition> propositions);
}
