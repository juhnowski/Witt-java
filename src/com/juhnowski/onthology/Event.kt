package com.juhnowski.onthology

abstract class Event : GeneralProposition() {
    var isFuture: Boolean = false
    var isFresent: Boolean = false
    abstract fun occurs()
}
