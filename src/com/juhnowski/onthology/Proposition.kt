package com.juhnowski.onthology

import com.juhnowski.onthology.logical.Syntax

import java.util.ArrayList
import java.util.HashMap

abstract class Proposition : Picture<Reality>(), Syntax {
    var itFollowsFrom: Proposition? = null
    var isTrue: Boolean = false
    var sense: Sense? = null
    var statement: Statement? = null
    var projection: Projection? = null
    var formOfSense: Form<Sense>? = null
    var propositionalVariable: PropositionalVariable? = null
    var names: HashMap<SimpleSign, TheObject>? = null
    var statesOfAffairs: StatesOfAffairs? = null

    var sign: PropositionalSign = object : PropositionalSign(statesOfAffairs!!) {
        override fun express(thought: Thought<*>): Thought<*> {
            return thought
        }

        override fun correspond(conf: Configuration<TheObject>?): Configuration<SimpleSign>? {
            return null
        }
    }

    internal var place: LogicalPlace? = null

    var internal: ArrayList<Property<*>>? = null

    var formalProperty: Property<*>? = null

    var internalRelations: Series<Relation<Proposition>>? = null

    var operations: ArrayList<Operation>? = null

    fun descript(expression: Expression<*>) {
        this.propositionalVariable!!.descript(expression)
    }

    abstract fun show(): Sense

    abstract fun makAgree(reality: Reality): Boolean

    abstract fun drawInferences(): Inferences

}