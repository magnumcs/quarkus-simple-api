package com.portifolio.magnum.quarkus.resource;

import com.portifolio.magnum.quarkus.dto.ProductDTO;
import com.portifolio.magnum.quarkus.service.ProductService;
import org.jboss.resteasy.annotations.Body;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResource {

    @Inject
    private ProductService productService;

    @POST
    @Path("/")
    @Produces({"application/json"})
    public Response persistProduct(ProductDTO productDTO) {
        productService.saveProduct(productDTO);
        return Response.ok(productDTO).status(201).build();
    }

}
