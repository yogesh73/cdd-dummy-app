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




// DummyApp
// DummyApp
// 64df087b-baa2-4ad4-abf9-859c4c36ab5e
// b0f973cb-465d-486d-9cda-f73ff763b486
// dc3b3ea4-4e84-448c-94d9-297aac48d60a
// 47317216-59b9-4427-b786-9ad1a1e2d424
// dcfc0380-efe6-4456-8a9a-dc526300b12f
// def659f2-34da-4954-96cd-edac6375850a
// DummyApp
// DummyApp
// d83f5d57-0d0c-4273-915b-18ac41f56060