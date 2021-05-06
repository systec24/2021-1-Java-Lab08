package edu.handong.csee.java.hw2.converters;
/**
 * This MILEToKMConverter class converts received MILE values into KM units.
 */
public class MILEToKMConverter implements Convertible{
    private double MILE;
    private double KM;
    /**
     * Receives and saves received value from user.
     */
    public void setFromValue(double fromValue) {
        MILE = fromValue;
    }
    /**
     * Converts MILE unit values into KM unit values.
     */
    public void convert() {
        KM = MILE*1.6;
    }
    /**
     * Returns converted value into main function. 
     * @return
     */
    public double getConvertedValue() {
        return KM;
    }
}
