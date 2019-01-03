package com.ca.cdd.dummy.controllers;


import com.ca.cdd.dummy.lib.CentralLibrary;
import com.ca.cdd.dummy.lib.ComicsLibrary;
import com.ca.cdd.dummy.lib.ExactSciencesLibrary;
import com.ca.cdd.dummy.lib.Library;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("libraries")
@Produces(MediaType.APPLICATION_JSON)
// @Consumes(MediaType.APPLICATION_JSON)
public class LibraryController {


    @GET
    public String getLibraries() {
        Library[] libraries = { new CentralLibrary(), new ComicsLibrary(), new ExactSciencesLibrary() };
        StringBuffer sb = new StringBuffer("[ ");
        for (short i=0; i<3; i++) {
            sb.append("'").append(i).append("' : '").append(libraries[i].getType()).append("'");
            if (i!=2) {
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

        return "I don't know what you are talking about? Give me a normal id!";
    }
}