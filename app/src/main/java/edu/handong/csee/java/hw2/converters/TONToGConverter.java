package edu.handong.csee.java.hw2.converters;
/**
 * This TONToGConverter class converts received TON values into G units.
 */
public class TONToGConverter implements Convertible{
    private double TON;
    private double G;
    /**
     * Receives and saves received value from user.
     */
    public void setFromValue(double fromValue) {
        TON = fromValue;
    }
    /**
     * Converts TON unit values into G unit values.
     */
    public void convert() {
        G = TON*1000000;
    }
    /**
     * Returns converted value into main function.
     */
    public double getConvertedValue() {
        return G;
    }
}
