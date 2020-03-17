package com.hybridnetwork.rest;

import com.hybridnetwork.service.ContaService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("contas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContaRest {

    @Inject
    ContaService contaService;
    
    @GET
    public Response listarTodos() {
        return Response.ok(contaService.list()).build();
    }

}
