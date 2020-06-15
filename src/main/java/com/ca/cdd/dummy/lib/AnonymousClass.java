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




// 36b482c7-0242-440a-b118-dbe4858612b7
// 0cd7f48d-7e9b-4992-ba6f-7505878ffec4
// 513e144a-b17f-4917-a1f4-1b7cd88d5b70
// QCJKx