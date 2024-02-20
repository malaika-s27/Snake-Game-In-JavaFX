package application;

import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//Selection stage class for background color selection
public class Selection_Stage {	
       public void start(Stage selectstage)
		{
    	   //Objects and stages for accessing from other class
		    Stage primaryStage = new Stage();
		    Main obj = new Main();
		    Stage snake = new Stage();
		    Snake_Color o = new Snake_Color();
		    
		    //Stage and pane/scene setting
		    Pane panes = new Pane();
		    panes.setBackground(new Background(new BackgroundImage(new Image("C:/Users/mubas/Downloads/Snake Game (2).png"),
		    		null, null, null, null)));
	        Scene scene = new Scene(panes, 500, 500);
	        selectstage.setResizable(false);
	        selectstage.setScene(scene);
	        selectstage.show();
	        //Insets
	        panes.setPadding(new Insets(5, 5, 5, 5));
	       
	        //tooltip for buttons
	        Tooltip a = new Tooltip("Select Background colour");
			// Button for black color background
	        Button menu = new Button();
	        //black color button setting
	        menu.setText("Black");
	        menu.setTextFill(Color.WHITE);
	        menu.clipProperty();
	        menu.setLayoutX(30);
	        menu.setLayoutY(190);
	        menu.setMaxSize(200, 200);
	        menu.setTooltip(a);
	        Font font = Font.font("Courier New", FontWeight.BOLD, 20);
	        menu.setFont(font);
	        menu.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));

	        //Event handler when button for black color is pressed
	        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
	        	@Override
	            public void handle(ActionEvent actionEvent) {
	            	selectstage.close();         
	            	obj.setcolor(Color.BLACK);
	            	o.start(snake);
	            }
	        };
	        menu.setOnAction(event1);
	        panes.getChildren().add(menu);
	     
	        // Button for white color background 
	        Button menu1 = new Button();
	       
	        menu1.setText("WHITE");
	        menu1.setTextFill(Color.BLACK);
	        menu1.clipProperty();
	        menu1.setLayoutX(30);
	        menu1.setLayoutY(290);
	        menu1.setMaxSize(100, 50);
	        menu1.setTooltip(a);
	        menu1.setFont(font);
	        menu1.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));

           
	        //Event handler when button for white color is pressed
	        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent actionEvent) {
	            	selectstage.close();
	            	obj.setcolor(Color.WHITE);
	            	o.start(snake);
	            }
	        };
	        menu1.setOnAction(event2);
	        panes.getChildren().add(menu1);
	        
	        //button for blue color background
	        Button menu2 = new Button();
	      
	        menu2.setText("Blue");
	        menu2.setTextFill(Color.WHITE);
	        menu2.clipProperty();
	        menu2.setLayoutX(220);
	        menu2.setLayoutY(190);
	        menu2.setMaxSize(100, 50);
	        menu2.setTooltip(a);
	        menu2.setFont(font);
	        menu2.setBackground(new Background(new BackgroundFill(Color.BLUE,null,null)));

	        //Event handler when button for blue color is pressed
	        EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
	        	@Override
	            public void handle(ActionEvent actionEvent) {
	            	selectstage.close();         
	            	obj.setcolor(Color.BLUE);
	            	o.start(snake);
	            }
	        };
	        menu2.setOnAction(event3);
	        panes.getChildren().add(menu2);
	        
	        //button for orange color background
	        Button menu3 = new Button();
	  
	        menu3.setText("Orange");
	        menu3.setTextFill(Color.WHITE);
	        menu3.clipProperty();
	        menu3.setLayoutX(210);
	        menu3.setLayoutY(290);
	        menu3.setMaxSize(100, 50);
	        menu3.setTooltip(a);
	        menu3.setFont(font);
	        menu3.setBackground(new Background(new BackgroundFill(Color.ORANGE,null,null)));

	        //Event handler when button for orange color is pressed
	        EventHandler<ActionEvent> event4 = new EventHandler<ActionEvent>() {
	        	@Override
	            public void handle(ActionEvent actionEvent) {
	            	selectstage.close();         
	            	obj.setcolor(Color.ORANGE);
	            	o.start(snake);
	            }
	        };
	        menu3.setOnAction(event4);
	        panes.getChildren().add(menu3);
	        
	        //button for aqua color
	        Button menu4 = new Button();
	  	  
	        menu4.setText("Aqua");
	        menu4.setTextFill(Color.WHITE);
	        menu4.clipProperty();
	        menu4.setLayoutX(400);
	        menu4.setLayoutY(190);
	        menu4.setMaxSize(100, 50);
	        menu4.setTooltip(a);
	        menu4.setFont(font);
	        menu4.setBackground(new Background(new BackgroundFill(Color.AQUA,null,null)));

	        //Event handler when button for aqua color is pressed
	        EventHandler<ActionEvent> event5 = new EventHandler<ActionEvent>() {
	        	@Override
	            public void handle(ActionEvent actionEvent) {
	            	selectstage.close();         
	            	obj.setcolor(Color.AQUA);
	            	o.start(snake);
	            }
	        };
	        menu4.setOnAction(event5);
	        panes.getChildren().add(menu4);
	        
	        //button for pink color
	        Button menu5 = new Button();
		  	  
	        menu5.setText("Pink");
	        menu5.setTextFill(Color.WHITE);
	        menu5.clipProperty();
	        menu5.setLayoutX(400);
	        menu5.setLayoutY(290);
	        menu5.setMaxSize(100, 50);
	        menu5.setTooltip(a);
	        menu5.setFont(font);
	        menu5.setBackground(new Background(new BackgroundFill(Color.PINK,null,null)));

	        //Event handler when button for pink color is pressed
	        EventHandler<ActionEvent> event6 = new EventHandler<ActionEvent>() {
	        	@Override
	            public void handle(ActionEvent actionEvent) {
	            	selectstage.close();         
	            	obj.setcolor(Color.PINK);
	            	o.start(snake);
	            }
	        };
	        menu5.setOnAction(event6);
	        panes.getChildren().add(menu5);
	        
	        //button for hotpink color
	        Button menu6 = new Button();
	        
	        menu6.setText("Hotpink");
	        menu6.setTextFill(Color.WHITE);
	        menu6.clipProperty();
	        menu6.setLayoutX(30);
	        menu6.setLayoutY(390);
	        menu6.setMaxSize(200, 200);
	        menu6.setTooltip(a);
	        menu6.setFont(font);
	        menu6.setBackground(new Background(new BackgroundFill(Color.HOTPINK,null,null)));

	        //Event handler when button for hot pink color is pressed
	        EventHandler<ActionEvent> event7 = new EventHandler<ActionEvent>() {
	        	@Override
	            public void handle(ActionEvent actionEvent) {
	            	selectstage.close();         
	            	obj.setcolor(Color.HOTPINK);
	            	o.start(snake);
	            }
	        };
	        menu6.setOnAction(event7);
	        panes.getChildren().add(menu6);
	        
	        //button for chocolate color
	        Button menu7 = new Button();
		  	  
	        menu7.setText("Chocolate");
	        menu7.setTextFill(Color.WHITE);
	        menu7.clipProperty();
	        menu7.setLayoutX(200);
	        menu7.setLayoutY(390);
	        menu7.setMaxSize(200, 200);
	        menu7.setTooltip(a);
	        menu7.setFont(font);
	        menu7.setBackground(new Background(new BackgroundFill(Color.CHOCOLATE,null,null)));

	        //Event handler when button for chocolate color is pressed
	        EventHandler<ActionEvent> event8 = new EventHandler<ActionEvent>() {
	        	@Override
	            public void handle(ActionEvent actionEvent) {
	            	selectstage.close();         
	            	obj.setcolor(Color.CHOCOLATE);
	            	o.start(snake);
	            }
	        };
	        menu7.setOnAction(event8);
	        panes.getChildren().add(menu7);
	        
	        //button for gray color
	        Button menu8 = new Button();
		  	  
	        menu8.setText("Gray");
	        menu8.setTextFill(Color.WHITE);
	        menu8.setLayoutX(400);
	        menu8.setLayoutY(390);
	        menu8.setMaxSize(100, 50);
	        menu8.setTooltip(a);
	        menu8.setFont(font);
	        menu8.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));

	        //Event handler when button for gray color is pressed
	        EventHandler<ActionEvent> event9 = new EventHandler<ActionEvent>() {
	        	@Override
	            public void handle(ActionEvent actionEvent) {
	            	selectstage.close();         
	            	obj.setcolor(Color.GRAY);
	            	o.start(snake);
	            }
	        };
	        menu8.setOnAction(event9);
	        panes.getChildren().add(menu8);

		}}
