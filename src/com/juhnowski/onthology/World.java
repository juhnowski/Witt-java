package com.juhnowski.onthology;

import java.util.ArrayList;

public abstract class World extends Reality{
    private Facts facts;
    private World(){
        isTheCase = true;
    }
    public World(Facts facts){
        this.facts = facts;
    }

    public abstract Picture scetch();

    public class Picture {
        public boolean value;
        public boolean isImagined;
        public boolean isTheReal;
    }

    public Form<Substance<TheObject>> form;

    public MaterialProperties materialProperties;

    public Form unalterableForm;
}
