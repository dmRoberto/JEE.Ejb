package controllers.ejb;

import java.util.Date;

import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import controllers.UseCaseSingletonController;

@Singleton
@Startup // Eager
@DependsOn("Util")
public class UseCaseSingletonControllerEjb implements UseCaseSingletonController {
    private String id;

    public UseCaseSingletonControllerEjb() {
        id = String.valueOf(new Date().getTime());
    }

    @Override
    public String id() {
        return id;
    }

}
