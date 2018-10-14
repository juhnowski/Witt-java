package com.juhnowski.onthology;

public abstract class AtomicFact extends Fact{
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

    public abstract Thought getPicture();

}
