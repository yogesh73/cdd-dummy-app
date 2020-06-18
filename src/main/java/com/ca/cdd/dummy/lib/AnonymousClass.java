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



// test2346789555

// DummyApp
// DummyApp
// DummyApp
// DummyApp
// DummyApp
// 2f3dc895-ba72-43de-9efc-a665e27b35ad