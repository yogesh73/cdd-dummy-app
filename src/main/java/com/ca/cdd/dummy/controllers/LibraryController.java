package com.ca.cdd.dummy.controllers;


import com.ca.cdd.dummy.lib.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("libraries")
@Produces(MediaType.APPLICATION_JSON)
// @Consumes(MediaType.APPLICATION_JSON)
public class LibraryController {


    @GET
    public String getLibraries() {
        Library[] libraries = { new CentralLibrary(), new ComicsLibrary(), new ExactSciencesLibrary(), new InnerClassCallToClass(new InnerClassCallToClass.CallPrintStr()) };
        StringBuffer sb = new StringBuffer("[ ");
        for (short i=0; i<4; i++) {
            sb.append("'").append(i).append("' : '").append(libraries[i].getType()).append("'");
            if (i!=3) {
                sb.append(", ");
            }
        }
        sb.append(" ]");

        return sb.toString(); // "[ 'Central', 'Comics', 'Exact sciences' ]";
    }

    @GET @Path("{id}")
    public String getLibraries(@PathParam("id") String id) {
        if ("0".equals(id)) {
            return new CentralLibrary().getType();
        }
        if ("1".equals(id)) {
            return new ComicsLibrary().getType();
        }
        if ("2".equals(id)) {
            return new ExactSciencesLibrary().getType();
        }
        if ("3".equals(id)) {
            InnerClassCallToClass.CallPrintStr callToInnerClass = new InnerClassCallToClass.CallPrintStr();
            return callToInnerClass.innerClass("Calling to Inner Class, make sure the class name returned From Agent 3");
        }
        if ("4".equals(id)) {
            InnerClassCallToClass.CallPrintStr callToInnerClass = new InnerClassCallToClass.CallPrintStr();
            return callToInnerClass.innerClass("Calling to Inner Class, make sure the class name returned From Agent 4");
        }
        return "I don't know what you are talking about? Give me a normal id!";
    }

    public static void main(String[] args) {

    }
}