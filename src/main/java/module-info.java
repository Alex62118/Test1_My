module com.example.my1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.my1 to javafx.fxml;
    exports com.example.my1;
}