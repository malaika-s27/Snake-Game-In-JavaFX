package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Food_Selection {	
	//start method
       public void start(Stage foodstage)
       {
    	   //object and stage for main class to start game in button action event handler
		    Stage primaryStage = new Stage();
		    Main obj = new Main();
		    // stage and scene setting
		    Pane panes = new Pane();
		    panes.setBackground(new Background(new BackgroundImage(new Image("C:/Users/mubas/Downloads/Snake Game (4).png"),
		    		null, null, null, null)));
	        Scene scene = new Scene(panes, 500, 500);
	        foodstage.setResizable(false);
	        foodstage.setScene(scene);
	        foodstage.show();
	        
	        //tooltip and font for all three buttons
	        Tooltip a = new Tooltip("Food Choice");
	        Font font = Font.font("Courier New", FontWeight.BOLD, 20);

	        // Button for apple food 
	        Button apple = new Button();
	        //Text setting for button
	        apple.setText("Apple");
	        //text colour
	        apple.setTextFill(Color.WHITE); 
	        //Set position of button
	        apple.setLayoutX(300);
	        apple.setLayoutY(200);
	        //Maximum size for button in x- and y- dimension
	        apple.setMaxSize(100, 100);
	        //set tooltip on apple button
	        apple.setTooltip(a);
	        //set font of text
	        apple.setFont(font);
	        //bacground/ colour of button
	        apple.setBackground(new Background(new BackgroundFill(Color.RED,null,null)));


           
	        //Event handler when apple button is pressed
	        EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent actionEvent) {
	            	foodstage.close();
	            	//adding apple image
	            	obj.setFood(new Image("C:/Users/mubas/Desktop/apple.png"));
	         
	            	try {
	            		//start main class(game)
						obj.start(primaryStage);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        };
	        apple.setOnAction(event3);
	        panes.getChildren().add(apple);
	        
	        //button for car food
	        Button apple1 = new Button();
	        apple1.setText("Car");
	        apple1.setTextFill(Color.WHEAT); 
	        apple1.clipProperty();
	        apple1.setLayoutX(100);
	        apple1.setLayoutY(200);
	        apple1.setMaxSize(200, 200);
	        apple1.setTooltip(a);
	        apple1.setFont(font);
	        apple1.setBackground(new Background(new BackgroundFill(Color.DARKBLUE,null,null)));

           
	        //Event handler when car button is pressed
	        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent actionEvent) {
	            	foodstage.close();
	            	obj.setFood(new Image("C:/Users/mubas/Desktop/car1.png"));

	            	try {
						obj.start(primaryStage);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        };
	        apple1.setOnAction(event2);
	        panes.getChildren().add(apple1);
	        //button for candy food
	        Button candy = new Button();
	        candy.setText("Candy");
	        candy.setTextFill(Color.WHEAT); 
	        candy.clipProperty();
	        candy.setLayoutX(190);
	        candy.setLayoutY(200);
	        candy.setMaxSize(200, 200);
	        candy.setTooltip(a);
	        candy.setFont(font);
	        candy.setBackground(new Background(new BackgroundFill(Color.HOTPINK,null,null)));
            //Event handler when candy button is pressed
	        EventHandler<ActionEvent> event4 = new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent actionEvent) {
	            	foodstage.close();
	            	obj.setFood(new Image("C:/Users/mubas/Desktop/lollipop.png"));
	            	try {
						obj.start(primaryStage);			
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}};
	        candy.setOnAction(event4);
	        panes.getChildren().add(candy);
}}
