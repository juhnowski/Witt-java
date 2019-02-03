package com.juhnowski.onthology

import java.util.ArrayList

abstract class TruthOperation : Operation() {
    abstract fun truthFunctionFactory(propositions: ArrayList<ElementaryProposition>): TruthFunction
}
