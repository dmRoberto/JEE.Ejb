package views.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import controllers.UseCaseFulController;
import controllers.UseCaseLessController;

@Named
@RequestScoped
public class Ejb {

    @EJB
    private UseCaseLessController useCaseLessController;
    
    @Inject
    private UseCaseFulController useCaseFulController;

    private String value;

    private List<String> values;

    public String stateless() {
        value += ":" + this.useCaseLessController.echo(value);
        return null;
    }
    
    public String stateful(){
        useCaseFulController.addItem(value);
        values = useCaseFulController.items();
        return null;
    }
    
    public String remove(){
        useCaseFulController.remove();
        return null;
    }

    public void setUseCaseFulController(UseCaseFulController useCaseFulController) {
        this.useCaseFulController = useCaseFulController;
    }
    
    public void setUseCaseLessController(UseCaseLessController useCaseLessController) {
        this.useCaseLessController = useCaseLessController;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

}
