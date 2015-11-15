

import javax.swing.text.StyledEditorKit.BoldAction;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TableCell;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Celija extends TableCell<Trener, String> implements EventHandler<ActionEvent>{


	public Celija(){
		super();
		this.setGraphic(new TextField());
		((TextField)this.getGraphic()).setOnAction(this);
		((TextField)getGraphic()).setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				// TODO Auto-generated method stub
				System.out.println("U eventu za strjelice");
				if(event.getCode().isArrowKey()){
					KeyCode str=event.getCode();
					if(str.equals(KeyCode.UP)){
						getTableView().getSelectionModel().selectAboveCell();
					}else if(str.equals(KeyCode.DOWN)){
						getTableView().getSelectionModel().selectBelowCell();
					}
				}
			}
		});
		setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
	}

	@Override
	public void startEdit() {
		// TODO Auto-generated method stub
		super.startEdit();
		((TextField)getGraphic()).setText(getItem());
		System.out.println("Start edit"+this.toString());
		((TextField)getGraphic()).requestFocus();

	}

	@Override
	public void commitEdit(String newValue) {

		this.getTableView().getItems().get(this.getTableRow().getIndex()).setBrojTelefona(newValue);
		this.setText(newValue);
		System.out.println("Commit edit"+this.toString());

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
			commitEdit(((TextField)this.getGraphic()).getText());
		}
	}

	@Override
	protected void updateItem(String item, boolean empty) {
		// TODO Auto-generated method stub
		super.updateItem(item, empty);
		if(!empty){
			this.setText(item);
			((TextField)getGraphic()).setText(item);
			if(this.isSelected()){
				((TextField)getGraphic()).requestFocus();
			}
		}
		else{
			setContentDisplay(ContentDisplay.TEXT_ONLY);
		}
		System.out.println("Update item"+this.toString());
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("U handle eventu");
		this.commitEdit(((TextField)this.getGraphic()).getText());
	}




}
