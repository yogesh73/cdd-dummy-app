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

// DummyApp
// OnlineBanking
// OnlineBanking
// Xzz07
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
// f1535a6c-878e-4283-8c15-bdc7dc7abde4