package com.juhnowski.onthology

import java.util.ArrayList

abstract class Symbol : Persiptable {

    internal var signs: ArrayList<PropositionalSign>? = null
    internal var language: Language? = null

    var expression: Expression<FormalProperties>? = null

    override fun perceive(): PropositionalSign? {
        return null
    }

    fun signify(sign: PropositionalSign) {}
}
