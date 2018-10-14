package com.juhnowski.onthology.logical;

import com.juhnowski.onthology.*;

import java.util.HashMap;

public abstract class LogicalPicture<T> extends Model<T> {
    public boolean value;
    public boolean isImagined;
    public boolean isTheReal;
    public boolean isCorrect;


    public LogicalPicture(){}
    public LogicalPicture(Structure structure){
        this.structure = structure;
    }

    Situation situation;
    Structure structure;
    HashMap<Element, TheObject> elements;
    LogicForm<Element> pictorialForm;
    Sense sense;

    public HashMap<Element,Thing> pictorialRelationship;
    public Sense  represent(){
        return sense;
    }

    public abstract boolean agreement(Sense realitySense);


}
