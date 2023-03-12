module com.example.simple_javafx_tabview_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simple_javafx_tabview_app to javafx.fxml;
    exports com.example.simple_javafx_tabview_app;
}