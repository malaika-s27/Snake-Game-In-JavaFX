package application;

import javafx.animation.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

//Main Method
public class Menu_Stage extends Application
{
	public static void main(String[] args) {
	    Application.launch(args);
	}
	 //Start Method for menu stage
	 public void start(Stage secondarystage)
		{
		    //Object and Stage declaration for choosing background color
		    Selection_Stage object = new Selection_Stage();
		    Stage stg = new Stage();
			Help_Stage objj = new Help_Stage();
			Stage third = new Stage();
		    Stage primaryStage = new Stage();
		    Main obj = new Main();
		    //pane setting and scene for stage making 
		    Pane panes = new Pane();
		    panes.setBackground(new Background(new BackgroundImage(new Image("C:/Users/mubas/Downloads/Snake Game.png"), null, null, null, null)));
	        Scene scene = new Scene(panes, 500, 500);
	        secondarystage.setResizable(false);
	        secondarystage.setScene(scene);
	        secondarystage.show();
	        
	        //Tooltip for start button
	        Tooltip a = new Tooltip("Start Game");
			// Button for Starting Game
	        Button menu = new Button();
	        menu.setText("Start");
	        menu.setTextFill(Color.SILVER); 
	        menu.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));
	        menu.clipProperty();
	        menu.setLayoutX(200);
	        menu.setLayoutY(400);
	        menu.setMaxSize(100, 50);
	        menu.setTooltip(a);
	        Font font = Font.font("Courier New", FontWeight.BOLD, 20);
	        menu.setFont(font);

	        //Event handler when Start button is pressed
	        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent actionEvent) {
	            	secondarystage.close();
	            	object.start(stg);
	            }
	        };
	        menu.setOnAction(event1);
	        panes.getChildren().add(menu);
		
	        //Tooltip for exit button
	        Tooltip b = new Tooltip("Exit Game");
	 
	        Button exit = new Button();
	        exit.setText("Exit");
	        exit.setTextFill(Color.SILVER); 
	        exit.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));
	        exit.clipProperty();
            exit.setLayoutX(200);
            exit.setLayoutY(450);
            exit.setTooltip(b);
            exit.setMaxSize(100, 50);
            exit.setTooltip(b);
            exit.setFont(font);
            
            //Event handler when exit button is pressed
            EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
        	secondarystage.close();	
       
             }
         };
           exit.setOnAction(event2);
           panes.getChildren().add(exit);
   
           //help button
           Tooltip c = new Tooltip("Instructions for Game");
	  
           Button help = new Button();
           help.setText("Help");
           help.setTextFill(Color.SILVER); 
	       help.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));
           help.clipProperty();
           help.setLayoutX(400);
           help.setLayoutY(20);
           help.setTooltip(b);
           help.setMaxSize(100, 70);
           help.setTooltip(c);
           help.setFont(font);

           //Event handler when help button is pressed
           EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
        	   @Override
        	   public void handle(ActionEvent actionEvent) {
        		   objj.start(third);
        	   }
           };

           help.setOnAction(event3);
           panes.getChildren().add(help);
		}
		}
	  
