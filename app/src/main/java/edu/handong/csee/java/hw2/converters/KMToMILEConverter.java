package edu.handong.csee.java.hw2.converters;
/**
 * This KMToMILEConverter class converts received KM values into MILE units.
 */
public class KMToMILEConverter implements Convertible{
    private double KM;
    private double MILE;
    /**
     * Receives and saves received value from user.
     */
    public void setFromValue(double fromValue) {
        KM = fromValue;
    }
    /**
     * Converts KM unit values into MILE unit values.
     */
    public void convert() {
        MILE = KM/1.6;
    }
    /**
     * Returns converted value into main function. 
     * @return
     */
    public double getConvertedValue() {
        return MILE;
    }
    
}
