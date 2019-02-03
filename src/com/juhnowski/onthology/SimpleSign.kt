package com.juhnowski.onthology

import java.util.ArrayList

class SimpleSign : PropositionalSign() {
    internal var element: Element? = null
    override fun express(thought: Thought<*>): Thought<*>? {
        return null
    }

    override fun correspond(conf: Configuration<TheObject>?): Configuration<SimpleSign>? {
        return null
    }
}
