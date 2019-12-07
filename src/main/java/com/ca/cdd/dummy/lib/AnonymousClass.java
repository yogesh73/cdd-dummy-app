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
// cdf90953-7b8d-4a54-9e87-4668d9a24132