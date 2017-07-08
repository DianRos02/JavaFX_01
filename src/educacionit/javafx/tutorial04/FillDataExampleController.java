/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educacionit.javafx.tutorial04;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rodolfo Durante
 */
public class FillDataExampleController implements Initializable {

    @FXML
    private TextField txt_name_value;
    @FXML
    private TextField txt_lastname_value;
    @FXML
    private TextField txt_address_value;
    @FXML
    private TextField txt_phone_value;
    @FXML
    private TextField txt_cell_value;
    @FXML
    private TextField txt_email_value;

    //declarar botones
    @FXML
    private Button btn_nuevo;
    @FXML
    private Button btn_editar;
    @FXML
    private Button btn_guardar;
    @FXML
    private Button btn_borrar;
    @FXML
    private Button btn_cancelar;
    @FXML
    private Button btn_exit;
    // declaramos las tablas y las columnas
    @FXML
    private TableView<Persona> tablaPersona;
    @FXML
    private TableColumn nombreCL;
    @FXML
    private TableColumn apellidoCL;
    ObservableList<Persona> personas;
    
    private int posicionPersonaEnTabla;// crear variable

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txt_name_value.setText("Juan");
        txt_lastname_value.setText("Perez");
        txt_address_value.setText("Castro Barros 333 - C.A.B.A.");
        txt_phone_value.setText("11-4956-7878");
        txt_cell_value.setText("15-6787-2356");
        txt_email_value.setText("juan.perez@educacionit.com");
    }

    @FXML
    private void Nuevo(ActionEvent event) {
        txt_name_value.setText("");
        txt_lastname_value.setText("");
        txt_address_value.setText("");
        txt_phone_value.setText("");
        txt_cell_value.setText("");
        txt_email_value.setText("");
        btn_editar.setDisable(true);
        //btn_cancelar.setDisable(true);
        btn_guardar.setDisable(false);
        btn_exit.setDisable(true);
        btn_borrar.setDisable(false);
    }

    @FXML
    private void cancelarNuevo(ActionEvent event) {
        btn_editar.setDisable(false);
        btn_guardar.setDisable(true);
        btn_exit.setDisable(false);
        btn_borrar.setDisable(true);
    }

    @FXML
    private void editar(ActionEvent event) {
        Persona persona = new Persona();
        persona.nombre.set(txt_name_value.getText());
        persona.apellido.set(txt_lastname_value.getText());
        persona.direccion.set(txt_address_value.getText());
        persona.telefono.set(txt_phone_value.getText());
        persona.telefono.set(txt_cell_value.getText());
        persona.telefono.set(txt_email_value.getText());
        personas.add(persona);

    }
    @FXML
    private void borrar(ActionEvent event) {
        personas.remove(posicionPersonaEnTabla);
    }

    @FXML
    private void handlerBtnExit(ActionEvent event) {
        Platform.exit();
    }

}
