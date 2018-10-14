package com.juhnowski.onthology;

public class AtomicFact extends Fact{
    public  boolean isExist;
    public StatesOfAffairs statesOfAffairs;
    public Structure<Configuration<TheObject>> structure;

    public AtomicFact(){
        isTheCase = true;
    }

    public AtomicFact(Structure structure){
        super();
        this.structure = structure;
    }

}
