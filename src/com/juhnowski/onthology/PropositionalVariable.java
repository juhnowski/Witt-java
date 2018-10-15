package com.juhnowski.onthology;

import com.juhnowski.onthology.logical.Syntax;

import java.util.ArrayList;

public abstract class PropositionalVariable extends Variable implements Syntax {
    ArrayList<Expression> expressions;
}
