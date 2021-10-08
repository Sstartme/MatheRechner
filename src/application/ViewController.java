package application;
	

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;


/**
 * Main Class
 * @author Sinthella Anpalagan, Jaspreet Singh, Ryan Carpio
 * @version 07.10.2021
 */
public class ViewController  {
	

	 @FXML
	 public TextField txtSideA;
	 
	 @FXML
	 public TextField txtSideB;
	 
	 @FXML
	 public TextField txtSideC;
	 
	 @FXML
	 public TextField txtAngleA;
	 
	 @FXML
	 public TextField txtAngleB;
	 
	 @FXML
	 public Button berechnen;
	
	 @FXML
	 public Button btnReset;
	 
	 @FXML
	 public Canvas cnvsDraw;


	   

	 @FXML 
	 public void btnReset(ActionEvent actionevent) {	   
	 
	 	try {
		 	txtSideA.setText("");
	 		txtSideB.setText("");
	 		txtSideC.setText("");
	 		txtAngleA.setText("");
	 		txtAngleB.setText("");
	 		
	 		
	 
	 
	 	}catch(NumberFormatException e) {
			
			System.err.println("Es ist etwas schief gelaufen bitte versuchen Sie es noch eimal");
			e.printStackTrace();
		}
	 }

	
	 @FXML 
	 public void berechnen(ActionEvent actionevent) {
		 
		 try {

			 double SideA = 0;
			 double SideB = 0;
			 double SideC = 0;
			 double AngleA = 0;
			 double AngleB = 0;
			 
			 
			 if(txtSideA.getText().isEmpty()) 
			 {
				 txtSideA.setText("");
			 }else  {
				 SideA = Double.parseDouble(txtSideA.getText());
			 }
			 
			 
			 
			 if(txtSideB.getText().isEmpty()) 
			 {
				 txtSideB.setText("");
			 }else  {
				 SideB = Double.parseDouble(txtSideB.getText());
			 }
			 
			 
			 if(txtSideC.getText().isEmpty()) 
			 {
				 txtSideC.setText("");
			 }else  {
				 SideC = Double.parseDouble(txtSideC.getText());
			 }
			 
			 if(txtAngleA.getText().isEmpty()) 
			 {
				 txtAngleA.setText("");
			 }else  {
			       	
				  AngleA = Double.parseDouble(txtAngleA.getText());
				 }

			 
			 if(txtAngleB.getText().isEmpty()) 
			 {
				 txtAngleB.setText("");
			 }else  {
				 
				 AngleB = Double.parseDouble(txtAngleB.getText());
				 }
			 


			 
			  
			 // Side A and B 
		 if (SideA > 0 && SideB >  0 ) {
		 
			 //Result C 
			 double resultC = Math.pow((Math.pow(SideA, 2)+ Math.pow(SideB, 2)),0.5);
			 txtSideC.setText(Double.toString(resultC));
			 
			 
		 //Result Angle Alpha
			 double resultAlpha = Math.toDegrees((Math.asin((SideA / resultC))));		 
			 txtAngleA.setText(Double.toString(resultAlpha));
			 
			 //Result Angle B 
			 double resultBeta = Math.toDegrees((Math.asin((SideB / resultC))));		 
			 txtAngleB.setText(Double.toString(resultBeta));
			 
			 
			 }
			 
			 // Side A and C 
			 if (SideA > 0 && SideC >  0 ) {
				 
				 double resultB = Math.pow((Math.pow(SideC, 2)- Math.pow(SideA, 2)),0.5);
				 txtSideB.setText(Double.toString(resultB));
				 
				 //Result Angle Alpha
				 double resultAlpha = Math.toDegrees((Math.asin((SideA / SideC))));		 
				 txtAngleA.setText(Double.toString(resultAlpha));
				 
				 //Result Angle B 
				 double resultBeta = Math.toDegrees((Math.asin((resultB / SideC))));		 
				 txtAngleB.setText(Double.toString(resultBeta));
			 }
			 
			 // Side B and C 
			 if (SideB > 0 && SideC >  0 ) {
				 
				 double resultA = Math.pow((Math.pow(SideC, 2)- Math.pow(SideB, 2)),0.5);
				 txtSideA.setText(Double.toString(resultA));
				 
				 //Result Angle Alpha
				 double resultAlpha = Math.toDegrees((Math.asin((resultA / SideC))));		 
				 txtAngleA.setText(Double.toString(resultAlpha));
				 
				 //Result Angle B 
				 double resultBeta = Math.toDegrees((Math.asin((SideB / SideC))));		 
				 txtAngleB.setText(Double.toString(resultBeta));
			 }
			 
			 
			 // Side A and angle Alpha 
			 if (SideA > 0 && AngleA >  0 ) {
				 
				 double resultC = SideA /  Math.sin(Math.toRadians(AngleA));
				 txtSideC.setText(Double.toString(resultC));
				 
				 
				 double resultB = Math.pow((Math.pow(resultC, 2)- Math.pow(SideA, 2)),0.5);
				 txtSideB.setText(Double.toString(resultB));
				 			 
				 //Result Angle B 
				 double resultBeta = Math.toDegrees((Math.asin((resultB / resultC))));		 
				 txtAngleB.setText(Double.toString(resultBeta));
			 }
			 
			 // Side A and angle Alpha 
			 if (SideA > 0 && AngleA >  0 ) {
				 
				 double resultC = SideA /  Math.sin(Math.toRadians(AngleA));
				 txtSideC.setText(Double.toString(resultC));
				 
				 
				 double resultB = Math.pow((Math.pow(resultC, 2)- Math.pow(SideA, 2)),0.5);
				 txtSideB.setText(Double.toString(resultB));
				 			 
				 //Result Angle B 
				 double resultBeta = Math.toDegrees((Math.asin((resultB / resultC))));		 
				 txtAngleB.setText(Double.toString(resultBeta));
			 }
			 
			 
			 // Side A and angle Beta 
			 if (SideA > 0 && AngleB >  0 ) {
				 
				 double resultC = SideA /  Math.cos(Math.toRadians(AngleB));
				 txtSideC.setText(Double.toString(resultC));
				 
				 
				 double resultB = Math.pow((Math.pow(resultC, 2)- Math.pow(SideA, 2)),0.5);
				 txtSideB.setText(Double.toString(resultB));
				 			 
				 //Result Angle A 
				 double resultAlpha = Math.toDegrees((Math.asin((SideA / resultC))));		 
				 txtAngleA.setText(Double.toString(resultAlpha));
			 }
			 
			 
			 // Side B and angle Alpha 
			 if (SideB > 0 && AngleA >  0 ) {
				 
				 double resultC = SideB /  Math.cos(Math.toRadians(AngleA));
				 txtSideC.setText(Double.toString(resultC));
				 
				 
				 double resultA = Math.pow((Math.pow(resultC, 2)- Math.pow(SideB, 2)),0.5);
				 txtSideA.setText(Double.toString(resultA));
				 			 
				 double resultBeta = Math.toDegrees((Math.asin((SideB / resultC))));		 
				 txtAngleB.setText(Double.toString(resultBeta));
			 }
			 
			 // Side B and angle Beta 
			 if (SideB > 0 && AngleB >  0 ) {
				 
				 double resultC = SideB /  Math.sin(Math.toRadians(AngleB));
				 txtSideC.setText(Double.toString(resultC));
				 
				 
				 double resultA = Math.pow((Math.pow(resultC, 2)- Math.pow(SideB, 2)),0.5);
				 txtSideA.setText(Double.toString(resultA));
				 			 
				 //Result Angle A 
				 double resultAlpha = Math.toDegrees((Math.asin((resultA / resultC))));		 
				 txtAngleA.setText(Double.toString(resultAlpha));
			 }
			 
			 // Side C and angle Alpha 
			 if (SideC > 0 && AngleA >  0 ) {
							 
				 
				 double resultB = SideC *  Math.cos(Math.toRadians(AngleA));
				 txtSideB.setText(Double.toString(resultB));
				 
				 double resultA = Math.pow((Math.pow(SideC, 2)- Math.pow(resultB, 2)),0.5);
				 txtSideA.setText(Double.toString(resultA));

				 			 
				 double resultBeta = Math.toDegrees((Math.asin((resultB / SideC))));		 
				 txtAngleB.setText(Double.toString(resultBeta));
			 }
			 
			 
			 // Side C and angle Beta 
			 if (SideC > 0 && AngleB >  0 ) {
							 
				 
				 double resultB = SideC *  Math.sin(Math.toRadians(AngleB));
				 txtSideB.setText(Double.toString(resultB));
				 
				 double resultA = Math.pow((Math.pow(SideC, 2)- Math.pow(resultB, 2)),0.5);
				 txtSideA.setText(Double.toString(resultA));

				 			 
				 double resultAlpha = Math.toDegrees((Math.asin((resultA / SideC))));		 
				 txtAngleA.setText(Double.toString(resultAlpha));
			 }
			 
			 
			 
			 
			}catch(NumberFormatException e) {
				
				System.err.println("Es ist etwas schief gelaufen bitte versuchen Sie es noch eimal");
				e.printStackTrace();
			}

	

	 }

}
