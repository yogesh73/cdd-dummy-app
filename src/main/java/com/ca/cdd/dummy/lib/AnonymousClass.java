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
// 7517337e-322d-4b72-bf30-8e5bfaa1c633