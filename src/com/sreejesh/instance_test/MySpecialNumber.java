package com.sreejesh.instance_test;

public class MySpecialNumber {

    private int number;

    public MySpecialNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MySpecialNumber{" +
                "number=" + number +
                '}';
    }

    public boolean isMySpecialNumberDivisibleBy(int otherNumber)
    {
        return (this.number % otherNumber) == 0;
    }


}
