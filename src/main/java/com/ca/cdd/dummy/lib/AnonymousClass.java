package com.ca.cdd.dummy.lib;

public class AnonymousClass extends Library implements InterfaceClass {
 
  private static String NAME = "AnonymousClass";
 
  InterfaceClass anonymusMethos = new InterfaceClass() {
        @Override
        public Integer useAbstractInInterface() {
            return null;
         
        }

        @Override
        public String interfaceStingMethod() {
            return "Returned From Anonymous Class ";
        }
    };

    @Override
    public Integer useAbstractInInterface() {
        return anonymusMethos.useAbstractInInterface();
    }

    @Override
    public String interfaceStingMethod() {
        return anonymusMethos.interfaceStingMethod();
    }
    
    @Override
    public String getName() {
        return NAME;
    }
}

// b139abc52

// DummyApp

// 3098e4f7-2ea0-4cde-954b-653b7c030280