package com.juhnowski.onthology

abstract class AtomicFact : Fact {
    var isExist: Boolean = false
    var statesOfAffairs: StatesOfAffairs? = null
    var structure: Structure<Configuration<TheObject>>

    abstract val picture: Thought<*>

    constructor() {
        isTheCase = true
    }

    constructor(structure: Structure<*>) : super() {
        this.structure = structure
    }

}
