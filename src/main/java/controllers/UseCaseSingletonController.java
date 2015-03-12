package controllers;

import javax.ejb.Local;

@Local
public interface UseCaseSingletonController {
    String id();
}
