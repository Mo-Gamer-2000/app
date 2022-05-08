// Package app Imported
package com.mycompany.app;

// import Serializable
import java.io.Serializable;

/**
 *
 * @author moeez
 */
//Public class called Locations created
public class Locations implements Serializable {

    String address;
    String City;
    String postcode;
    String country;

    /**
     * Locations constructor created with parameters
     *
     * @param address
     * @param City
     * @param postcode
     * @param country
     */
    public Locations(String address, String City, String postcode, String country) {
        this.address = address;
        this.City = City;
        this.postcode = postcode;
        this.country = country;
    }

    /**
     * Get method created for address
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Get method created for city
     *
     * @return city
     */
    public String getCity() {
        return City;
    }

    /**
     * Get method created for postcode
     *
     * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Get method created for country
     *
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set method created for address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get method created for city
     *
     * @param City
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get method created for postcode
     *
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Get method created for country
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }
}
