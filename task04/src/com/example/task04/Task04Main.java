package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
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
                throw new MyException(exText);
            }
        }
        catch(MyException e){
            throw e;
        }
    }

}