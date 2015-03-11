package controllers;

import javax.ejb.Local;

@Local
public interface UseCaseLessController {
    String echo(String value);
}
