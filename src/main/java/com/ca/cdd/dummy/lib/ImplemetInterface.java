package com.ca.cdd.dummy.lib;

public class ImplemetInterface extends Library implements InterfaceClass {

    private static String NAME = "ImplemetInterface";

    @Override
    public Integer useAbstractInInterface() {
        return 10;
    }

    @Override
    public String interfaceStingMethod() {
        return "implementing interface string method";
    }


    public static void main(String[] args) {

        ImplemetInterface d = new  ImplemetInterface();
        System.out.println("selected number is: " + d.useAbstractInInterface());

        ImplemetInterface s = new ImplemetInterface();
        System.out.println(s.interfaceStingMethod());

    }

    @Override
    public String getName() {
        return NAME;
    }
}