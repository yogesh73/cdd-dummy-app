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
// 785bd4bb-9c1e-4fe9-9401-9e50ced3f4e3