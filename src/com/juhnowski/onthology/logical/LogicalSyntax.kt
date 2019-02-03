package com.juhnowski.onthology.logical

import com.juhnowski.onthology.Rule

import java.util.ArrayList

abstract class LogicalSyntax : Syntax {
    var rules: ArrayList<Rule>? = null
}
