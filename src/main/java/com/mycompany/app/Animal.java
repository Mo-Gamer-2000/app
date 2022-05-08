// Package Imported
package com.mycompany.app;

// import Serializable
import java.io.Serializable;

/**
 * Class used to record the details of a animal / pet
 *
 * @author Moeez
 * @version 2.0
 */


// Public class called Animal created
public class Animal implements Serializable {

    String name;
    String age;
    String weight;
    String breed;
    String type;
    String gender;
    String colour;
    String illnesses;
    String ownerName;
    String ownerSurname;
    String ownerAddress;

   /**
    * 
    * @param type
    * @param breed
    * @param name
    * @param age
    * @param weight
    * @param ownerName
    * @param ownerSurname
    * @param ownerAddress
    * @param gender
    * @param colour
    * @param illnesses 
    */
    
    public Animal(String type, String breed, String name, String age, String weight, String ownerName, String ownerSurname, String ownerAddress, String gender, String colour, String illnesses) {
        
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.type = type;
        this.gender = gender;
        this.colour = colour;
        this.illnesses = illnesses;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.ownerAddress = ownerAddress;
    }

    /**
     * Get method created for type
     *
     * @return Type
     */
    public String getType() {
        return type;
    }

    /**
     * Set method created for type
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get method created for breed
     *
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Set method created for Breed
     *
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Get method created for Name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set method created for Name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get method created for Age
     *
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * Set method created for Age
     *
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * Get method created for Weight
     *
     * @return weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Set method created for Weight
     *
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * Get method created for OwnerName
     *
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Set method created for OwnerName
     *
     * @param ownerName
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Get method created for OwnerSurname
     *
     * @return ownerSurname
     */
    public String getOwnerSurname() {
        return ownerSurname;
    }

    /**
     * Set method created for OwnerSurname
     *
     * @param ownerSurname
     */
    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    /**
     * Get method created for OwnerContactNumber
     *
     * @return ownerContactNumber
     */
    public String getOwnerAddress() {
        return ownerAddress;
    }

    /**
     * Set method created for OwnerContactNumber
     *
     * @param ownerAddress
     */
    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    /**
     * Get method created for Gender
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set method created for Gender
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Get method created for Colour
     *
     * @return colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * Set method created for Colour
     *
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Get method created for Illnesses
     *
     * @return illnesses
     */
    public String getIllnesses() {
        return illnesses;
    }

    /**
     * Set method created for Illnesses
     *
     * @param illnesses
     */
    public void setIllnesses(String illnesses) {
        this.illnesses = illnesses;
    }
}
