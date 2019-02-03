package com.juhnowski.onthology

import java.util.ArrayList

abstract class GeneralProposition : Proposition() {
    internal var form: GeneralPropositionForm? = null
    fun isIndependent(proposition: GeneralProposition): Boolean {
        return this.form!!.truthArguments != proposition.form!!.truthArguments
    }
}
