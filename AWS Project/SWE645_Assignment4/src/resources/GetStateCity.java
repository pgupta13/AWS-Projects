package resources;

import java.util.*;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/locations")
public class GetStateCity {

	Map<Integer, StateCity> locations;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{zip}")
	public String LookUp(@PathParam("zip") int zip) {

		StateCity matchedLocation = locations.get(zip);

		String cityState = new String(matchedLocation.getCity() + "," + matchedLocation.getState());

		return cityState;
	}

	public GetStateCity() {
		super();

		locations = new HashMap<Integer, StateCity>();
		locations.put(22312, new StateCity("VA", "Alexandria", 22312));
		locations.put(22030, new StateCity("VA", "Fairfax", 22030));
		locations.put(20148, new StateCity("VA", "Aushburn", 20148));
		locations.put(22301, new StateCity("MD", "Tysons Corner", 22301));
	}
	
}
