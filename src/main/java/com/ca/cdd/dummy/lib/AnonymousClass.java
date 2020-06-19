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

// DummyApp
// DummyApp
// c3f74430-226e-44cc-9334-4650c7d704e2