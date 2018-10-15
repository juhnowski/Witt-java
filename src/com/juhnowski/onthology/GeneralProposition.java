package com.juhnowski.onthology;

import java.util.ArrayList;

public abstract class GeneralProposition extends Proposition {
    GeneralPropositionForm form;
    public boolean isIndependent(GeneralProposition proposition){
        return !this.form.truthArguments.equals(proposition.form.truthArguments);
    }
}
