package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;


public class Main extends Application {
	
	
	public static void main(String[] args) {
		Application.launch(Main.class, args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
			primaryStage.setTitle("Jean Michel Java");
			Group root = new Group();
			Scene scene = new Scene(root,670,800, Color.LIGHTBLUE);
			
			/*
			Button btn = new Button();
			btn.setLayoutX(150);
			btn.setLayoutY(80);
			btn.setText("GROSSE BITE");
			btn.setOnAction(new EventHandler<ActionEvent>() {
			
				public void handle(ActionEvent event) {
				
					System.out.println("JOIE DU BONTON");
				}
			});*/
			
			//voir avec Gridpane pour faire la grille
			
			GridPane grille = new GridPane();
			
			Label tJeu = new Label ("Motus");
			tJeu.setLayoutX(270);
			tJeu.setLayoutY(50);
			tJeu.setFont(new Font ("Arial", 30));
			tJeu.setWrapText(true);
			
			
			Button retour = new Button();
			retour.setLayoutX(100);
			retour.setLayoutY(700);
			retour.setText("Retour");
			retour.setOnAction(new EventHandler <ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					
					//System.exit(0);
				}
				
				
			});
			
			Button quitt = new Button();
			quitt.setLayoutX(530);
			quitt.setLayoutY(700);
			quitt.setText("Quitter");
			quitt.setOnAction(new EventHandler <ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					
					System.exit(0);
				}
				
				
			});
			//root.getChildren().add(btn);
			root.getChildren().add(tJeu);
			root.getChildren().add(retour);
			root.getChildren().add(quitt);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			//déclaration d'un cercle
			
			
			
			
			primaryStage.show();
			
	}
	
	
}
