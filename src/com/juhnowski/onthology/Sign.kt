package com.juhnowski.onthology

abstract class Sign<T> : PropositionalSign() {
    var mode: SignificationMode? = null
    var significantUse: Any? = null
    var logicalSyntacticApplication: Any? = null
    var instance: T? = null
}
