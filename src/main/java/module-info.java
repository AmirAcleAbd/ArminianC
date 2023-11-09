module achess.arminianc {
    requires javafx.controls;
    requires javafx.fxml;


    opens achess.arminianc to javafx.fxml;
    exports achess.arminianc;
}