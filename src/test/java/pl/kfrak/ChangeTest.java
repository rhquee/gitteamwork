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
        int amount = 11;
        int[] expectedNominals = new int[]{10, 1};

        //when

        //dla niestatycznej najpierw utworzyc obiekt, a później ją wywołać:
        //List<Integer> changeNominals = new Change().getChangeNominals(amount);

        //dla statycznej:
        List<Integer> changeNominals = Change.getChangeNominals(amount);

        //then
//        assertTrue(changeNominals.contains(expectedNominals[]));
        checkReturnedNominals(expectedNominals, changeNominals);
    }
    public void checkReturnedNominals(int[] expected, List<Integer> returned){
        assertEquals(expected.length, returned.size());

        for(int expectedNominal : expected){
            assertTrue(returned.contains(expectedNominal));
        }
    }

    @Test
    public void getChangeNominals_shouldReturnFor2(){
        //when
        //then
        //given
    }

    @Test //(expected = IllegalArgumentException.class)
    public void getChangeNominals_shouldReturnExceptionFor1(){
        //when
        //then
        //given
    }

    @Test //(expected = IllegalArgumentException.class)
    public void getChangeNominals_shouldReturnExceptionFor0(){
        //when
        //then
        //given
    }

    @Test //(expected = IllegalArgumentException.class)
    public void getChangeNominals_shouldReturnExceptionForNegative(){
        //when
        //then
        //given
    }

    @Test //(expected = IllegalArgumentException.class)
    public void getChangeNominals_shouldReturnExceptionForNotNumbers(){
        //when
        //then
        //given
    }

}