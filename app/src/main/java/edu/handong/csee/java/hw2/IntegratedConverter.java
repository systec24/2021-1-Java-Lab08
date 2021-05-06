package edu.handong.csee.java.hw2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import edu.handong.csee.java.hw2.converters.*; // You will learn the import statement in L11.
/**
 * This IntegratedConverter class contains the main function and runs the program.
 */
public class IntegratedConverter {

    private double fromValue;
    /**
     * This is the main function of the program.
     */
    public static void main(String[] args) {

        IntegratedConverter myConverter = new IntegratedConverter();

        myConverter.run(args);

    }

    private void run(String[] args) {

        fromValue = Double.parseDouble(args[0]);
        String originalMeasure = Util.getUppercaseString(args[1]);
        String targetMeasure = Util.getUppercaseString(args[2]);

        if(!targetMeasure.equals("ALL")) {

            String converterName = "edu.handong.csee.java.hw2.converters." + originalMeasure + "To" + targetMeasure + "Converter";

            try {

                Class<?> converterClass = (Class<?>) Class.forName(converterName);
                Constructor<?> constructor = (Constructor<?>) converterClass.getConstructor();
                Convertible myConverter = (Convertible) constructor.newInstance();
                myConverter.setFromValue(fromValue);
                myConverter.convert();
                System.out.println(fromValue +" " + originalMeasure + " is " + myConverter.getConvertedValue() + " " + targetMeasure + "!");

            } catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                System.out.println("The converter (" + converterName + ") for " + originalMeasure + " to " + targetMeasure + " does not exist!!");
            }

        } else {

            AllConverter myAllConverter = new AllConverter();
            myAllConverter.setFromValue(fromValue).setOriginalMeasure(originalMeasure).convertAndPrintOut();
        }
    }
}

