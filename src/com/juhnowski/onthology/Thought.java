package com.juhnowski.onthology;

import com.juhnowski.onthology.logical.LogicalPicture;

/*
Логический образ фактов есть мысль
 */
public abstract class Thought<T> extends LogicalPicture<T> {
    Possibility<Facts> possibility;
    Proposition proposition;
}
