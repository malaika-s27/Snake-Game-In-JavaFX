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

public class Snake_Color {	
	//start method
       public void start(Stage snakestage)
		{
    	   //object creation of other classes and stages to access
		    Stage primaryStage = new Stage();
		    Main obj = new Main();
		    Stage food = new Stage();
		    Food_Selection fd = new Food_Selection();
		    
		    //pane/ scene setting
		    Pane panes = new Pane();
		    panes.setBackground(new Background(new BackgroundImage(new Image("C:/Users/mubas/Downloads/Snake Game (3).png")
		    		, null, null, null, null)));
	        Scene scene = new Scene(panes, 500, 500);
	        snakestage.setResizable(false);
	        snakestage.setScene(scene);
	        snakestage.show();
	        
	        //tootip and font style for buttons
	        Tooltip a = new Tooltip("Snake Color");
	        Font font = Font.font("Courier", FontWeight.BOLD, 20);

	        // Button for snake color 
	        //silver color
	        Button snake = new Button();
	        snake.setText("SILVER");
	        snake.setTextFill(Color.BLACK); 
	        snake.clipProperty();
	        snake.setLayoutX(300);
	        snake.setLayoutY(200);
	        snake.setMaxSize(100, 100);
	        snake.setTooltip(a);
	        snake.setFont(font);
	        snake.setBackground(new Background(new BackgroundFill(Color.SILVER,null,null)));

           
	        //Event handler when button for silver color is pressed
	        EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent actionEvent) {
	            	snakestage.close();
	            	obj.snakecolor(Color.SILVER);
	            	fd.start(food);
	            }
	        };
	        snake.setOnAction(event3);
	        panes.getChildren().add(snake);
	        
	        //button for green color
	        Button snake1 = new Button();
	        snake1.setText("Green");
	        snake1.setTextFill(Color.WHITE); 
	        snake1.clipProperty();
	        snake1.setLayoutX(100);
	        snake1.setLayoutY(200);
	        snake1.setMaxSize(200, 200);
	        snake1.setTooltip(a);
	        snake1.setFont(font);
	        snake1.setBackground(new Background(new BackgroundFill(Color.GREEN,null,null)));

           
	        //Event handler when button for green color is pressed
	        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent actionEvent) {
	            	snakestage.close();
	            	obj.snakecolor(Color.GREEN);
	            	fd.start(food);

	            
	            }
	        };
	        snake1.setOnAction(event2);
	        panes.getChildren().add(snake1);
}}
