package org.example;

public class Team {
    private String name;
    private String city;
    private String mascot;
    private Iterable<Player> players;
    static Integer maxNumberOfPlayers = 15;
    static Integer salaryCap = 109140000;
    Integer totalSalaries = 0;
    Integer availableFunds = 0;
    Integer openSlots = 0;
    Integer countOfPlayers =0;

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

    public Integer getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }


    public Integer getSalaryCap() {
        return salaryCap;
    }

    public Integer getAvailableFunds(Iterable<Player> players){
        for(Player player : players){
           totalSalaries+= player.getSalary();
        }
        availableFunds = salaryCap - totalSalaries;
        return availableFunds;
    }

    public Integer getOpenSlots(Iterable<Player> players){
        for(Player player : players){
            countOfPlayers+= countOfPlayers;
        }
        openSlots =maxNumberOfPlayers-countOfPlayers;
        return openSlots;
    }

    public void addPlayer() throws Exception{
            if(openSlots >0 && availableFunds >0){
                Player playerToAdd = new Player("newGuy", countOfPlayers+1);
            }else {
                throw new OverMaxException();
            }
        }
    }

