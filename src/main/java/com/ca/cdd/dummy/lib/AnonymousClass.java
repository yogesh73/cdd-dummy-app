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
// class2223333

// classaas222saas

// 57aFna

// FBsVj
// UvuwQ
// d33113ff-0c80-47cf-9a1f-1c34fb121309
// 068758ff-a894-4620-a1a5-7ad46f615072
// b178d309-b91a-45d6-a6dc-74e2e6ee11c1
// 6c8a2ecd-792e-4bca-9f18-5da62d853882
// DummyApp
// fa36dc3d-f2e9-4cce-9ee8-f593880b8677

// uYDKZ
// DummyApp