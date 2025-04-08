package mx.unam.aragon.operaciones.modelo;

public class Racionales implements Operaciones{

    @Override
    public Object suma(Object objUno, Object objDos) {
        Racional r1=(Racional) objUno;
        Racional r2=(Racional) objDos;
        Racional r3=new Racional();
        if (r1.getDenominador()!=r2.getDenominador()) {
            r3.setNumerador(r1.getNumerador() * r2.getDenominador() + r1.getDenominador() * r2.getNumerador());
            r3.setDenominador(r1.getDenominador() * r2.getDenominador());
        }else{
            r3.setNumerador(r1.getNumerador()+r2.getNumerador());
            r3.setDenominador(r1.getDenominador());
        }
        return r3;
    }

    public Object resta(Object objUno, Object objDos) {
        Racional r1=(Racional) objUno;
        Racional r2=(Racional) objDos;
        Racional r3=new Racional();
        if (r1.getDenominador()!=r2.getDenominador()) {
            r3.setNumerador(r1.getNumerador() * r2.getDenominador() - r1.getDenominador() * r2.getNumerador());
            r3.setDenominador(r1.getDenominador() * r2.getDenominador());
        }else{
            r3.setNumerador(r1.getNumerador()-r2.getNumerador());
            r3.setDenominador(r1.getDenominador());
        }
        return r3;
    }
    public Object producto(Object objUno, Object objDos) {
        Racional r1=(Racional) objUno;
        Racional r2=(Racional) objDos;
        Racional r3=new Racional();
        r3.setNumerador(r1.getNumerador()*r2.getNumerador());
        r3.setDenominador(r1.getDenominador()*r2.getDenominador());
    return r3;
    }
    public Object cociente(Object objUno, Object objDos) {
        Racional r1=(Racional) objUno;
        Racional r2=(Racional) objDos;
        Racional r3=new Racional();
        r3.setNumerador(r1.getNumerador()*r2.getDenominador());
        r3.setDenominador(r1.getDenominador()*r2.getNumerador());
        return r3;
    }

}
