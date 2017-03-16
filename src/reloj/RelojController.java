/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author Richard
 */
public class RelojController implements Initializable {

    /**
     * @param args the command line arguments
     */
    @FXML
    TextField tfHoras;
    @FXML
    TextField tfMinutos;
    @FXML
    TextField tfSegundos;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        int horas = 0, minutos = 0, segundos = 0;
        int inf = 2;
        String horasS, minutosS, segundosS;
        while (inf == 2) {
            horasS = String.valueOf(horas);
            minutosS = String.valueOf(minutos);
            segundosS = String.valueOf(segundos);
            tfHoras.setText(horasS);
            tfMinutos.setText(minutosS);
            tfSegundos.setText(segundosS);
            segundos++;
            if (segundos >= 60) {
                minutos++;
                segundos = 0;
            }
            if (minutos >= 60) {
                horas++;
                minutos = 0;
            }
            if (horas >= 24) {
                horas = 0;
            }
            System.out.println("Horas:" + horas);
            System.out.println("Minutos:" + minutos);
            System.out.println("Segundos" + segundos);

        }

    }
}
