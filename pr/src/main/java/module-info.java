module com.example.pr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr to javafx.fxml;
    exports com.example.pr;
}