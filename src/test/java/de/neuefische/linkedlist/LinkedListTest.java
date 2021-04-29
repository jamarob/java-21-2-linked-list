package de.neuefische.linkedlist;

import org.junit.jupiter.api.Test;

import java.net.Authenticator;

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

    @Test
    public void testRemove(){
        // Given
        LinkedList list = new LinkedList();
        list.add(new Animal("Capybara"));
        list.add(new Animal("Squirrel"));
        list.add(new Animal("Squirrel"));
        list.add(new Animal("Dog"));
        list.add(new Animal("Squirrel"));
        list.add(new Animal("Squirrel"));

        // When
        list.remove(new Animal("Squirrel"));
        String actual = list.toString();

        // Then
        String expected = "Capybara -> Dog";
        assertEquals(expected, actual);
    }

    @Test
    public void removeOnEmptyList(){
        // Given
        LinkedList list = new LinkedList();

        // When
        list.remove(new Animal("Squirrel"));
        String actual = list.toString();

        // Then
        assertEquals("", actual);
    }

    @Test
    public void removeCompleteList(){
        // Given
        LinkedList list = new LinkedList();
        list.add(new Animal("Squirrel"));
        list.add(new Animal("Squirrel"));
        list.add(new Animal("Squirrel"));
        list.add(new Animal("Squirrel"));

        // When
        list.remove(new Animal("Squirrel"));
        String actual = list.toString();

        // Then
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveWhenElementNotFound(){
        // Given
        LinkedList list = new LinkedList();
        list.add(new Animal("Capybara"));
        list.add(new Animal("Squirrel"));
        list.add(new Animal("Dog"));
        list.add(new Animal("Squirrel"));

        // When
        list.remove(new Animal("Cat"));
        String actual = list.toString();

        // Then
        String expected = "Capybara -> Squirrel -> Dog -> Squirrel";
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveFirstElements(){
        // Given
        LinkedList list = new LinkedList();
        list.add(new Animal("Capybara"));
        list.add(new Animal("Capybara"));
        list.add(new Animal("Squirrel"));
        list.add(new Animal("Dog"));

        // When
        list.remove(new Animal("Capybara"));
        String actual = list.toString();

        // Then
        String expected = "Squirrel -> Dog";
        assertEquals(expected, actual);
    }
}