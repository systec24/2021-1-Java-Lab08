package edu.handong.csee.java.hw2.converters;
/**
 * This TONToKGConverter class converts received TON values into KG units.
 */
public class TONToKGConverter implements Convertible{
    private double TON;
    private double KG;
    /**
     * Receives and saves received value from user.
     */
    public void setFromValue(double fromValue) {
        TON = fromValue;
    }
    /**
     * Converts TON unit values into KG unit values.
     */
    public void convert() {
        KG = TON*1000;
    }
    /**
     * Returns converted value into main function.
     * @return
     */
    public double getConvertedValue() {
        return KG;
    }
}
