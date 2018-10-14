package com.juhnowski.onthology;

import com.juhnowski.onthology.logical.LogicalPicture;

import java.util.ArrayList;

public abstract class World extends Reality{
    private Facts facts;
    Structure structure;
    private World(Structure structure){
        super(structure);
        this.structure = structure;
        isTheCase = true;
    }

    public World(Structure structure, Facts facts){
        super(structure);
        this.structure = structure;
        isTheCase = true;
        this.facts = facts;
    }

    public abstract LogicalPicture scetch();

    public Form<Substance<TheObject>> form;

    public MaterialProperties materialProperties;

    public Form unalterableForm;
}
