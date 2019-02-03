package com.juhnowski.onthology

import java.util.HashMap

abstract class ElementaryProposition : Proposition() {
    internal var truthPossibilities: HashMap<Boolean, ElementaryProposition>? = null
}
