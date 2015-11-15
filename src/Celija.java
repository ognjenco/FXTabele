

import javax.swing.text.StyledEditorKit.BoldAction;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TableCell;
import javafx.scene.control.TextField;

public class Celija extends TableCell<Trener, String> implements EventHandler<ActionEvent>{


	public Celija(){
		super();
	}

	@Override
	public void startEdit() {
		// TODO Auto-generated method stub
		super.startEdit();
		this.setGraphic(new TextField(this.getItem()));
		setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
		((TextField)this.getGraphic()).setOnAction(this);
		System.out.println("Start edit");
	}

	@Override
	public void commitEdit(String newValue) {

		this.getTableView().getItems().get(this.getTableRow().getIndex()).setBrojTelefona(newValue);
		this.setText(newValue);
		this.setContentDisplay(ContentDisplay.TEXT_ONLY);
		System.out.println("Commit edit");
	}

	@Override
	public void cancelEdit() {
		// TODO Auto-generated method stub
		super.cancelEdit();
	}

	@Override
	public void updateSelected(boolean selected) {
		// TODO Auto-generated method stub
		super.updateSelected(selected);
		if(selected){
			startEdit();
		}
		else{
			commitEdit(this.getItem());
		}
	}

	@Override
	protected void updateItem(String item, boolean empty) {
		// TODO Auto-generated method stub
		super.updateItem(item, empty);
		this.setText(item);
		this.setContentDisplay(ContentDisplay.TEXT_ONLY);
		System.out.println("Update item");
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		this.commitEdit(((TextField)this.getGraphic()).getText());
	}




}
