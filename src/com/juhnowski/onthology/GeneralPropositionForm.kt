package com.juhnowski.onthology

import java.util.ArrayList

class GeneralPropositionForm : Form<*>() {
    internal var truthArguments: TruthArguments? = null
    internal var function: TruthFunction? = null
    internal var elementary: ArrayList<ElementaryProposition>? = null
    internal var variable: Variable? = null
}
