module com.example.entorno_grafico {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.entorno_grafico to javafx.fxml;
    exports com.example.entorno_grafico;
    exports com.example.entorno_grafico.Modelo;
    opens com.example.entorno_grafico.Modelo to javafx.fxml;
    exports com.example.entorno_grafico.Utilidades;
    opens com.example.entorno_grafico.Utilidades to javafx.fxml;
}