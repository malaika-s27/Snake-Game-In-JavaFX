package application;
//Import
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public class Main  {
 // variable delcaration
static Color bgc, snakes;
static Image food;
 static int foodeaten=0;
 static int speed = 3;
 static int foodcolor = 0;
 static int width = 30;
 static int height = 30;
 static int foodX = 0;
 static int foodY = 0;
 static int cornersize = 20;
 static List<Corner> snake = new ArrayList<>();
 static Dir direction = Dir.left;
 static boolean gameOver = false;
 static Random rand = new Random();

 public enum Dir {
  left, right, up, down
 }

 public static class Corner {
  int x;
  int y;

  public Corner(int x, int y) {
   this.x = x;
   this.y = y;
  }

 }

 public static void start(Stage primaryStage) {
  try {
   newFood();

   VBox root = new VBox();
   Canvas c = new Canvas(width * cornersize, height * cornersize);
   GraphicsContext gc = c.getGraphicsContext2D();
   root.getChildren().add(c);
// animation and handling the graphic class
   new AnimationTimer() {
    long lastTick = 0;
    public void handle(long now) {
     if (lastTick == 0) {
      lastTick = now;
      tick(gc);
      return;
     }

     if (now - lastTick > 1000000000 / speed) {
      lastTick = now;
      tick(gc);
     }
    }

   }.start();
// scene setting
   Scene scene = new Scene(root, width * cornersize, height * cornersize);

   // control of snake directions
   scene.addEventFilter(KeyEvent.KEY_PRESSED, key -> {
    if (key.getCode() == KeyCode.UP) {
     direction = Dir.up;
    }
    if (key.getCode() == KeyCode.LEFT) {
     direction = Dir.left;
    }
    if (key.getCode() == KeyCode.DOWN) {
     direction = Dir.down;
    }
    if (key.getCode() == KeyCode.RIGHT) {
     direction = Dir.right;
    }

   });

   // add starting snake parts
   snake.add(new Corner(width / 2, height / 2));
   snake.add(new Corner(width / 2, height / 2));
   snake.add(new Corner(width / 2, height / 2));
   
   //set title of stage
   primaryStage.setScene(scene);
   primaryStage.setTitle("SNAKE GAME");
   primaryStage.show();
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

 // tick (graphics method for setting snake and food)
 public static void tick(GraphicsContext gc) {
	 // When snake collides with itself or the walls of game, game is over and message displays
  if (gameOver) {
Image end = new Image("C:/Users/mubas/Downloads/game OVer.png");
   gc.setFill(Color.BLACK); 
   gc.fillRect(0, 0, width * cornersize, height * cornersize);
   gc.drawImage(end,50, height);
   ImageView f1 = new ImageView(end);
   f1.setFitHeight(600);
   f1.setFitWidth(600);
   return;
  }

  for (int i = snake.size() - 1; i >= 1; i--) {
   snake.get(i).x = snake.get(i - 1).x;
   snake.get(i).y = snake.get(i - 1).y;
  }
//Checking direction collision of snake, to see if it collides the walls 
  switch (direction) {
  case up:
   snake.get(0).y--;
   if (snake.get(0).y < 0) {
    gameOver = true;
   }
   break;
  case down:
   snake.get(0).y++;
   if (snake.get(0).y > height) {
    gameOver = true;
   }
   break;
  case left:
   snake.get(0).x--;
   if (snake.get(0).x < 0) {
    gameOver = true;
   }
   break;
  case right:
   snake.get(0).x++;
   if (snake.get(0).x > width) {
    gameOver = true;
   }
   break;

  }

  // eat food
  if (foodX == snake.get(0).x && foodY == snake.get(0).y) {
	  snake.add(new Corner(-1, -1));


   //add new food 
   newFood();
   
  }

  // self destroy
  for (int i = 1; i < snake.size(); i++) {
   if (snake.get(0).x == snake.get(i).x && snake.get(0).y == snake.get(i).y) {
    gameOver = true;
   }
  }

  // Play area customized Background 
  gc.setFill(bgc);
  gc.fillRect(0, 0, width * cornersize, height * cornersize);

  // Score and Food count on screen
  gc.setFill(Color.GREENYELLOW);
  gc.setFont(new Font("Times New Roman", 20));
  gc.fillText("Score: " + ((speed *10)-40), 10, 30);
  gc.fillText("Food: " + (foodeaten-1), 520, 30);

// SnakeFood
  ImageView f1 = new ImageView(food);
  f1.setFitHeight(20);
  f1.setFitWidth(20);
  f1.setX(1320);
  f1.setY(170);
  //drawing snake food choosen by user
  gc.drawImage(food, foodX * cornersize, foodY * cornersize, cornersize, cornersize);

  //Snake setting on screen
  for (Corner c : snake) {
   gc.setFill(snakes);
   gc.fillOval(c.x * cornersize, c.y * cornersize, cornersize , cornersize ); 
   

  }

 }
 
 //Function to get background color selection from user
 public  void setcolor(Color a)
 {
 	bgc=a;
 } 
 //Function to get snake color selection from user
 public  void snakecolor(Color a)
 {
 	snakes=a;
 }
 //Function to get Food selection from user
 public Image setFood(Image a)
 {
	 food=a;
	 return food; 
 }
 // food function
 public static void newFood() {
  start:
	  //while the snake is alive, put food in random locations
	  while (true) {
	  
   foodX = rand.nextInt(width);
   foodY = rand.nextInt(height);
// repeating start method if snake eats food
   for (Corner c : snake) {
    if (c.x == foodX && c.y == foodY) {
     continue start;
    }
   }
   //increase speed of snake
   speed++;
   
   //increase the number of food eaten by 1
   foodeaten++;
   
   break;

  }
 }

}



