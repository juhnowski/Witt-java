package com.juhnowski.onthology;

import com.juhnowski.onthology.logical.Syntax;

import java.util.ArrayList;

public abstract class StatesOfAffairs extends Combination<State<Affairs>> implements Syntax {
    Configuration<TheObject> configuration;
    ArrayList<Property> internal;
}
