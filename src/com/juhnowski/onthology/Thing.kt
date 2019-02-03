package com.juhnowski.onthology

open class Thing : All {

    internal var possibilities: Possibilities<AtomicFact>

    internal var properties: Properties<*>? = null

    internal constructor() {
        isTheCase = true
    }

    constructor(possibilities: Possibilities<*>) {
        this.possibilities = possibilities
    }


}
