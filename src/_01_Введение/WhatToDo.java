package _01_Введение;

public class WhatToDo {
    public static void main(String[] args) {
        boolean isGoodWeather = true;
        boolean isNight = false;
        if (isNight) System.out.println("Спать");
        if (!isNight && isGoodWeather) System.out.println("Гулять");
        if (!isNight && !isGoodWeather) System.out.println("Читать книгу");
    }
}
