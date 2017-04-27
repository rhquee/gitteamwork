package pl.kfrak;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-04-27.
 */
public class ChangeTest {

    @Test
    public void getChangeNominals_shouldReturnCorrectMultipleFor1374(){
        //given
        int amount = 16;
        int[] expectedNominals = new int[]{10, 5, 1};

        //when

        //dla niestatycznej najpierw utworzyc obiekt, a później ją wywołać:
        //List<Integer> changeNominals = new Change().getChangeNominals(amount);

        //dla statycznej:
        List<Integer> changeNominals = Change.getChangeNominals(amount);

        //then
//        assertTrue(changeNominals.contains(expectedNominals[]));
        checkReturnedNominals(expectedNominals, changeNominals);
    }
    @Test
    public void getChangeNominals_shouldReturnFor2(){
        //given
        //when
        //then

    }

    public void checkReturnedNominals(int[] expected, List<Integer> returned){
        assertEquals(expected.length, returned.size());

        for(int expectedNominal : expected){
            assertTrue(returned.contains(expectedNominal));
        }
    }

    @Test //(expected = IllegalArgumentException.class)
    public void getChangeNominals_shouldReturnExceptionFor1(){
        //given
        //when
        //then
    }

    @Test //(expected = IllegalArgumentException.class)
    public void getChangeNominals_shouldReturnExceptionFor0(){
//given
        //when
        //then
    }

    @Test //(expected = IllegalArgumentException.class)
    public void getChangeNominals_shouldReturnExceptionForNegative(){
//given
        //when
        //then
    }

    @Test //(expected = IllegalArgumentException.class)
    public void getChangeNominals_shouldReturnExceptionForNotNumbers(){
        //given
        //when
        //then
    }

}