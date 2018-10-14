package com.juhnowski.onthology;

import java.util.ArrayList;

public class Reality extends Fact{
    public Structure structure;
    public Reality(Structure structure){
        this.structure = structure;
    }

    public ArrayList<PositiveFact> positive;
    public ArrayList<NegativeFact> negative;
}
