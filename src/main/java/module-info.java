module com.listado.productos.listadoproductos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;

    opens com.listado.productos.listadoproductos to javafx.fxml;
    opens com.listado.productos.listadoproductos.controller to javafx.fxml;
    opens com.listado.productos.listadoproductos.dto to javafx.fxml;
    opens com.listado.productos.listadoproductos.dao to javafx.fxml;
    opens com.listado.productos.listadoproductos.service to javafx.fxml;
    exports com.listado.productos.listadoproductos;
    exports com.listado.productos.listadoproductos.controller;
    exports com.listado.productos.listadoproductos.dto;
    exports com.listado.productos.listadoproductos.dao;
    exports com.listado.productos.listadoproductos.service;


}