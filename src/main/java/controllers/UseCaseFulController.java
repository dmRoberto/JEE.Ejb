package controllers;

import java.util.List;

import javax.ejb.Local;

@Local
public interface UseCaseFulController {
    void addItem(String item);
    List<String> items();
    void remove();
}
