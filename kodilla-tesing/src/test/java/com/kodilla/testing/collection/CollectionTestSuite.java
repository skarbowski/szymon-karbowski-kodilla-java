package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

import static java.util.OptionalDouble.empty;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test case : start");
    }

    @After
    public void after() {
        System.out.println("Test case : stop");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        assertTrue("custom error message",result.isEmpty());
    }


    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        assertFalse("customer error message Normal List", result.isEmpty());
        assertEquals(1, result.size());
        for (Integer element : result){
            assertTrue(element % 2 == 0);
        }
    }






}