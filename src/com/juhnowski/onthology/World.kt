package com.juhnowski.onthology

import com.juhnowski.onthology.logical.LogicalPicture

import java.util.ArrayList

abstract class World : Reality {
    private val facts: Facts
    internal var structure: Structure<*>
    var picture: WorldPicture? = null
    var description: ArrayList<ElementaryProposition>? = null

    var form: Form<Substance<TheObject>>? = null

    var materialProperties: MaterialProperties? = null

    var unalterableForm: Form<*>? = null

    private constructor(structure: Structure<*>) : super(structure) {
        this.structure = structure
        isTheCase = true
    }

    constructor(structure: Structure<*>, facts: Facts) : super(structure) {
        this.structure = structure
        isTheCase = true
        this.facts = facts
    }

    abstract fun scetch(): LogicalPicture<*>

}
