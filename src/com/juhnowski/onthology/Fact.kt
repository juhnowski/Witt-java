package com.juhnowski.onthology

open class Fact : All() {
    var allPossibilities: Possibilities<*>? = null
    internal var structure: Structure<Structure<AtomicFact>>? = null
}
