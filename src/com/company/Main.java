/*
Quintin Amon
Exercise 4
10 February 2022
*/
package com.company;

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Map<String, Double> cityWeather = new HashMap<>();
    static List<String> cities = new ArrayList<>();
    static List<Double> weather = new ArrayList<>();


    static List<String> cityInput(){
        String city = "";
        while(!(city.equalsIgnoreCase("END"))){
            System.out.println("Enter a city: ");
            city = input.nextLine();
            cities.add(city);
        }
        cities.remove(cities.size()-1);
        return cities;
    }


    static List<Double> weatherAverage(){
        for (String city : cities) {
            List<Double> averageArr = new ArrayList<>();
            System.out.println("What is the temp for the next 5 days in " + city + "?");
            for (int j = 0; j < 5; j++) {
                double k = input.nextDouble();
                averageArr.add(k);
            }
            double average = (averageArr.get(0) + averageArr.get(1) + averageArr.get(2) + averageArr.get(3) + averageArr.get(4));
            average = average / 5.0;
            weather.add(average);
        }
        return weather;
    }


    static Map<String, Double> displayInfo(){
        for (int i = 0; i < cities.size(); i++) {
            String intoMap = cities.get(i);
            Double intToMap = weather.get(i);
            cityWeather.put(intoMap, intToMap);
        }
        return cityWeather;
    }


    public static void main(String[] args) {
        cityInput();
        weatherAverage();
        displayInfo();
        System.out.println(cityWeather);
    }
}
