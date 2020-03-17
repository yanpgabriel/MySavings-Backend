package com.hybridnetwork.rest;

import com.hybridnetwork.dto.ContaDTO;
import com.hybridnetwork.service.ContaService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("contas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContaRest {

    @Inject
    ContaService contaService;
    
    @POST
    public Response salvar(ContaDTO dto) {
        ContaDTO dtoSalvo = contaService.salvar(dto);
        if (dtoSalvo != null) {
            return Response.ok(dtoSalvo).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).entity(dtoSalvo).build();
    }

    @PUT
    public Response atualizar(ContaDTO dto) {
        ContaDTO dtoSalvo = contaService.atualizar(dto);
        if (dtoSalvo != null) {
            return Response.ok(dtoSalvo).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).entity(dtoSalvo).build();
    }
    
    @GET
    public Response listarTodos() {
        return Response.ok(contaService.list()).build();
    }

    @DELETE
    @Path("/{idConta}")
    public Response deletar(@PathParam("idConta") Integer idConta) {
        boolean deletado = contaService.deletar(idConta);
        if (deletado) {
            return Response.ok(deletado).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).build();
    }
    
}
