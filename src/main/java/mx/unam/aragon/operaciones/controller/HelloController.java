package mx.unam.aragon.operaciones.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import mx.unam.aragon.operaciones.modelo.Racional;
import mx.unam.aragon.operaciones.modelo.Racionales;

public class HelloController {

    @FXML
    private Button btnCociente;

    @FXML
    private Button btnProducto;

    @FXML
    private Button btnResta;

    @FXML
    private Button btnSuma;

    @FXML
    private Label label;

    @FXML
    private TextField txtDenominadoDos;

    @FXML
    private TextField txtDenominadoTres;

    @FXML
    private TextField txtDenominador;

    @FXML
    private TextField txtNumeroDos;

    @FXML
    private TextField txtNumeroTres;

    @FXML
    private TextField txtNumeroUno;

    private int estado =0;

    @FXML
    void suma(ActionEvent event) {
        Integer r1=Integer.parseInt(this.txtNumeroUno.getText());
        Integer r2=Integer.parseInt(this.txtDenominador.getText());
        Integer r3=Integer.parseInt(this.txtNumeroDos.getText());
        Integer r4=Integer.parseInt(this.txtDenominadoDos.getText());
        Racional rr0=new Racional(r1,r2);
        Racional rr1=new Racional(r3,r4);
        Racionales op=new Racionales();
        Racional r=(Racional)op.suma(rr0,rr1);
        this.txtNumeroTres.setText(String.valueOf(r.getNumerador()));
        this.txtDenominadoTres.setText(String.valueOf(r.getDenominador()));
        this.label.setText("+");
    }
    @FXML
    void resta(ActionEvent event) {
        Integer r1=Integer.parseInt(this.txtNumeroUno.getText());
        Integer r2=Integer.parseInt(this.txtDenominador.getText());
        Integer r3=Integer.parseInt(this.txtNumeroDos.getText());
        Integer r4=Integer.parseInt(this.txtDenominadoDos.getText());
        Racional rr0=new Racional(r1,r2);
        Racional rr1=new Racional(r3,r4);
        Racionales op=new Racionales();
        Racional r=(Racional)op.resta(rr0,rr1);
        this.txtNumeroTres.setText(String.valueOf(r.getNumerador()));
        this.txtDenominadoTres.setText(String.valueOf(r.getDenominador()));
        this.label.setText("-");
    }

    @FXML
    void producto(ActionEvent event) {
        Integer r1=Integer.parseInt(this.txtNumeroUno.getText());
        Integer r2=Integer.parseInt(this.txtDenominador.getText());
        Integer r3=Integer.parseInt(this.txtNumeroDos.getText());
        Integer r4=Integer.parseInt(this.txtDenominadoDos.getText());
        Racional rr0=new Racional(r1,r2);
        Racional rr1=new Racional(r3,r4);
        Racionales op=new Racionales();
        Racional r=(Racional)op.producto(rr0,rr1);
        this.txtNumeroTres.setText(String.valueOf(r.getNumerador()));
        this.txtDenominadoTres.setText(String.valueOf(r.getDenominador()));
        this.label.setText("*");
    }
    @FXML
    void cociente(ActionEvent event) {
        Integer r1=Integer.parseInt(this.txtNumeroUno.getText());
        Integer r2=Integer.parseInt(this.txtDenominador.getText());
        Integer r3=Integer.parseInt(this.txtNumeroDos.getText());
        Integer r4=Integer.parseInt(this.txtDenominadoDos.getText());
        Racional rr0=new Racional(r1,r2);
        Racional rr1=new Racional(r3,r4);
        Racionales op=new Racionales();
        Racional r=(Racional)op.cociente(rr0,rr1);
        this.txtNumeroTres.setText(String.valueOf(r.getNumerador()));
        this.txtDenominadoTres.setText(String.valueOf(r.getDenominador()));
        this.label.setText("/");
    }

}
