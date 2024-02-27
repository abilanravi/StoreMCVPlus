import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ElectronicStoreView extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Electronic Store");
        primaryStage.setResizable(false);

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10, 10, 10, 10));

        VBox leftBox = new VBox(10);
        Label currentCartLabel = new Label("Current Cart:");
        ListView<String> currentCartList = new ListView<>();
        leftBox.getChildren().addAll(currentCartLabel, currentCartList);

        VBox centerBox = new VBox(10);
        Label storeStockLabel = new Label("Store Stock:");
        ListView<String> storeStockList = new ListView<>();
        centerBox.getChildren().addAll(storeStockLabel, storeStockList);

        VBox rightBox = new VBox(10);
        GridPane statsGrid = new GridPane();
        statsGrid.setHgap(10);
        statsGrid.setVgap(10);
        statsGrid.addRow(0, new Label("#/Sales:"), new Label("0"));
        statsGrid.addRow(1, new Label("Revenue:"), new Label("$0.00"));
        statsGrid.addRow(2, new Label("$/Sales:"), new Label("$0.00"));

        Label emptyBoxLabel = new Label("");
        emptyBoxLabel.setMinSize(200, 200);
        emptyBoxLabel.setStyle("-fx-border-color: black;");
        rightBox.getChildren().addAll(statsGrid, emptyBoxLabel);

        root.setLeft(leftBox);
        root.setCenter(centerBox);
        root.setRight(rightBox);

        HBox buttonsBox = new HBox(10);
        Button resetStoreButton = new Button("Reset Store");
        Button addToCartButton = new Button("Add to Cart");
        Button removeFromCartButton = new Button("Remove from Cart");
        Button completeSaleButton = new Button("Complete Sale");

        buttonsBox.setAlignment(Pos.CENTER);
        buttonsBox.getChildren().addAll(resetStoreButton, addToCartButton, removeFromCartButton, completeSaleButton);
        root.setBottom(buttonsBox);

        Scene scene = new Scene(root, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {

        launch(args);
    }
}
