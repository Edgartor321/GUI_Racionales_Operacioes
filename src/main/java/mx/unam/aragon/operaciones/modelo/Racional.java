package mx.unam.aragon.operaciones.modelo;

public class Racional {
    private Integer numerador;
    private Integer denominador;

    public Racional() {
    }

    public Racional(Integer numerador, Integer denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Integer getNumerador() {
        return numerador;
    }

    public void setNumerador(Integer numerador) {
        this.numerador = numerador;
    }

    public Integer getDenominador() {
        return denominador;
    }

    public void setDenominador(Integer denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador+"/"+denominador;
    }
}
