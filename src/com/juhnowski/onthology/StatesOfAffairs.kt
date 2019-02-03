package com.juhnowski.onthology

import com.juhnowski.onthology.logical.Syntax

import java.util.ArrayList

abstract class StatesOfAffairs : Combination<State<Affairs>>(), Syntax {
    internal var configuration: Configuration<TheObject>? = null
    internal var internal: ArrayList<Property<*>>? = null
}
