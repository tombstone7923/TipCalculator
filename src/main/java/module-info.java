module thomasgarafano.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens thomasgarafano.tipcalculator to javafx.fxml;
    exports thomasgarafano.tipcalculator;
}