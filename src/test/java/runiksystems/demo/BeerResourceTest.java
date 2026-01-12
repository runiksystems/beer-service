package runiksystems.demo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;

@QuarkusTest
public class BeerResourceTest {

    @Test
    public void testBeerEndpoint() {
        given()
                .when().get("/beers")
                .then()
                .statusCode(200)
                .body("$", hasItems("IPA", "Stout", "Lager", "Saison"));
    }
}
