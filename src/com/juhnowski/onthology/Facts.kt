package com.juhnowski.onthology

abstract class Facts(structure: Structure<*>) : Reality(structure) {
    var facts: Totality<Fact>? = null
}
