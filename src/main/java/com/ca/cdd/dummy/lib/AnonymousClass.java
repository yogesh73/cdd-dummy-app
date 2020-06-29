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
// 596919dc-257f-4dd7-843d-177fcee1efc3
// 67455940-a816-4902-845b-56067f56a453
// ba29ff8c-0b42-488d-af50-d83a2e5d931b
// 883ca47c-cdb7-448f-b656-7098effec1de
// xm0YZ
// DummyApp