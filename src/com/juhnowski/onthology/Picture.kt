package com.juhnowski.onthology

import com.juhnowski.onthology.logical.LogicalPicture
import com.juhnowski.onthology.logical.Situation

import java.util.ArrayList
import java.util.HashMap

abstract class Picture<T> : LogicalPicture<T>() {
    internal var pictorialForm: WorldForm<Element>? = null
    abstract fun depict(reality: T): ArrayList<AtomicFact>

}
