module com.example.ice {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires javafx.media;
    requires java.sql;

    opens com.example.ice to javafx.fxml;
    exports com.example.ice;
}