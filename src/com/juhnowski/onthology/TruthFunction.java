package com.juhnowski.onthology;

import java.util.ArrayList;

public abstract class TruthFunction {
    public TruthArguments truthArguments;
    public abstract Series<TruthFunction> order();
    public TruthGround<TruthFunction> truthGround;
}
