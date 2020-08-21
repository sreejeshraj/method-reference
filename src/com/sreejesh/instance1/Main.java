package com.sreejesh.instance1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;


public class Main {

    public static void main(String[] args) {

        List<ShipmentWeightCalculator> listOfShipmentWeightCalculator = Arrays.asList(
                new ShipmentWeightCalculator(),
                new ShipmentWeightCalculator(),
                new ShipmentWeightCalculator(),
                new ShipmentWeightCalculator()
        );


// Using an anonymous class
        List<Double> listOfIndividualShipmentWeightsUsingAnonymousClass = ShipmentWeightCalculator.getListOfIndividualShipmentWeights(listOfShipmentWeightCalculator, new Function<ShipmentWeightCalculator, Double>() {
            @Override
            public Double apply(ShipmentWeightCalculator shipmentWeightCalculator) {
                double weightOfSingleItem = shipmentWeightCalculator.calculateWeightOfSingleItem();
                return weightOfSingleItem;
            }
        });


// Using a lambda expression

        ShipmentWeightCalculator.getListOfIndividualShipmentWeights(listOfShipmentWeightCalculator, shipmentWeightCalculator -> {
            double weightOfSingleItem = shipmentWeightCalculator.calculateWeightOfSingleItem();
            return weightOfSingleItem;
        });

        ShipmentWeightCalculator.getListOfIndividualShipmentWeights(listOfShipmentWeightCalculator, shipmentWeightCalculator -> shipmentWeightCalculator.calculateWeightOfSingleItem());

// Using a method reference
        ShipmentWeightCalculator.getListOfIndividualShipmentWeights(listOfShipmentWeightCalculator, ShipmentWeightCalculator::calculateWeightOfSingleItem);

        int otherNumber = 3;
        List<MySpecialNumber> mySpecialNumberList = List.of(
                new MySpecialNumber(20),
                new MySpecialNumber(30),
                new MySpecialNumber(40),
                new MySpecialNumber(50),
                new MySpecialNumber(60),
                new MySpecialNumber(70),
                new MySpecialNumber(80)
        );

        areMySpecialNumbersDivisibleBy(mySpecialNumberList, otherNumber, new BiFunction<MySpecialNumber, Integer, Boolean>() {
            @Override
            public Boolean apply(MySpecialNumber mySpecialNumber, Integer otherNumber) {
                return mySpecialNumber.isMySpecialNumberDivisibleBy(otherNumber);
            }
        });

        areMySpecialNumbersDivisibleBy(mySpecialNumberList, otherNumber, (mySpecialNumberList2, otherNumber2) -> mySpecialNumberList2.isMySpecialNumberDivisibleBy(otherNumber2));

        areMySpecialNumbersDivisibleBy(mySpecialNumberList, otherNumber, MySpecialNumber::isMySpecialNumberDivisibleBy);

        Supplier<Car> carSupplier = Car::new;
        Car car1 = carSupplier.get();
        System.out.println(car1);

        Function<String, Car> carFunction = Car::new;
        Car car2 = carFunction.apply("red");
        System.out.println(car2);

        myMethod("white", Car::new);

        Consumer<Car> carConsumerDriving2 = car -> car.drive();
        Consumer<Car> carConsumerDriving = Car::drive;
        carConsumerDriving.accept(car1);
        carConsumerDriving.accept(new Car());
        carConsumerDriving.accept(carSupplier.get());

//        The below line will cause error at line 82
//        Car car3 = new Car();
        Consumer<Car> carConsumerDriving3 = car3 -> car3.drive();


        Runnable carRunnable = car1::drive;
        carRunnable.run();

        Supplier<String> carSupplier2 = car2::getColour;
        System.out.println(carSupplier2.get());

        Car myExistingCar = new Car();
        myExistingCar.drive();



        Runnable carRunnable2 = () -> myExistingCar.drive();
        Runnable carRunnable3 = myExistingCar::drive;

        Supplier<String> toStringSupplier = () -> myExistingCar.toString();
        Supplier<String> toStringSupplier2 = myExistingCar::toString;

        Supplier<String> toStringSupplier3 = () -> myExistingCar.getColour();
        Supplier<String> toStringSupplier4 = myExistingCar::getColour;



    }


    public static List<Boolean> areMySpecialNumbersDivisibleBy(List<MySpecialNumber> mySpecialNumberList, int otherNumber, BiFunction<MySpecialNumber, Integer, Boolean> biFunction) {
        List<Boolean> booleanList = new ArrayList<>();

        for (MySpecialNumber mySpecialNumber : mySpecialNumberList) {
        //    boolean IsMySpecialNumberDivisibleBy = mySpecialNumber.isMySpecialNumberDivisibleBy(otherNumber);
            boolean IsMySpecialNumberDivisibleBy = biFunction.apply(mySpecialNumber,otherNumber);
            booleanList.add(IsMySpecialNumberDivisibleBy);
        }

        return booleanList;
    }

    public static void myMethod(String colour, Function<String, Car> carFunction)
    {
        carFunction.apply(colour);
    }


}
