package ro.pippo.classpathtest.controllers.b;

import ro.pippo.controller.Controller;
import ro.pippo.controller.GET;
import ro.pippo.controller.Path;
import ro.pippo.controller.Produces;

@Path("/b")
public class ControllerB extends Controller {

	@GET
    @Produces(Produces.TEXT)
    public String sayHello() {
        return "Hello B!";
    }
	
}
