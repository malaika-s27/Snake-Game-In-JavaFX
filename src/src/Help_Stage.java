package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Help_Stage {
	//start method
	  public void start(Stage secondarystage)
			{
				//pane and scene setting
			    Pane panes = new Pane();
			    panes.setBackground(new Background(new BackgroundImage
			    		(new Image("C:/Users/mubas/Downloads/Snake Game (5).png"), null, null, null, null)));
		        Scene scene = new Scene(panes, 500, 500);
		        secondarystage.setResizable(false);
		        secondarystage.setScene(scene);
		        secondarystage.show();
		       
		        // Instructions
		        panes.setPadding(new Insets(5, 5, 5, 5)); //inset
		        Text instruction = new Text(20,150, " Welcome to Snake Game! Follow these Instructions Carefully:"
		        		+ " \n\n 1. Select background color "
		        		+ "after starting game. \n\n 2. Select Snake Color. "
		        		+ "\n \n 3. Select the food you want the snake to eat."
		        		+ " \n\n 3. Avoid hitting the walls of play area. "
		        		+ "\n\n 4. Avoid hitting the body of snake."
		        		+ " \n\n 5. The speed will increase each time snake eats food."
		        		+ "\n\n Good luck :)");
		        instruction.setFill(Color.WHITE);
		        instruction.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		        panes.getChildren().add(instruction);

		        //Tooltip
		        Tooltip a = new Tooltip("Back to main page");
				// Button for going back to main page
		        Button menu = new Button();
		        menu.setText("Go back");
		        menu.setTextFill(Color.SILVER);
		        menu.setBorder(new Border(new BorderStroke(Color.SILVER, null, null, null)));
		        menu.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));
		        menu.setLayoutX(380);
		        menu.setLayoutY(450);
		        menu.setMaxSize(150, 100);
		        menu.setTooltip(a);
		        Font font = Font.font("Times New Roman", FontWeight.BOLD, 20);
		        menu.setFont(font);

		        //Event handler when back butto is pressed
		        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
		            @Override
		            public void handle(ActionEvent actionEvent) {
		            	secondarystage.close();	


		            }
		        };
		        menu.setOnAction(event1);
		        panes.getChildren().add(menu);
			}
}
