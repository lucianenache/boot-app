package app.rest;

import app.services.MainService;
import org.apache.log4j.Logger;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Component
@Path("/application")
@Secured("ROLE_USER")
public class MainController {

    private static final Logger LOG = Logger.getLogger(MainController.class);

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GET
    @Produces("application/json")
    @Path("/status")
    public Response requestAllImageStat() throws IOException, ExecutionException, InterruptedException {
        Map<Integer, String> allItems = mainService.getAllItems();
        Response.Status responseStatus;
        if (!allItems.isEmpty()) {
            LOG.info("Items are available");
            responseStatus = Response.Status.OK;
        } else {
            LOG.info("No items were present in the service");
            responseStatus = Response.Status.NOT_FOUND;
        }
        return Response.status(responseStatus).entity(allItems).build();
    }

}
