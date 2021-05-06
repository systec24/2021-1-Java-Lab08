package edu.handong.csee.java.hw2.converters;
/**
 * This Convertible interface is created to be implemented by unit conversion classes.
 */
public interface Convertible {
    /**
     * A function that receives the value the user input.
     * @param fromValue
     */
    public void setFromValue(double fromValue);
    /**
     * A function that returns converted value.
     * @return
     */
    public double getConvertedValue();
    /**
     * A function that converts given values into requested units.
     */
    public void convert();

}