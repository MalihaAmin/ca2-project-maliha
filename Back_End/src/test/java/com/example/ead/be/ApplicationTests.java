package com.example.ead.be;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApplicationTests {

	private Persistence persistence;

    @BeforeEach
    void setUp() {
        // Set up a new instance of Persistence before each test
        persistence = new Persistence("mongodb+srv://aminmaliha:mongo@cluster0.pewmw6y.mongodb.net/", "ead_ca2", "ead_2024");
    }

    @AfterEach
    void tearDown() {
        // Clean up resources after each test, if necessary
        // For example, close any connections or reset the database state
    }

	@Test
    void testAddRecipes() {
        // Add new recipes to the database
        int initialCount = persistence.getAllRecipes().size();
        int addedCount = persistence.addRecipes(Persistence.recipes);

        // Assert that the number of added recipes matches the number of initial recipes
        assertEquals(Persistence.recipes.size(), addedCount);

        // Assert that the total count of recipes in the database increased by the added count
        assertEquals(initialCount + addedCount, persistence.getAllRecipes().size());
    }

    @Test
    void testDeleteRecipes() {
        // Add recipes to the database for deletion
        int addedCount = persistence.addRecipes(Persistence.recipes);
        int initialCount = persistence.getAllRecipes().size();

        // Delete the added recipes from the database
        int deletedCount = persistence.deleteRecipesByName(List.of("elotes", "fried rice"));

        // Assert that the number of deleted recipes matches the number of added recipes
        assertEquals(addedCount, deletedCount);

        // Assert that the total count of recipes in the database decreased by the deleted count
        assertEquals(initialCount - deletedCount, persistence.getAllRecipes().size());
    }



}
