package com.juhnowski.onthology

import java.util.ArrayList

abstract class TruthFunction {
    var truthArguments: TruthArguments? = null
    var truthGround: TruthGround<TruthFunction>? = null
    abstract fun order(): Series<TruthFunction>
}
