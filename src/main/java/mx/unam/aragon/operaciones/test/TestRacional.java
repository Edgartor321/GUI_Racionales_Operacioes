package mx.unam.aragon.operaciones.test;

import mx.unam.aragon.operaciones.modelo.Racional;
import mx.unam.aragon.operaciones.modelo.Racionales;

public class TestRacional {
    public static void main(String[] args) {
        Racional r0=new Racional(1,2);
        Racional r1=new Racional(1,3);
        Racionales op=new Racionales();
        Racional r=(Racional)op.cociente(r0,r1);
        System.out.println(r.toString());
    }
}
