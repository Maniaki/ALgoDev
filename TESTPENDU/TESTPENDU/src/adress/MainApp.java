package adress;

import java.io.IOException;
import java.util.Scanner;

import adress.model.ModelPendu;
import adress.model.Pendu;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Le Pendu");

        initRootLayout();

        showPersonOverview();
    }
    
    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showPersonOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/PersonOverview.fxml"));
           
            AnchorPane personOverview = (AnchorPane) loader.load();
            ModelPendu modelPendu = loader.getController();
            int Essais = 10;
            modelPendu.setNbEssaie(Essais);
            Pendu pendu = new Pendu(Essais);
            pendu.trouverMotAléatoire();
            int lengthMot = pendu.getMot().length;
    		pendu.initialiseMotFinal(lengthMot,lengthMot);
    		
    		 switch (lengthMot) {
             case 2:  
            	 modelPendu.Mot2Lettres();
            	 modelPendu.remplirText2(pendu.getMotFinal()[0], pendu.getMotFinal()[1]);
            	 
            	 break;
             case 3:
            	 modelPendu.Mot3Lettres();  
            	 modelPendu.remplirText3(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2]);
            	 break;
             case 4:  
            	 modelPendu.Mot4Lettres();
            	 modelPendu.remplirText4(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
            			 pendu.getMotFinal()[3]);
            	 break;
             case 5:  
            	 modelPendu.Mot5Lettres();
            	 modelPendu.remplirText5(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
            			 pendu.getMotFinal()[3], pendu.getMotFinal()[4]);
            	 break;
             case 6:  
            	 modelPendu.Mot6Lettres();
            	 modelPendu.remplirText6(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
            			 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5]);
            	 break;
             case 7:  
            	 modelPendu.Mot7Lettres();
            	 modelPendu.remplirText7(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
            	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], pendu.getMotFinal()[6]);
            	 break;
             case 8:  
            	 modelPendu.Mot8Lettres();
            	 modelPendu.remplirText8(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
                    	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
                    	 pendu.getMotFinal()[6], pendu.getMotFinal()[7]);
            	 break;
             case 9:  
            	 modelPendu.Mot9Lettres();
            	 modelPendu.remplirText9(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
                    	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
                    	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8]);
            	 break;
             case 10:  
            	 modelPendu.Mot10Lettres();
            	 modelPendu.remplirText10(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
                    	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
                    	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9]);
            	 break;
             case 11:  
            	 modelPendu.Mot11Lettres();
            	 modelPendu.remplirText11(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
                    	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
                    	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9],
                    	 pendu.getMotFinal()[10]);
            	 break;
             case 12:  
            	 modelPendu.Mot12Lettres();
            	 modelPendu.remplirText12(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
                    	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
                    	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9],
                    	 pendu.getMotFinal()[10],pendu.getMotFinal()[11]);
            	 break;
             case 13:  
            	 modelPendu.Mot13Lettres();
            	 modelPendu.remplirText13(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
                    	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
                    	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9],
                    	 pendu.getMotFinal()[10],pendu.getMotFinal()[11], pendu.getMotFinal()[12]);
            	 break;
             case 14:  
            	 modelPendu.Mot14Lettres();
            	 modelPendu.remplirText14(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
                    	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
                    	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9],
                    	 pendu.getMotFinal()[10],pendu.getMotFinal()[11], pendu.getMotFinal()[12], pendu.getMotFinal()[13]);
            	 break;
             case 15:  
            	 modelPendu.Mot15Lettres();
            	 modelPendu.remplirText15(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
                    	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
                    	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9],
                    	 pendu.getMotFinal()[10],pendu.getMotFinal()[11], pendu.getMotFinal()[12], pendu.getMotFinal()[13], 
                    	 pendu.getMotFinal()[14]);
            	 break;
             }
    		 //Quand on appuie sur le bouton "Validé"
    		 modelPendu.getBoutonValide().setOnAction(new EventHandler<ActionEvent>() {
 	            @Override
 	            public void handle(ActionEvent event) {
 	            	char lettre = modelPendu.getChampLettre().getText().charAt(0);
 	            	//Si le nombre d'essaie est !=1
 	            	if(modelPendu.getNbEssaie() != 1) {
 	            	if(pendu.testLettre(lettre)) {
 	    				for(int i = 0;i<pendu.getMot().length;i++) {
 	    					if(lettre == pendu.getMot()[i]) {
 	    						pendu.setMotFinal(i,lettre);
 	    						modelPendu.lettreVrai();
 	    					}
 	    				}
 	    			}else {
 	    				modelPendu.nbEssaietext();
 	    				modelPendu.lettreFausse();
 	    			}
 	            	switch (lengthMot) {
 	               case 2:  
 	              	 
 	              	 modelPendu.remplirText2(pendu.getMotFinal()[0], pendu.getMotFinal()[1]);
 	              	 
 	              	 break;
 	               case 3:
 	              	 
 	              	 modelPendu.remplirText3(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2]);
 	              	 break;
 	               case 4:  
 	              	
 	              	 modelPendu.remplirText4(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	              			 pendu.getMotFinal()[3]);
 	              	 break;
 	               case 5:  
 	              	 
 	              	 modelPendu.remplirText5(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	              			 pendu.getMotFinal()[3], pendu.getMotFinal()[4]);
 	              	 break;
 	               case 6:  
 	              	 
 	              	 modelPendu.remplirText6(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	              			 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5]);
 	              	 break;
 	               case 7:  
 	              	 
 	              	 modelPendu.remplirText7(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	              	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], pendu.getMotFinal()[6]);
 	              	 break;
 	               case 8:  
 	              	 
 	              	 modelPendu.remplirText8(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	                      	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
 	                      	 pendu.getMotFinal()[6], pendu.getMotFinal()[7]);
 	              	 break;
 	               case 9:  
 	              	
 	              	 modelPendu.remplirText9(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	                      	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
 	                      	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8]);
 	              	 break;
 	               case 10:  
 	              	 
 	              	 modelPendu.remplirText10(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	                      	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
 	                      	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9]);
 	              	 break;
 	               case 11:  
 	              	 
 	              	 modelPendu.remplirText11(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	                      	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
 	                      	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9],
 	                      	 pendu.getMotFinal()[10]);
 	              	 break;
 	               case 12:  
 	              	
 	              	 modelPendu.remplirText12(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	                      	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
 	                      	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9],
 	                      	 pendu.getMotFinal()[10],pendu.getMotFinal()[11]);
 	              	 break;
 	               case 13:  
 	              	 
 	              	 modelPendu.remplirText13(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	                      	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
 	                      	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9],
 	                      	 pendu.getMotFinal()[10],pendu.getMotFinal()[11], pendu.getMotFinal()[12]);
 	              	 break;
 	               case 14:  
 	              	 
 	              	 modelPendu.remplirText14(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	                      	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
 	                      	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9],
 	                      	 pendu.getMotFinal()[10],pendu.getMotFinal()[11], pendu.getMotFinal()[12], pendu.getMotFinal()[13]);
 	              	 break;
 	               case 15:  
 	              	
 	              	 modelPendu.remplirText15(pendu.getMotFinal()[0], pendu.getMotFinal()[1], pendu.getMotFinal()[2], 
 	                      	 pendu.getMotFinal()[3], pendu.getMotFinal()[4], pendu.getMotFinal()[5], 
 	                      	 pendu.getMotFinal()[6], pendu.getMotFinal()[7], pendu.getMotFinal()[8], pendu.getMotFinal()[9],
 	                      	 pendu.getMotFinal()[10],pendu.getMotFinal()[11], pendu.getMotFinal()[12], pendu.getMotFinal()[13], 
 	                      	 pendu.getMotFinal()[14]);
 	              	 break;
 	               }
 	            	}else {
 	            		modelPendu.perdu();
 	            		StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.append("Le mot etait : ");
						stringBuilder.append(pendu.getMot());
						modelPendu.getSolution().setText(stringBuilder.toString());
						modelPendu.getSolution().setVisible(true);
 	            	}
 	            	if(pendu.testMot()) {
 	            		modelPendu.Gagner();
 	            	}
 	            	modelPendu.getChampLettre().clear(); 
 	            }
 	        });
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  
   
    
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}