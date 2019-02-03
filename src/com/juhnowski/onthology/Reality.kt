package com.juhnowski.onthology

import java.util.ArrayList

open class Reality(var structure: Structure<*>) : Fact() {

    var positive: ArrayList<PositiveFact>? = null
    var negative: ArrayList<NegativeFact>? = null

    internal var sense: Sense? = null
    var pictures: ArrayList<Picture<*>>? = null

    var completelyDescription: ArrayList<Proposition>? = null

}
