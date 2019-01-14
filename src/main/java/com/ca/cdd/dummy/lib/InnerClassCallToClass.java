package com.ca.cdd.dummy.lib;

public class InnerClassCallToClass extends Library {

    private CallPrintStr callPrintStr;

    public InnerClassCallToClass(CallPrintStr callPrintStr) {
        this.callPrintStr = callPrintStr;
    }



    public void print(String s) {
        callPrintStr.innerClass(s);
    }

    private static String NAME = new CallPrintStr().innerClass("CallPrintStr");

    @Override
    public String getName() {
        return NAME;
    }

    public static class CallPrintStr {

         public String innerClass (String s) {
             System.out.println(s);
             return s;
         }

    }
}


