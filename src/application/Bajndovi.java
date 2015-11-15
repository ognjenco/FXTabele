package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Bajndovi {
	static String mojString="Neka vrijednost stringa";
	static SimpleStringProperty sp=new SimpleStringProperty(mojString);
	static SimpleStringProperty dr=new SimpleStringProperty();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sp.addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				mojString=newValue;
			}
		});
		dr.bindBidirectional(sp);
		dr.set("Drugi moj string");

		sp.set("Opet neki string");
		isprintaj();
	}

	public static void isprintaj(){
		System.out.println("moj: "+mojString);
		System.out.println("SP: "+sp.get());
		System.out.println("DR: "+dr.get());
	}
}
