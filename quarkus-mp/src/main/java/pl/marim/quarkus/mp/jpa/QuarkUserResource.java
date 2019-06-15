package pl.marim.quarkus.mp.jpa;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("/quarkuser")
public class QuarkUserResource {

	@Inject
	QuarkUserJpaService userService;
	
	@GET
	@Path("/{name}")
	public void adduser(@PathParam("name") String name) {
		userService.createQuarkUser(name);
	}
	
	@GET
	public List<QuarkUser> list() {
		return userService.listUsers();
	}
}
