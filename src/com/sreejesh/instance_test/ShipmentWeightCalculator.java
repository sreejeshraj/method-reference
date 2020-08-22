package com.sreejesh.instance_test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ShipmentWeightCalculator {
    public double calculateWeightOfSingleItem() {
        double weight = 0;
        System.out.println("*** Calculating weight... ***");
        return weight;
    }

    public static List<Double> getListOfIndividualShipmentWeights(List<ShipmentWeightCalculator> shipmentWeightCalculatorList, Function<ShipmentWeightCalculator, Double> function) {
        List<Double> listOfIndividualWeights = new ArrayList<>();
        for (ShipmentWeightCalculator shipmentWeightCalculator : shipmentWeightCalculatorList) {
            listOfIndividualWeights.add(function.apply(shipmentWeightCalculator));
        }
        return listOfIndividualWeights;
    }
}
