package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class TeamTest {
    private static Team testTeam = new Team("Washington", "Mystics");
   // static Integer maxNumberOfPlayers = 3;
   // static Integer salaryCap = 109140000;
    static Iterable<Player>players;
    Player player1 = new Player("Elena Delle Donne", 11);
    Player player2 = new Player("Shirley", 2);
    Player player3 = new Player("Jane", 3);


@Before
public void setup(){
    players=asList(player1, player2, player3);
    testTeam.setPlayers(players);
}

    @Test
    public void getName() {
        String expected = "Mystics";
        String actual = testTeam.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCity(){
        String expected = "Washington";
        String actual = testTeam.getCity();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = OverMaxException.class)
    public void testCannotAddPlayer()throws Exception{
        //when(testTeam.getAvailableFunds( players)).thenReturn(0);
       // when(testTeam.getOpenSlots(players)).thenReturn(0);
        testTeam.addPlayer();
        Assert.assertTrue(true);

    }
//player.setSalary

}
