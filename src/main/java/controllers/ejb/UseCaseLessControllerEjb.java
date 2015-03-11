package controllers.ejb;

import javax.ejb.Stateless;

import controllers.UseCaseLessController;

@Stateless
public class UseCaseLessControllerEjb implements UseCaseLessController {

    @Override
    public String echo(String value) {
        return value;
    }

}
