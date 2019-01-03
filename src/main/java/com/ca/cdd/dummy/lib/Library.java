package com.ca.cdd.dummy.lib;

public abstract class Library {
    private static String SUFFIX = "Library";

    public abstract String getName();

    public String getType() {
        return getName() + SUFFIX;
    }
}