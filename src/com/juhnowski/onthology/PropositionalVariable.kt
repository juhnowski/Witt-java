package com.juhnowski.onthology

import com.juhnowski.onthology.logical.Syntax

import java.util.ArrayList

abstract class PropositionalVariable : Variable(), Syntax {
    internal var expressions: ArrayList<Expression<*>>? = null
}
