package io.fabric8;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws IOException {
        LoadAndModifyKubeConfig loadAndModifyKubeConfig = new LoadAndModifyKubeConfig();
        loadAndModifyKubeConfig.loadAndModify();
        return "Hello RESTEasy";
    }
}