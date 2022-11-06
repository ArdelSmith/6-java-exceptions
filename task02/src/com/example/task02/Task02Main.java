package com.example.task02;

public class Task02Main {

    public enum Months{
        январь,
        февраль,
        март,
        апрель,
        май,
        июнь,
        июль,
        август,
        сентябрь,
        октябрь,
        ноябрь,
        декабрь
    }
    public static void main(String[] args) {

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
        try{
            if (1 <= monthNumber & monthNumber <= 12){
                if (monthNumber <= 2 | monthNumber == 12) return "зима";
                if (monthNumber <= 5) return "весна";
                if (monthNumber <= 8) return "лето";
                else return "осень";
            }
            else {
                String exText = String.format("monthNumber %s is invalid, month number should be between 1..12", monthNumber);
                throw new IllegalArgumentException(exText);
            }
        }
        catch(IllegalArgumentException e){
            throw e;
        }
    }
}