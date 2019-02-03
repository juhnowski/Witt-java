package com.juhnowski.onthology

import com.juhnowski.onthology.logical.LogicalPicture

/*
Логический образ фактов есть мысль
 */
abstract class Thought<T> : LogicalPicture<T>() {
    internal var possibility: Possibility<Facts>? = null
    internal var proposition: Proposition? = null
}
