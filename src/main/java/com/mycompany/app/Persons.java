// Package Imported
package com.mycompany.app;

// import Serializable
import java.io.Serializable;

/**
 *
 * @author moeez
 */
//Public class called Persons created
public class Persons implements Serializable {

    String ownerName;
    String ownerSurname;
    String ownerContactNumber;

    /**
     * persons constructor created with parameters
     *
     * @param ownerName
     * @param ownerSurname
     * @param ownerContactNumber
     */
    public Persons(String ownerName, String ownerSurname, String ownerContactNumber) {
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.ownerContactNumber = ownerContactNumber;
    }

    /**
     * Get method created for ownerName
     *
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Get method created for ownerSurname
     *
     * @return ownerSurname
     */
    public String getOwnerSurname() {
        return ownerSurname;
    }

    /**
     * Get method created for contactNumber
     *
     * @return contactNumber
     */
    public String getContactNumber() {
        return ownerContactNumber;
    }

    /**
     * Set method created for ownerName
     *
     * @param ownerName
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Set method created for ownerSurname
     *
     * @param ownerSurname
     */
    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    /**
     * Set method created for contactNumber
     *
     * @return contactNumber
     */
    public String setContactNumber() {
        return ownerContactNumber;
    }
}
