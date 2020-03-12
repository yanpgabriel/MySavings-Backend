package com.hybridnetwork.rest;

import com.hybridnetwork.dto.ContaDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Path("contas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContaRest {

    @GET
    public Response listarTodos() {
        List<ContaDTO> todas = Arrays.asList(
                new ContaDTO(1, "Nu", new BigDecimal("0.01"))
        );
        return Response.ok(todas).build();
    }

}
