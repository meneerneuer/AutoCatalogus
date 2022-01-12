module com.sennecuppens.cars {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.sennecuppens.cars to javafx.fxml;
    exports com.sennecuppens.cars;
}
