package com.juhnowski.onthology;

import com.juhnowski.onthology.logical.Syntax;

public abstract class StatesOfAffairs extends Combination<State<Affairs>> implements Syntax {
    Configuration<TheObject> configuration;
}
