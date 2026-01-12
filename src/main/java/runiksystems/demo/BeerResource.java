package runiksystems.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/beers")
public class BeerResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> list() {
        return List.of("IPA", "Stout", "Lager", "Saison");
    }
}
