package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

  @Test
  void testBackstage1() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    
    
    if(element.name == "Backstage passes to a TAFKAL80ETC concert" & element.sellIn == 15){
        assertThat(element.quality, is(20));
        }
    if(element.name == "Backstage passes to a TAFKAL80ETC concert" & element.quality == 20){
        assertThat(element.sellIn, is(15));
        }
    if(element.name == "Backstage passes to a TAFKAL80ETC concert" & element.quality == 20){
        assertThat(element.sellIn, is(not(10)));
        }
    }
    
  @Test
  void testBackstage2() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    
    
    if(element.name == "Backstage passes to a TAFKAL80ETC concert" & element.sellIn == 11){
        assertThat(element.quality, is(49));
        }
    }
    
  @Test
  void testBackstage3() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    
    
    if(element.name == "Backstage passes to a TAFKAL80ETC concert" & element.sellIn == 6){
        assertThat(element.quality, is(49));
        }
    }
    
  @Test
  void testBackstage4() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, -1);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    
    
    if(element.name == "Backstage passes to a TAFKAL80ETC concert" & element.sellIn == 5){
        assertThat(element.quality, is(-1));
        }
    }
    
    @Test
    void testBackstage5() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", -5, -1);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        
        
        if(element.name == "Backstage passes to a TAFKAL80ETC concert" & element.sellIn == -5){
            assertThat(element.quality, is(-1));
            }
        }
        

    
    @Test
    void testBrie1() {
        Item element = new Item("Aged Brie", 2, 0);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        
        
        if(element.name == "Aged Brie" & element.sellIn >= 2){
            assertThat(element.quality, is(0));
            }
        if(element.name == "Aged Brie" & element.quality == 0){
            assertThat(element.sellIn, is(2));
            }
        }
        
    @Test
    void testBrie2() {
        Item element = new Item("Aged Brie", -2, -10);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        
        
        if(element.name == "Aged Brie" & element.sellIn == -2){
            assertThat(element.quality, is(-10));
            }
        if(element.name == "Aged Brie" & element.quality == -10){
            assertThat(element.sellIn, is(-2));
            }
        }
        
    @Test
    void testBrie3() {
        Item element = new Item("Aged Brie", 1, 51);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        
        
        if(element.name == "Aged Brie" & element.sellIn == 1){
            assertThat(element.quality, is(51));
            }
        if(element.name == "Aged Brie" & element.quality == 51){
            assertThat(element.sellIn, is(not(1)));
            }
        }
        
    @Test
    void testBrie4() {
        Item element = new Item("Aged Brie", -1, 51);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        
        
        if(element.name == "Aged Brie" & element.sellIn == -1){
            assertThat(element.quality, is(51));
            }
        if(element.name == "Aged Brie" & element.quality == 51){
            assertThat(element.sellIn, is(not(-1)));
            }
        }

    @Test
    void testSulfuras1() {
        Item element = new Item("Sulfuras, Hand of Ragnaros", 0, 80);

        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        
        
        if(element.name == "Sulfuras, Hand of Ragnaros" & element.sellIn == 0){
            assertThat(element.quality, is(80));
            }
        if(element.name == "Sulfuras, Hand of Ragnaros" & element.quality == 80){
            assertThat(element.sellIn, is(0));
            }
    }
        
    @Test
    void testSulfuras2() {

        Item element = new Item("Sulfuras, Hand of Ragnaros", -1, 80);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        
        
        if(element.name == "Sulfuras, Hand of Ragnaros" & element.sellIn <= -1){
            assertThat(element.quality, is(80));
            }
        if(element.name == "Sulfuras, Hand of Ragnaros" & element.quality == 80){
            assertThat(element.sellIn, is(-1));
            }

    }
    
    @Test
    void testSulfuras3() {

        Item element = new Item("Sulfuras, Hand of Ragnaros", -1, -1);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        
        
        if(element.name == "Sulfuras, Hand of Ragnaros" & element.sellIn <= -1){
            assertThat(element.quality, is(-1));
            }
        if(element.name == "Sulfuras, Hand of Ragnaros" & element.quality == -1){
            assertThat(element.sellIn, is(-1));
            }

    }

    @Test
    void testDexterity() {
        Item element = new Item("+5 Dexterity Vest", -2, 20);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        
        
        if(element.name == "+5 Dexterity Vest" & element.sellIn == -2){
            assertThat(element.quality, is(20));
            }
        if(element.name == "+5 Dexterity Vest" & element.quality == 20){
            assertThat(element.sellIn, is(-2));
            }
    }

    /*
    @Test
    void testConjured() {
        Item element = new Item("Conjured Mana Cake", 3, 6);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        
        
        if(element.name == "Conjured Mana Cake" & element.sellIn == 3){
            assertThat(element.quality, is(6));
            }
        if(element.name == "Conjured Mana Cake" & element.quality == 6){
            assertThat(element.sellIn, is(3));
            }
    }*/
    
    
    
}
