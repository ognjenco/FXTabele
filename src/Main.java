

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	List<Trener> treneri=new ArrayList<Trener>();
	@Override
	public void start(Stage primaryStage) {
		Trener prvi=new Trener();
		prvi.setBrojTelefona("065333222");
		prvi.setImeIPrezime("Prvi Trener");
		Trener drugi=new Trener();
		drugi.setBrojTelefona("066444111");
		drugi.setImeIPrezime("Drugi Trener");
		treneri.add(prvi);
		treneri.add(drugi);
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			TableView<Trener> tabela=new TableView<Trener>();

			tabela.getSelectionModel().setCellSelectionEnabled(true);
			tabela.setEditable(true);
			TableColumn<Trener, String> brTel=new TableColumn<Trener, String>("Broj Telefona");
			brTel.setCellFactory(new Callback<TableColumn<Trener,String>, TableCell<Trener,String>>() {

				@Override
				public TableCell<Trener, String> call(TableColumn<Trener, String> param) {
					// TODO Auto-generated method stub
					return new Celija();
				}
			});
			brTel.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Trener,String>, ObservableValue<String>>() {

				@Override
				public ObservableValue<String> call(CellDataFeatures<Trener, String> param) {
					return new SimpleStringProperty(param.getValue().getBrojTelefona());
				}
			});
			tabela.getColumns().add(brTel);
			tabela.getItems().addAll(treneri);
			root.setCenter(tabela);
			Button isprintaj=new Button("Printaj trenere");
			isprintaj.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					System.out.println(treneri);
				}
			});
			root.setBottom(isprintaj);
			primaryStage.setScene(scene);
			primaryStage.show();
			System.out.println(tabela.getItems());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
