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
// 3d0b6315-5da6-493d-a294-64c8babdc456