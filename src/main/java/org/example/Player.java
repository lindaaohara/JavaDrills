package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Player {
    private String name;
    private int number;
    private String position;
    private Double height;
    private Double shootingAverage;
    private int salary =0;
    private int points = 0;
    private Random random;

    public Player(String name, Integer number) {
        this.name = name;
        this.number = number;
        this.random = new Random();
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getShootingAverage() {
        return shootingAverage;
    }

    public void setShootingAverage(Double shootingAverage) {
        this.shootingAverage = shootingAverage;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    public void shoot() throws Exception{

        Double randomNumber = this.random.nextDouble();
        if(this.shootingAverage>=randomNumber){
            points+=2;
        }else{
            throw new MissedShotException();
        }
    }

    public int getPoints(){
        return points;
    }
}
