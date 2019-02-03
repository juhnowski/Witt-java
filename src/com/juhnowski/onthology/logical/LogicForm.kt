package com.juhnowski.onthology.logical

import com.juhnowski.onthology.Form
import com.juhnowski.onthology.Sign

open class LogicForm<T> : Form<T>() {
    var sign: Sign<*>? = null
}
