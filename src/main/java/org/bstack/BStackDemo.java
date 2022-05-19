package org.bstack;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/BStackDemo")
	public class BStackDemo {
		@GET
		@Produces("application/xml")
		public String start() {
			String result = "@Produces(\"application/xml\") Output \n\n" ;
					return "<service>"  + result + "</service>";		}
	 
}
