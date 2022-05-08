//Package Imported
package com.mycompany.app;

/**
 * GUI for VeterinarySurgery application
 *
 * @author Moeez
 * @version 2.0
 */
//Import Logs
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

// Public class called VeterinarySurgeryApp 
public class VeterinarySurgeryApp extends Application {

    // this is the trick. Have class that contains an arrayList here
    // this class can be used for added, deleting and searching for items
    // you will create the object in the start method
    private AnimalStore myAnimalList;

    // WIDTH and HEIGHT of GUI stored as constants 
    private final int WIDTH = 1200;
    private final int HEIGHT = 800;

    // visual components - Headers
    private final Label headingLabel = new Label("Veterinary Surgery - Book Now");
    private final Label animalLabel = new Label("Animal / Pet Information");
    
    // Visual components - Owner Information
    private final Label ownerLabel = new Label("Owner's Information");
    private final Label ownerNameLabel = new Label("Owner's Name:");
    private final TextField ownerNameField = new TextField();
    private final Label ownerSurnameLabel = new Label("Owner's Surname:");
    private final TextField ownerSurnameField = new TextField();
    private final Label ownerAddressLabel = new Label("Owners's Address:");
    private final TextField ownerAddressField = new TextField();
    
     // Seperators
    private final Separator sectSeparator = new Separator();
    private final Separator sectSeparator1 = new Separator();
    private final Separator sectSeparator2 = new Separator();
    private final Separator sectSeparator3 = new Separator();
    private final Separator sectSeparator4 = new Separator();

    // visual components - Animal / Pet Information
    // Name Section
    private final Label animalNameLabel = new Label("Name:");
    private final TextField animalNameField = new TextField();

    // Age Section
    private final Label ageLabel = new Label("Age:");
    private final TextField ageField = new TextField();

    // Weight Section
    private final Label weightLabel = new Label("Weight(Kg):");
    private final TextField weightField = new TextField();

    // Breed Section
    private final Label breedLabel = new Label("Breed:");
    private final TextField breedField = new TextField();

    // Type Section
    private final Label typeLabel = new Label("Type:");
    private final TextField typeField = new TextField();

    // Gender Section
    private final Label genderLabel = new Label("Gender:");
    private final TextField genderField = new TextField();

    // Colour Section
    private final Label colourLabel = new Label("Colour:");
    private final TextField colourField = new TextField();

    // Illnesses Section
    private final Label illnessesLabel = new Label("Illnesses:");
    private final TextField illnessesField = new TextField();

   
    // Display animal / pet information
    private final TextArea displayAnimals = new TextArea();

    // Buttons for Book, Store and Clear
    private final Button addButton = new Button("Book Now");
    private final Button storeButton = new Button("Store Now");
    private final Button clearButton = new Button("Clear Now");

    @Override
    public void start(Stage stage) {

        // this is the class to contain the animals. The parameter represents the maximum number of animals
        if (!showPatientsList()) {
            myAnimalList = new AnimalStore(20);
        }
        //create horizontal boxes for the pet and owner details
        HBox animalDetails = new HBox(10);
        HBox ownerDetails = new HBox(10);

        // add all components to HBoxes
        animalDetails.getChildren().addAll(animalNameLabel, animalNameField, ageLabel, ageField, weightLabel, weightField, breedLabel, 
                breedField, typeLabel, typeField, genderLabel, genderField, colourLabel, colourField, illnessesLabel, illnessesField);
        ownerDetails.getChildren().addAll(ownerNameLabel, ownerNameField, ownerSurnameLabel, ownerSurnameField, ownerAddressLabel, ownerAddressField);

        // create VBox
        VBox root = new VBox(10);

        // add all components to VBox
        root.getChildren().addAll(headingLabel, sectSeparator, animalLabel, animalDetails, sectSeparator2, sectSeparator1,
                ownerLabel, ownerDetails, sectSeparator3, displayAnimals, sectSeparator4, addButton, storeButton, clearButton);

        // create the scene
        Scene scene = new Scene(root, Color.web("#FFDD00"));

        // set font of heading
        Font font = new Font("Times New Roman", 40);
        headingLabel.setFont(font);
        font = new Font("Times New Roman", 20);
        animalLabel.setFont(font);
        ownerLabel.setFont(font);

        // set alignment of HBoxes
        animalDetails.setAlignment(Pos.CENTER);
        ownerDetails.setAlignment(Pos.CENTER);
        addButton.setAlignment(Pos.CENTER);
        storeButton.setAlignment(Pos.CENTER);
        clearButton.setAlignment(Pos.CENTER);

        // set alignment and Colour of  VBox 
        root.setAlignment(Pos.CENTER);
        root.setBackground(Background.EMPTY);

        // set minimum and maximum width of components 
        displayAnimals.setMaxSize(400, 700);
        displayAnimals.appendText(myAnimalList.displayAnimals());
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);

        // call private methods for button event handlers
        addButton.setOnAction(e -> addHandler());
        stage.setScene(scene);
        stage.setTitle("Veterinary Surgery App");
        stage.show();

        // call private methods for button event handlers
        storeButton.setOnAction(e -> storePatientsList());
        stage.setScene(scene);
        stage.setTitle("Veterinary Surgery App");
        stage.show();

        // call private methods for button event handlers
        clearButton.setOnAction(e -> clearPatientsList());
        stage.setScene(scene);
        stage.setTitle("Veterinary Surgery App");
        stage.show();
    }

    private void addHandler() {
        String type = typeField.getText();
        String animalName = animalNameField.getText();
        String age = ageField.getText();
        String weight = weightField.getText();
        String ownerName = ownerNameField.getText();
        String breed = breedField.getText();
        String gender = genderField.getText();
        String colour = colourField.getText();
        String illnesses = illnessesField.getText();
        String ownerSurname = ownerSurnameField.getText();
        String ownerAddress = ownerAddressField.getText();
        String storeMessage;

        // check for errors
        if (animalName.length() == 0 || age.length() == 0 || weight.length() == 0 || type.length() == 0 || breed.length() == 0 || gender.length() == 0 || colour.length() == 0 || illnesses.length() == 0) {
            displayAnimals.setText("You must enter the Name, Age, Weight, type, breed, gender, colour and illnesses of the Animal.");
        } else if (ownerName.length() == 0 || ownerSurname.length() == 0 || ownerAddress.length() == 0) {
            displayAnimals.setText("You must enter both your given Name, Surname and Contact Number.");
        } else // ok to add a Tenant
        {

            // Constructor to create a new animal
            Animal myNewAnimal = new Animal(ownerName, ownerSurname, ownerAddress, type, breed, animalName, age, weight, gender, colour, illnesses);
            storeMessage = myAnimalList.addAnimal(myNewAnimal);
            //clear the fields
            ownerNameField.setText("");
            ownerSurnameField.setText("");
            ownerAddressField.setText("");
            animalNameField.setText("");
            ageField.setText("");
            weightField.setText("");
            breedField.setText("");
            typeField.setText("");
            genderField.setText("");
            colourField.setText("");
            illnessesField.setText("");
            displayAnimals.setText("");
            displayAnimals.appendText(storeMessage);
            displayAnimals.appendText("\n\nThe Animal / Pet Currently Awaiting in a Treatment Queue's information is: ");
            displayAnimals.appendText(myAnimalList.displayAnimals());
        }
    }

    // This serializes the data inserted into the Vet app
    private void storePatientsList() {
        try {
            FileOutputStream fileOut = new FileOutputStream("./animalList.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(myAnimalList);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in ./animalList.ser file");
        } catch (IOException myException) {
            myException.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This Deserializes the data from the file and display on the GUI
     *
     * @return is the data that is deserialized, and displayed on the GUI
     */
    private boolean showPatientsList() {
        Object obj;
        try {
            FileInputStream fileIn = new FileInputStream("./animalList.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //read the information in as a object
            obj = in.readObject();
            //cast the object as an Animal
            myAnimalList = (AnimalStore) obj;
            in.close();
            fileIn.close();
            myAnimalList.displayAnimals();
            return true;
        } catch (IOException i) {
            i.printStackTrace();
            return false;
        } catch (ClassNotFoundException c) {
            System.out.println("AnimalStore class not found");
            c.printStackTrace();
            return false;
        }
    }

    // This clears the data in the GUI
    private void clearPatientsList() {
        typeField.setText("");
        breedField.setText("");
        animalNameField.setText("");
        ageField.setText("");
        weightField.setText("");
        genderField.setText("");
        colourField.setText("");
        illnessesField.setText("");
        ownerNameField.setText("");
        ownerSurnameField.setText("");
        ownerAddressField.setText("");
        displayAnimals.setText("");
    }
}
