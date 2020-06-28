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
// DummyApp
// DummyApp
// DummyApp
// DummyApp
// 2b5198f3-0c74-49aa-b7e3-b1885c80309a
// 2f24a77b-01a0-4c16-8b33-6beeea8bb82c
// b1939af2-0b1b-45dc-a737-98580f5e460f