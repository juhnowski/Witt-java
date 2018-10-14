package com.juhnowski.onthology;

public class TotalityOfAllFacts {
    public Facts facts = new Facts();

    private static volatile TotalityOfAllFacts instance;

    public static TotalityOfAllFacts getInstance() {
        TotalityOfAllFacts localInstance = instance;
        if (localInstance == null) {
            synchronized (TotalityOfAllFacts.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new TotalityOfAllFacts();
                }
            }
        }
        return localInstance;
    }
}
