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
// DummyApp
// DummyApp
// 084ebae8-90a6-4d36-ac08-b1be5ff1e3f5