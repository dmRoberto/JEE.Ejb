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
    private int edad;

    @Digits(integer = 3, fraction = 0)
    private double valor;

    @Size(min = 4, max = 6, message = "entre 4 yyy 6")
    private String mensaje;

    @DecimalMax("30.00")
    private double descuento;

    public ValidationBean() {
        super();
    }

    public String process() {
        return null;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
