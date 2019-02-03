package com.juhnowski.onthology

open class Form<T> : Possibility<Structure<T>>() {
    internal var properties: Properties<*>? = null
}
