package com.tvestergaard.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("resource")
public class MyResource
{

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt()
    {
        return "Hello world";
    }
}
