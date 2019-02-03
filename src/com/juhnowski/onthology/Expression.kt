package com.juhnowski.onthology

import com.juhnowski.onthology.logical.Syntax

import java.util.ArrayList

abstract class Expression<T> : Syntax {
    var forms: ArrayList<Form<Proposition>>? = null
    var content: Content? = null
    var terms: Term<ExpressionTerm>? = null
    abstract fun descript(expression: Expression<*>)
}
