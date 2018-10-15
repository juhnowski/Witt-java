package com.juhnowski.onthology;

import com.juhnowski.onthology.logical.Syntax;

import java.util.ArrayList;

public abstract class Expression<T> implements Syntax {
    public ArrayList<Form<Proposition>> forms;
    public Content content;
    public Term<ExpressionTerm> terms;
    public abstract void descript(Expression expression);
}
