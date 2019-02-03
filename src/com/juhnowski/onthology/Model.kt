package com.juhnowski.onthology

import java.util.ArrayList

open class Model<T> : Fact() {
    var propositions: ArrayList<Proposition>? = null
}
