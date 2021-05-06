package edu.handong.csee.java.hw2.converters;
/**
 * This KMToMConverter class converts received KM values into M units.
 */
public class KMToMConverter implements Convertible {
    private double KM;
    private double M;
    /**
     * Receives and saves received value from user.
     */
    public void setFromValue(double fromValue) {
        KM = fromValue;
    }
    /** 
     * Converts KM unit values into M unit values.
    */
    public void convert() {
        M = KM*1000;
    }
    /**
     * Returns converted value into main function. 
     * @return
     */
    public double getConvertedValue() {
        return M;
    }
}
