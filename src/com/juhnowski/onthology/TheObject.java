package com.juhnowski.onthology;

import com.juhnowski.onthology.logical.LogicForm;

import java.util.ArrayList;

public class TheObject extends Thing implements Colourless,Unalterable,Subsistent{
    ArrayList<Property> internal;
    public ArrayList<Property> external;
    public TheObjectForm form;
    public LogicForm logicForm;
    public TheObject(ArrayList<Property> internal){
        this.internal = internal;
    }

    public boolean equals(TheObject obj) {
        return logicForm.equals(obj.logicForm);
    }

    public Sign sign;
    public void signify(Sign sign){
        this.sign = sign;
    }

    public ArrayList<Symbol> realName;
}
