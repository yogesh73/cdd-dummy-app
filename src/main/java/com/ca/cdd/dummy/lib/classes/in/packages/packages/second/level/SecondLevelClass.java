package com.ca.cdd.dummy.lib.classes.in.packages.packages.second.level;

import com.ca.cdd.dummy.lib.Library;

public class SecondLevelClass extends Library {

    private static String NAME = "SecondLevelClass";

    public String secondLevelClass () {

        return "Class in Package Tree Second Hierarchy";
    }

    @Override
    public String getName() {
        return NAME;
    }
}
