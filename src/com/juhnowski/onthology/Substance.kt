package com.juhnowski.onthology

import java.util.ArrayList

class Substance<T> : ArrayList<T>() {
    var form: Form<*>? = null
    var content: Content? = null
}
