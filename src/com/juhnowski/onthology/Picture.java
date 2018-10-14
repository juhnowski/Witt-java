package com.juhnowski.onthology;

import com.juhnowski.onthology.logical.Situation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Picture extends Model<Reality>{
    Situation situation;
    TreeSet<Element> picture;
    HashMap<Element,TheObject> elements;

    public class Element extends TheObject{

        public Element(ArrayList<Property> internal) {
            super(internal);
        }
    };

}
