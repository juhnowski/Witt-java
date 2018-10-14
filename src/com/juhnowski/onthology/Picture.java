package com.juhnowski.onthology;

import com.juhnowski.onthology.logical.LogicalPicture;
import com.juhnowski.onthology.logical.Situation;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Picture<T> extends LogicalPicture<T> {
    WorldForm<Element> pictorialForm;
    public abstract ArrayList<AtomicFact> depict(T reality);

}
