package com.juhnowski.onthology

abstract class Sense : Possibilities<StatesOfAffairs>() {

    abstract fun agreement(sense: Sense): Boolean
}
