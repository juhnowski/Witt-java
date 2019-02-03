package com.juhnowski.onthology

import com.juhnowski.onthology.logical.LogicalCoordinates

class LogicalPlace : Place() {
    internal var sign: PropositionalSign? = null
    internal var coordinates: LogicalCoordinates? = null
}
