package com.juhnowski.onthology.logical

import com.juhnowski.onthology.*

import java.util.HashMap

abstract class LogicalPicture<T> : Model<T> {
    var value: Boolean = false
    var isImagined: Boolean = false
    var isTheReal: Boolean = false
    var isCorrect: Boolean = false

    internal var situation: Situation? = null
    internal var structure: Structure<*>
    internal var elements: HashMap<Element, TheObject>? = null
    internal var pictorialForm: LogicForm<Element>? = null
    internal var sense: Sense? = null

    var pictorialRelationship: HashMap<Element, Thing>? = null


    constructor() {}
    constructor(structure: Structure<*>) {
        this.structure = structure
    }

    fun represent(): Sense? {
        return sense
    }

    abstract fun agreement(realitySense: Sense): Boolean


}
