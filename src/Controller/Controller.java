package Controller;

import Module.Module;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller
{
    public TextField textFieldInput1;
    public TextField textFieldInput2;
    public TextArea textAreaResult;

    private Module m;

    public void calculateResult(ActionEvent actionEvent) {
        m = new Module();

        m.setDistance(Float.parseFloat(textFieldInput1.getText()));
        m.setFuelUsed(Float.parseFloat(textFieldInput2.getText()));

        textAreaResult.appendText(m.getResult() + "");
    }
}
