package com.juhnowski.onthology

import java.lang.reflect.Array
import java.util.ArrayList

abstract class PropositionalSign : Fact {
    var definitions: ArrayList<PropositionalSign>? = null
    var configuration: Configuration<SimpleSign>
    abstract fun express(thought: Thought<*>): Thought<*>

    constructor(statesOfAffairs: StatesOfAffairs) {
        configuration = correspond(statesOfAffairs.configuration)
    }

    constructor() {}

    abstract fun correspond(conf: Configuration<TheObject>?): Configuration<SimpleSign>
}
