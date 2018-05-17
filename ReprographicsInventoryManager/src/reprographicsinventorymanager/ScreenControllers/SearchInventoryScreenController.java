package reprographicsinventorymanager.ScreenControllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import reprographicsinventorymanager.DatabaseManager;
import reprographicsinventorymanager.InventoryItem;
import reprographicsinventorymanager.InventoryItemTableData;


public class SearchInventoryScreenController {
    @FXML private TextField searchItemNameTxtFld;
    @FXML private TextField searchItemIDTxtFld;
    @FXML private Button searchBtn;
    @FXML private TableView<InventoryItem> tableView;
    @FXML private TableColumn<InventoryItem, Integer> idTableColumn;
    @FXML private TableColumn<InventoryItem, String> itemTableColumn;
    @FXML private TableColumn<InventoryItem, Integer> quantityTableColumn;
    @FXML private TableColumn<InventoryItem, Double> priceTableColumn;

    public SearchInventoryScreenController() {
        this.tableView = new TableView<>();
        this.idTableColumn = new TableColumn<>();
        this.itemTableColumn = new TableColumn<>();
        this.quantityTableColumn = new TableColumn<>();
        this.priceTableColumn = new TableColumn<>();
        idTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        itemTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("count"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    }

    @FXML private void search() throws Exception {
        ObservableList<InventoryItem> data = DatabaseManager.searchItemsWithQuery(Integer.parseInt(searchItemIDTxtFld.getText()), searchItemNameTxtFld.getText());
        // ObservableList<InventoryItemTableData> tableData = InventoryItemTableData.convertToTableData(data); If you make it work without it, you can delete the class as well
        tableView.setItems(data);
    }

}
