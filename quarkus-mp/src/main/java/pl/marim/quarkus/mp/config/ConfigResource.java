package pl.marim.quarkus.mp.config;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/configuration")
public class ConfigResource {

	@Inject
	ApplicationConfigService appConfig;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ConfigData currentConfig() {
        return appConfig.getCurrentConfig();
    }
}