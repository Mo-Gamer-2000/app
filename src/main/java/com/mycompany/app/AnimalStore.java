//Package Imported
package com.mycompany.app;

/**
 * GUI for VeterinarySurgery application
 *
 * @author Moeez
 * @version 2.0
 */
// import Serializable and ArrayList
import java.io.Serializable;
import java.util.ArrayList;

// Class name AnimalStore created
public class AnimalStore implements Serializable {

    private final ArrayList<Animal> animalsToTreat;
    public final int MAX;

    public AnimalStore(int maxIn) {
        animalsToTreat = new ArrayList<>();
        MAX = maxIn;
    }

    // Class name addAnimal created
    /**
     * If array not full then this adds animal with a Message, and if array full
     * then it will not add animal and display message
     *
     * @param theAnimal
     * @return the messages depending on the array being full or not
     */
    public String addAnimal(Animal theAnimal) {
        if (!isFull()) {
            animalsToTreat.add(theAnimal);
            return theAnimal.name + " Successfully Added.";
        } else {
            return "Currently we do not have spaces to add any more animals.";
        }
    }

    /**
     * Boolean called isEmpty created
     *
     * @return the animals list is empty
     */
    public boolean isEmpty() {
        return animalsToTreat.isEmpty();
    }

    /**
     * Boolean called isFull created
     *
     * @return fullChecker if array is full or not
     */
    public boolean isFull() {
        boolean fullChecker;
        if (animalsToTreat.size() <= MAX) {
            fullChecker = false;
        } else {
            fullChecker = true;
        }
        return fullChecker;
    }

    /**
     * Class called displayAnimals created
     *
     * @return the data inserted in the GUI in the display area
     */
    public String displayAnimals() {
        String output = "\n";
        for (int counter = 0; counter < animalsToTreat.size(); counter++) {

            //Display Animal / Pet Information
            output += "\n" + "Animal / Pet Information: ";
            
            output += "\n" + "Name: " + animalsToTreat.get(counter).name;
            output += "\n" + "Age: " + animalsToTreat.get(counter).age + " Years";
            output += "\n" + "Weight: " + animalsToTreat.get(counter).weight + " Kg";
            output += "\n" + "Breed: " + animalsToTreat.get(counter).breed;
            output += "\n" + "Type: " + animalsToTreat.get(counter).type;
            output += "\n" + "Gender: " + animalsToTreat.get(counter).gender;
            output += "\n" + "Colour: " + animalsToTreat.get(counter).colour;
            output += "\n" + "Illnesses: " + animalsToTreat.get(counter).illnesses;
            
            //Display Owner Information
            output += "\n" + "Owner Information: ";
            output += "\n" + "Name: " + animalsToTreat.get(counter).ownerName;
            output += "\n" + "Surname: " + animalsToTreat.get(counter).ownerSurname;
            output += "\n" + "Address: " + animalsToTreat.get(counter).ownerAddress;
            output += "\n" + "";
            
            output += "\n" + "";
        }
        return output;
    }
}
