package com.portifolio.magnum.quarkus.resource;

import com.google.gson.Gson;
import com.portifolio.magnum.quarkus.dto.ProductDTO;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static com.portifolio.magnum.quarkus.mock.ProductMock.*;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
public class ProductResourceTest {

    @Test
    public void deveRealizarPostDoProduto() {
        Gson gson = new Gson();
        ProductDTO product = createProductDTO();
        String jsonInString = gson.toJson(product);

        given()
                .contentType(ContentType.JSON)
                .body(jsonInString)
                .post("/products/")
                .then()
                .statusCode(201);
    }

}
