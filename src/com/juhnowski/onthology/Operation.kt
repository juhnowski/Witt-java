package com.juhnowski.onthology

import java.util.ArrayList

abstract class Operation : Expression<Relation<PropositionStructure>>() {
    internal var result: Proposition? = null
    abstract fun execute(propositions: ArrayList<Proposition>): Proposition
}
