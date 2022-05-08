//Package Imported
package com.mycompany.app;

// import Serializable
import java.io.Serializable;

/**
 *
 * @author moeez
 */
//Public class called Pet created
public class Pet implements Serializable {

    String petType;
    String petBreed;
    String petName;
    String petAge;
    String petWeight;

    /**
     * Pet constructor created with parameters
     *
     * @param petType
     * @param petBreed
     * @param petName
     * @param petAge
     * @param petWeight
     */
    public Pet(String petType, String petBreed, String petName, String petAge, String petWeight) {
        this.petType = petType;
        this.petBreed = petBreed;
        this.petName = petName;
        this.petAge = petAge;
        this.petWeight = petWeight;
    }

    /**
     * Get method created for petType
     *
     * @return petType
     */
    public String getPetType() {
        return petType;
    }

    /**
     * Get method created for petBreed
     *
     * @return petBreed
     */
    public String getPetBreed() {
        return petBreed;
    }

    /**
     * Get method created for petName
     *
     * @return petName
     */
    public String getPetName() {
        return petName;
    }

    /**
     * Get method created for petAge
     *
     * @return petAge
     */
    public String getPetAge() {
        return petAge;
    }

    /**
     * Get method created for petWeight
     *
     * @return petWeight
     */
    public String getPetWeight() {
        return petWeight;
    }

    /**
     * Set method created for petType
     *
     * @param petType
     */
    public void setPetType(String petType) {
        this.petType = petType;
    }

    /**
     * Set method created for petBreed
     *
     * @param petBreed
     */
    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    /**
     * Set method created for petName
     *
     * @param petName
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }

    /**
     * Set method created for petAge
     *
     * @param petAge
     */
    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }

    /**
     * Set method created for petWeight
     *
     * @param petWeight
     */
    public void setPetWeight(String petWeight) {
        this.petWeight = petWeight;
    }
}
