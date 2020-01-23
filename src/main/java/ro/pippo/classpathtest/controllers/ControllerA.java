package ro.pippo.classpathtest.controllers;

import ro.pippo.controller.Controller;
import ro.pippo.controller.GET;
import ro.pippo.controller.Path;
import ro.pippo.controller.Produces;

@Path("/a")
public class ControllerA extends Controller {

	@GET
    @Produces(Produces.TEXT)
    public String sayHello() {
        return "Hello A!";
    }
	
}
