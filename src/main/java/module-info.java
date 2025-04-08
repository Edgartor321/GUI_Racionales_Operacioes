module mx.unam.aragon.operaciones {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens mx.unam.aragon.operaciones to javafx.fxml;
    exports mx.unam.aragon.operaciones;
    exports mx.unam.aragon.operaciones.controller;
    opens mx.unam.aragon.operaciones.controller to javafx.fxml;
}