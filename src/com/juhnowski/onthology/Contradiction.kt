package com.juhnowski.onthology

abstract class Contradiction : ElementaryProposition() {
    init {
        isTrue = false
        sense = null
    }
}
