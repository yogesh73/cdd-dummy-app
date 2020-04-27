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





// uPAXC
// 96d039c5-b6b3-47cc-9196-c916545c3449
// DummyApp
// DummyApp

// DummyApp
// cCX1N