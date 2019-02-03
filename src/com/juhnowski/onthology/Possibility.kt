package com.juhnowski.onthology

import java.util.ArrayList

open class Possibility<T> {
    var stateOfAffairs: ArrayList<T> = ArrayList()
    internal var value: Double = 0.toDouble()
}
