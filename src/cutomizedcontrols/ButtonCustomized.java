package cutomizedcontrols;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;

public class ButtonCustomized extends Button{
    private IntegerProperty pptNumClics;

    public int getPptNumClics() {
        return pptNumClics.get();
    }

    public IntegerProperty pptNumClicsProperty() {
        return pptNumClics;
    }

    public void setPptNumClics(int pptNumClics) {
        this.pptNumClics.set(pptNumClics);
    }

    public ButtonCustomized(String text){
        super(text);

        pptNumClics = new SimpleIntegerProperty( initialValue: 0);

        //Rotar el botón 45 grados
        this.setRotate(- 45);
    }

    public void contarClic(){
        this.setPptNumClics(this.getPptNumClics() + 1);
    }
    //Metodo para detectar evento OnAction, contar el clic
    //y ejecutar lo que el usuario desea desde su GUI
    public void setOnActionClic(EventHandler<ActionEvent> evt){
        this.contarClic();

        //Ejecutar el evento del usuario
    }
}
