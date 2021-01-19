package org.example;

import org.junit.*;
import static java.util.Arrays.asList;


public class TeamTest {
    private static Team testTeam = new Team("Washington", "Mystics");

    static Iterable<Player>players;
    Player player1 = new Player("Elena Delle Donne", 11);
    Player player2 = new Player("Aerial Powers", 23);
    Player player3 = new Player("Emma Meesseman", 33);
    Player player4 = new Player("Tina Charles", 31);




@Before
public void setup(){
    players=asList(player1, player2);
    testTeam.setPlayers(players);
    player1.setSalary(221450);
    player2.setSalary(221450);
    player3.setSalary(221450);
    player4.setSalary(221450);
    int maxNumberOfPlayers = 3;
    int salaryCap = 750000;
}

    @Test
    public void testGetName() {
        String expected = "Mystics";
        String actual = testTeam.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCity(){
        String expected = "Washington";
        String actual = testTeam.getCity();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetOpenSlots(){
    int expected =1;
    int actual = testTeam.getOpenSlots(players);
    Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetAvailableFunds(){
        int expected =307100;
        int actual = testTeam.getAvailableFunds(players);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = OverMaxException.class)
    public void testCannotAddPlayer()throws Exception{
        testTeam.addPlayer(player3);
        testTeam.addPlayer(player4);
        Assert.assertTrue(true);

    }

    @Test(expected = OverMaxException.class)
    public void testOpenSlotsAfterAddingPlayer()throws Exception{
        testTeam.addPlayer(player3);
        int expected = 0;
        int actual = testTeam.getOpenSlots(players);
        Assert.assertEquals(expected, actual);

    }

 }

