package controllers.ejb;

import java.util.Date;

import javax.ejb.Stateless;

import controllers.UseCaseLessController;

@Stateless
public class UseCaseLessControllerEjb implements UseCaseLessController {
    private String id;

    public UseCaseLessControllerEjb() {
        id = "" + new Date().getTime();
    }

    @Override
    public String echo(String value) {
        return value + "(" + id + ")";
    }

}
