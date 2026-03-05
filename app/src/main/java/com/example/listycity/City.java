package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    /**
     * This is the name of the city.
     */
    private String city;
    /**
     * This is the name of the province.
     */
    private String province;

    /**
     * This is the constructor for the City class.
     * @param city
     * This is the name of the city
     * @param province
     * This is the name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the name of the city
     * @return
     * Return the city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This returns the name of the province
     * @return
     * Return the province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This compares two cities by their name
     * @param city
     * This is the city to compare to
     * @return
     * Return the comparison result
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

    /**
     * This checks if two cities are equal based on name and province
     * @param o
     * The object to compare with
     * @return
     * True if they are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    /**
     * This generates a hash code for the city
     * @return
     * The hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
