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



// 05101552

// DummyApp
// DummyApp
// DummyApp
// DummyApp
// 3304e2cf-2ba6-46d2-a20f-4374b4f3c22b