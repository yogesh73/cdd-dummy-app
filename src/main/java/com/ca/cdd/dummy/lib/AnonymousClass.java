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

// BUx42
// CaQlg
// KnCd2
// Mj3CZ
// bzUER
// H0p7C
// SO8P9
// XkPLw
// vuilY
// NiE8T
// enZwv
// fHR1H
// U2d73
// QIFGQ
// dLmgU
// TYHOM
// ezmV2
// aI3w3
// RQD4w
// Z3QN8
// mbMNW
// nR7aS
// ig4Ib
// qSQ9d
// S3HU2
// 5ys9Y
// LeHlI