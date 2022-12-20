module com.example.demo4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    opens com.example.demo4 to javafx.fxml;
    exports com.example.demo4;
}