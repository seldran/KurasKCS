package Controller;

import Module.Data;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller
{
    public TextField textFieldInput1;
    public TextField textFieldInput2;
    public TextArea textAreaResult;

    private Data m;

    public Controller()
    {
        m = new Data();
    }

    private void SetDistance()
    {
        float distance = Float.parseFloat(textFieldInput2.getText());
        m.setDistance(distance);
    }
    private void SetFuel()
    {
        float fuel = Float.parseFloat(textFieldInput1.getText());
        m.setFuelUsed(fuel);
    }

    public void calculateResult(ActionEvent actionEvent) {
        SetDistance();
        SetFuel();
        textAreaResult.appendText(m.getResult() + "\n");
    }
}
