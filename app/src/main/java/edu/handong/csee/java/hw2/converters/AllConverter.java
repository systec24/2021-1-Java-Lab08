package edu.handong.csee.java.hw2.converters;
/**
 * This AllConverter class calculates Tons to KG and G or KM to MILE or M depending on the user's input.
 */
public class AllConverter {

    private double fromValue;
    private String originalMeasure;
    /**
     * Gets the conversion unit to convert
     * @param s
     * @return
     */
    public AllConverter setOriginalMeasure(String s) {
        this.originalMeasure = s;
        return this;
    }
    /**
     * Gets the value to convert
     * @param x
     * @return
     */
    public AllConverter setFromValue(double x) {
        this.fromValue = x;
        return this;
    }
    /**
     * Converts the received unit and value to other units (Tons to KG + G, KM to MILE + M)
     */
    public void convertAndPrintOut() {
        if(originalMeasure.equals("TON")) {
            System.out.println(fromValue +" " + originalMeasure + " to " + (fromValue*1000) + " KG");
            System.out.println(fromValue +" " + originalMeasure + " to " + (fromValue*1000000) + " G");
        } else if(originalMeasure.equals("KM")){
            System.out.println(fromValue +" " + originalMeasure + " to " + (fromValue*1000) + " M");
            System.out.println(fromValue +" " + originalMeasure + " to " + (fromValue/1.6) + " MILE");
        } else if(originalMeasure != "TON" || originalMeasure != "KM"){
            System.out.println("AllConverter cannot support the measure!");
        }
    }
}