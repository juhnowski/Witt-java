package com.juhnowski.onthology

import java.util.ArrayList

abstract class Statement {
    private val complexes: Complexes
    private val constituents: Complexes? = null
    var hadSense: Boolean = false

    constructor() {}
    constructor(complexes: Complexes) {
        this.complexes = complexes
    }

    abstract fun resolve(): Result

    inner class Result {
        var statementsAboutConstituents: ArrayList<Statement>? = null
        var propositionsThatDescribeTheComplexesCompletely: ArrayList<Statement>? = null
    }
}
