package com.juhnowski.onthology

import java.util.ArrayList
import java.util.HashMap

abstract class ProbabilityProposition : GeneralProposition() {
    internal var units: ArrayList<Unit>? = null

    inner class Unit {
        internal var propositions: ArrayList<Proposition>? = null
        internal var event: Event? = null
        internal var degree: Double? = null
    }
}
