package com.juhnowski.onthology

abstract class Self {
    var logicalSpace: com.juhnowski.onthology.logical.Space? = null
    abstract fun createPicture(facts: Facts): Picture<*>
}
