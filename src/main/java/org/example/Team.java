package org.example;

public class Team {
    private String name;
    private String city;
    private String mascot;
    private Iterable<Player> players;
    static int maxNumberOfPlayers = 3;
    static int salaryCap = 750000;
    int totalSalaries;
    int availableFunds;
    int  openSlots;
    int countOfPlayers;

    public Team(String city, String name){
        this.name = name;
        this.city = city;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public Iterable<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Iterable<Player> players) {
        this.players = players;
    }

    public int getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }


    public int getSalaryCap() {
        return salaryCap;
    }

    public int getTotalSalaries(Iterable<Player> players) {
        for (Player player : players) {
            totalSalaries += player.getSalary();
        }
        return totalSalaries;
    }

    public int getAvailableFunds(){
        availableFunds = salaryCap - getTotalSalaries(players);
        return availableFunds;
    }

    public Integer getCountOfPlayers(Iterable<Player> players) {
        for (Player player : players) {
            countOfPlayers ++;
        }
        return countOfPlayers;
    }

    public Integer getOpenSlots(){
        openSlots =maxNumberOfPlayers-getCountOfPlayers(players);
        return openSlots;
    }

    public void addPlayer(Player player) throws Exception{
            if(openSlots >0 && availableFunds >0){
                player = new Player(player.getName(), player.getNumber());
            }else {
                throw new OverMaxException();
            }
        }
    }

