package com.juhnowski.onthology.logical;

import com.juhnowski.onthology.*;
import com.juhnowski.onthology.Form;

import java.util.HashMap;

public class LogicalPicture extends Model<Reality> {
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

    public HashMap<Element,Thing> pictorialRelationship;
}
