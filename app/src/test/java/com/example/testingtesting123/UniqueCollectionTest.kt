package com.example.testingtesting123

import org.junit.Before
import org.junit.Test

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }


    // TODO 1: Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {

        val testItem = Item("test1")

        // Add the item to collection
        collection.addItem(testItem)

        assert(collection.size() == 1) { "Collection size should be 1" }
        assert(collection.get(0).name == "test1") { "Item name should match" }
    }

    // TODO 2: Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        val item1 = Item("random")
        val item2 = Item("random")

        collection.addItem(item1)
        collection.addItem(item2)

        assert(collection.size() == 1) { "Collection should not accept duplicate items" }
        assert(collection.get(0).name == "random") { "Item name should match" }
    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size();

        assert(originalSize == 2 && newSize == 0) {"Items not cleared"}
    }
}