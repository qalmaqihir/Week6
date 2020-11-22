package ps07;

import javafx.application.Application;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class project4_Tahira extends Application {
	
	
	String name;
	int NumofProb;
	int Lowrange;
	int Highrange;
	String ASMDProblemType;
	String record;

	@Override
	public void start(Stage primaryStage) {
		
		
		
		TextField tfName = new TextField();
		Label lName = new Label("Enter your Name");
		Label lErrName = new Label();
		
		TextField tfNumofprob = new TextField();
		tfNumofprob.setMaxWidth(80);
		Label lNumofPrpb = new Label("How many problems?");
		Label lErrNumofProb = new Label();
		
		
		TextField tfLowrange = new TextField();
		tfLowrange.setMaxWidth(80);
		Label lLowrange = new Label("Lowest value of the range");
		Label lErrLowrange1 = new Label();
		
		TextField tfHighrange = new TextField();
		tfHighrange.setMaxWidth(80);
		Label lHighrange = new Label("Highest value of range");
		Label lErrHighrange1 = new Label();
		
		Label lProblemType = new Label("Problem Type");
		VBox vbox = new VBox();
		RadioButton rb1 = new RadioButton("Addition + ");
		RadioButton rb2 = new RadioButton("Subtraction - ");
		RadioButton rb3 = new RadioButton("Multiplication *");
		RadioButton rb4 = new RadioButton("Divison / ");
		//RadioButton rb = new RadioButton();
		Label lErrRB = new Label();
		vbox.getChildren().addAll(rb1, rb2, rb3, rb4);
		vbox.setSpacing(10);
		
		// ToggleGroup for VBox and RadioButtons
		ToggleGroup rbToggle = new ToggleGroup();
		rb1.setToggleGroup(rbToggle);
		rb2.setToggleGroup(rbToggle);
		rb3.setToggleGroup(rbToggle);
		rb4.setToggleGroup(rbToggle);
		
		
		Button Go = new Button("Go");
		Label lErrGo = new Label();
		
		
		GridPane pane = new GridPane();
		pane.getChildren().addAll(tfName, lName, tfNumofprob, lNumofPrpb, tfLowrange, lLowrange, tfHighrange, lHighrange , vbox , Go, 
				lErrGo, lErrName, lErrNumofProb,lErrLowrange1, lErrHighrange1, lErrRB );
		
		
		pane.setVgap(15);
		
		pane.setHgap(15);
		pane.setPadding(new Insets(20, 20, 20, 20));
	
		
		pane.setConstraints(lName, 0, 0);	
		pane.setConstraints(tfName, 1, 0);
		pane.setConstraints(lNumofPrpb,  0, 1); 	
		pane.setConstraints(tfNumofprob, 1, 1);
		pane.setConstraints(lLowrange, 0, 2);
		pane.setConstraints(tfLowrange,1, 2);
		pane.setConstraints(lHighrange, 0, 3);
		pane.setConstraints(tfHighrange, 1 , 3);
		pane.setConstraints(lProblemType,  0,  4); 
		pane.setConstraints(vbox, 1, 4);
		pane.setConstraints(Go, 1, 5);
		pane.setConstraints(lErrGo, 1,  2);
		
		
		pane.setHalignment(lName, HPos.RIGHT);
		pane.setHalignment(lProblemType, HPos.RIGHT);
		pane.setConstraints(lErrGo,  2, 5);
		pane.setConstraints(lErrName, 2, 0);
		pane.setConstraints(lErrNumofProb, 2,  1);
		pane.setConstraints(lErrLowrange1, 2, 2);
		pane.setConstraints(lErrHighrange1, 2, 3);
		pane.setConstraints(lErrRB, 2, 4);
		
		Scene scene = new Scene(pane, 600, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("sevpuri");
		primaryStage.show();
		

		
		tfName.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER || e.getCode() == KeyCode.TAB || e.getCode() == KeyCode.DOWN) {
				if (tfName.getText().isEmpty() == false) {
					lErrName.setText("");
					name = tfName.getText();
					System.out.println(name);
					tfNumofprob.requestFocus();
				}
				else {
					lErrName.setText("Invald");
					tfName.requestFocus();
				}
			}
		});
	
		
		
		
		
		
		tfNumofprob.setOnKeyPressed(e -> {
		if (e.getCode() == KeyCode.ENTER || e.getCode() == KeyCode.TAB || e.getCode() == KeyCode.DOWN) {
			try {
				NumofProb = Integer.valueOf(tfNumofprob.getText());
				if (NumofProb >= 0) {
					lErrNumofProb.setText("");
					System.out.println(NumofProb);
					tfLowrange.requestFocus();
				}
			}
			catch (NumberFormatException nfe) {
				System.out.println(nfe);
				System.out.println(tfNumofprob.getText());
				lErrNumofProb.setText("Invalid");
				tfNumofprob.requestFocus();
			} }
		});
		

		tfLowrange.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER || e.getCode() == KeyCode.TAB || e.getCode() == KeyCode.DOWN) {
				if (tfLowrange.getText().isEmpty() == false) {
					lErrLowrange1.setText("");
					name = tfName.getText();
					System.out.println(Lowrange);
					tfHighrange.requestFocus();
				}
				else {
					lErrLowrange1.setText("Invald");
					tfLowrange.requestFocus();
				}
			}
		});
		
		
		
		tfHighrange.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER || e.getCode() == KeyCode.TAB || e.getCode() == KeyCode.DOWN) {
				if (tfHighrange.getText().isEmpty() == false) {
					lErrHighrange1.setText("");
					name = tfName.getText();
					System.out.println(Highrange);
					rb1.requestFocus();
				}
				else {
					lErrHighrange1.setText("Invald");
					tfHighrange.requestFocus();
				}
			}
		});
		
		
		
		
		

		rbToggle.selectedToggleProperty().addListener(e -> {
			RadioButton rb = (RadioButton)rbToggle.getSelectedToggle();
			if (rb.getText().isEmpty() == false) {
				lErrRB.setText("");
				ASMDProblemType = rb.getText();
				System.out.println(ASMDProblemType);
				Go.requestFocus();
			}
			else {
				lErrRB.setText("Invalid");
				rb1.requestFocus();
			}
		});
	
		
	
		Go.setOnAction(e -> {
			if (tfName.getText().isEmpty() == false && NumofProb >= 1 && ASMDProblemType != null) {
				name = tfName.getText();
				NumofProb = Integer.valueOf(tfNumofprob.getText());
				
				Lowrange = Integer.valueOf(tfLowrange.getText());
				Highrange = Integer.valueOf(tfLowrange.getText());
				
				record = String.valueOf(name + " " + NumofProb + " " +  Lowrange + " " + Highrange + " " + ASMDProblemType);
				lErrGo.setText("");
				System.out.println(record);
				tfName.requestFocus();
			}
			
			
			else {
				lErrGo.setText("Errors. Resubmit.");
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}