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

// cfNsm
// FXhI2
// W8jhG
// pbqVW
// YDaQI
// inKTY
// ISzvG
// XOBsg
// hkZqn
// DPBlZ
// HvZRK
// LLf8C
// MipI7
// WS26L
// U3R8m
// VwgMA
// oYFM0
// 2Gftg
// Rcj0g
// EkW65
// PsoX4
// ODcRk
// 6PcTI
// chX9m
// FM42Q
// 704zB
// DRwOg
// BXV97
// ZV47q
// paZff
// YUlDR
// QzTnD
// qi65u
// YPLlX
// tPjzy
// 6df0I
// CgPfc
// hDmPL
// x3Jr8