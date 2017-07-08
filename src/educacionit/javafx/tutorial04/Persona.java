/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educacionit.javafx.tutorial04;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author DIANA
 */
public class Persona {
     public SimpleStringProperty nombre= new SimpleStringProperty();
    public SimpleStringProperty apellido= new SimpleStringProperty();
    public SimpleStringProperty direccion= new SimpleStringProperty();
    public SimpleStringProperty telefono= new SimpleStringProperty();
    public SimpleStringProperty celular= new SimpleStringProperty();
    public SimpleStringProperty email= new SimpleStringProperty();
    



    public String getNombre() {
        return nombre.get();
    }

    public String getApellido() {
        return apellido.get();
    }

    public String getDireccin() {
        return direccion.get();
    }

    public String getTelefono() {
        return telefono.get();
    }
    public String getCelular() {
        return celular.get();
}
    public String getEmail() {
        return email.get();
    }}