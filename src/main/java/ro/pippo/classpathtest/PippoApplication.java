package ro.pippo.classpathtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ro.pippo.controller.ControllerApplication;

/**
 * A simple Pippo application.
 *
 * @see ro.pippo.classpathtest.PippoLauncher#main(String[])
 */
public class PippoApplication extends ControllerApplication {

    private final static Logger log = LoggerFactory.getLogger(PippoApplication.class);

    @Override
    protected void onInit() {
        getRouter().ignorePaths("/favicon.ico");
        
        // TODO: ControllerB is only recognized when the application is run
        // by the JAR. It is not recognized when the application is started
        // by an IDE, Eclipse for example, or via the command line with
        // "mvn clean compile exec:java"
        addControllers("ro.pippo.classpathtest.controllers");
        
        // addControllers(ControllerA.class.getPackage().getName());
        // addControllers(ControllerB.class.getPackage().getName());

        // send 'Hello World' as response
        GET("/", routeContext -> routeContext.send("Hello World"));
    }

}
