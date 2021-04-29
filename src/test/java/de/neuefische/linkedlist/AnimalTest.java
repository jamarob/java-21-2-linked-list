package de.neuefische.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AnimalTest {

    @Test
    public void testToString(){
        // Given
        Animal animal = new Animal("Capybara");

        // When
        String actula = animal.toString();

        // Then
        assertEquals("Capybara", actula);

    }

}