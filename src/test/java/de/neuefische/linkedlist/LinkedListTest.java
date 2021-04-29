package de.neuefische.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    public void testToStringOfEmptyList(){
        // Given
        LinkedList list = new LinkedList();

        // When
        String actual = list.toString();

        // Then
        assertEquals("", actual);
    }

    @Test
    public void testAdd(){
        // Given
        LinkedList list = new LinkedList();
        list.add(new Animal("Capybara"));
        list.add(new Animal("Squirrel"));
        list.add(new Animal("Dog"));

        // When
        String actual = list.toString();

        // Then
        String expected = "Capybara -> Squirrel -> Dog";
        assertEquals(expected, actual);
    }

    @Test
    public void testAddOnlyOneItem(){
        // Given
        LinkedList list = new LinkedList();
        list.add(new Animal("Dog"));

        // When
        String actual = list.toString();

        // Then
        assertEquals("Dog", actual);
    }
}