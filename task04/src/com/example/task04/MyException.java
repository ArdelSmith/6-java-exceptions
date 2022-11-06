package com.example.task04;

public class MyException extends IllegalArgumentException{
    private String message = null;
    public MyException(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return this.message;
    }
}
