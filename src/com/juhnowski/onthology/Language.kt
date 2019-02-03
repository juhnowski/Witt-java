package com.juhnowski.onthology

import java.util.ArrayList

abstract class Language : Totality<ArrayList<Proposition>>() {
    var translate: Rule? = null
}
