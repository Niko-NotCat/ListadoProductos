module com.listado.productos.listadoproductos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.listado.productos.listadoproductos to javafx.fxml;
    exports com.listado.productos.listadoproductos;
}