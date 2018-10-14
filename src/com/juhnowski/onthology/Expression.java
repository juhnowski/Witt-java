package com.juhnowski.onthology;

import com.juhnowski.onthology.logical.Syntax;

import java.util.ArrayList;

public abstract class Expression implements Syntax {
    public ArrayList<Form<Proposition>> forms;
    public Content content;

    public abstract void descript(Expression expression);
}
