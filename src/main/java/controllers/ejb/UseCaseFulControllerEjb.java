package controllers.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remove;
import javax.ejb.Stateful;

import controllers.UseCaseFulController;

@Stateful
public class UseCaseFulControllerEjb implements UseCaseFulController {

    private List<String> list;

    public UseCaseFulControllerEjb() {
        list = new ArrayList<>();
    }

    @Override
    public void addItem(String item) {
        list.add(item);
    }

    @Override
    public List<String> items() {
        return list;
    }

    @Override
    @Remove
    public void remove() {
        list = null;
    }
}
