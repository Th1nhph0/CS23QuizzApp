module com.vohoangthinh.mavenproject3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.vohoangthinh.mavenproject3 to javafx.fxml;
    exports com.vohoangthinh.mavenproject3;
}
