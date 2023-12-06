module com.example.ice {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.ice to javafx.fxml;
    exports com.example.ice;
}