package restaurantmenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RestaurantController {
    @FXML
    TextField item = new TextField();
    @FXML
    TextField description = new TextField();
    @FXML
    TextField price = new TextField();
    @FXML
    TextField category = new TextField();
    @FXML
    TextField allergens = new TextField();
    @FXML
    Label totalLabel = new Label();
    @FXML
    Button addButton = new Button();
    @FXML
    TextArea textArea = new TextArea();



    public void onClickAddButton(ActionEvent actionEvent) {
        String itemText = item.getText();
        String desc = description.getText();
        double priceValue = Double.parseDouble(price.getText());
        String categoryText = category.getText();
        String allergensText = allergens.getText();

        restaurant menu1 = new restaurant(itemText, desc, priceValue, categoryText, allergensText);

        textArea.setText(textArea.getText() + menu1.toString());

        totalLabel.setText("Total menu items: " + String.valueOf(menu1.getNumItems()));

    }




}
