package com.juhnowski.onthology

import com.juhnowski.onthology.logical.LogicForm

import java.util.ArrayList

open class TheObject(internal var internal: ArrayList<Property<*>>) : Thing(), Colourless, Unalterable, Subsistent {
    var external: ArrayList<Property<*>>? = null
    var form: TheObjectForm<*>? = null
    var logicForm: LogicForm<*>? = null

    var sign: Sign<*>

    var realName: ArrayList<Symbol>? = null

    var formalConcept: FormalConcepts? = null

    fun equals(obj: TheObject): Boolean {
        return logicForm == obj.logicForm
    }

    fun signify(sign: Sign<*>) {
        this.sign = sign
    }
}
