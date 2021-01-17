package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Player {
    private String name;
    private Integer number;
    private String position;
    private Double height;
    private Double shootingAverage;
    private Integer salary;
    private int points = 0;


    public Player(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public Map<Integer,String > playerPosition= new HashMap<>();
    public Map<Integer, Double> playerHeight= new HashMap<>();
    public Map<Integer, Double> playerShootingAverage = new HashMap<>();
    public Map<Integer, Integer> playerSalary = new HashMap<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Map<Integer, String> getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(Map<Integer, String> playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Map<Integer, Double> getPlayerHeight() {
        return playerHeight;
    }

    public void setPlayerHeight(Map<Integer, Double> playerHeight) {
        this.playerHeight = playerHeight;
    }

    public Map<Integer, Double> getPlayerShootingAverage() {
        return playerShootingAverage;
    }

    public void setPlayerShootingAverage(Map<Integer, Double> playerShootingAverage) {
        this.playerShootingAverage = playerShootingAverage;
    }

    public Map<Integer, Integer> getPlayerSalary() {
        return playerSalary;
    }

    public void setPlayerSalary(Map<Integer, Integer> playerSalary) {
        this.playerSalary = playerSalary;
    }


    public void shoot() throws Exception{
        Random rand = new Random();
        Double random = rand.nextDouble();
        if(this.shootingAverage>=random){
            points+=2;
        }else{
            throw new MissedShotException();
        }
    }

    public int getPoints(){
        return points;
    }
}
