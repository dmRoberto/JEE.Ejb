package views.beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Named
@SessionScoped
public class ValidationBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Max(10)
    @Min(3)
    private int age;

    @Digits(integer = 3, fraction = 0)
    private double quantity;

    @Size(min = 4, max = 6, message = "entre 4 yyy 6")
    private String message;

    @DecimalMax("30.00")
    private double offer;
    
    public ValidationBean() {
        super();
    }

    public String process() {
        return null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getOffer() {
        return offer;
    }

    public void setOffer(double offer) {
        this.offer = offer;
    }

}
