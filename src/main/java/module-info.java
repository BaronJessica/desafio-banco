module com.example.desafiodiobanco {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiodiobanco to javafx.fxml;
    exports com.example.desafiodiobanco;
}