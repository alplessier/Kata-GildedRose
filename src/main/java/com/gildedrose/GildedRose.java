package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
    
        for (int i = 0; i < items.length; i++) {
        
        switch(items[i].name){
   
       case "Aged Brie": 
           items[i].quality = agedBrieQuality(items[i].quality);
           items[i].sellIn = agedBrieSellIn(items[i].sellIn);
           break;
   
       case "Sulfuras, Hand of Ragnaros":
           items[i].quality = vieillissementAgedBrie(items[i].quality);
           break;
   
       case "Backstage passes to a TAFKAL80ETC concert":
           items[i].quality = backstage(items[i].quality,items[i].sellIn);
           items[i].sellIn = modificationSellIn(items[i].sellIn);
           break;
       default:
           break;
        }
    }
}
    
    public int agedBrieQuality(int q)
    {
        if(!isSellIn0(q))
            return vieillissementAgedBrie(q);
        else if(isQualityMax(q))
            return q;
        else return modificationQualityRapide(q);
    }
    
    public int agedBrieSellIn(int si)
    {
        return modificationSellIn(si);
    }
    
    public int vieillissementAgedBrie(int q)
    {
        if(!isQualityMax(q))
            return q = q++;
        return q;
        
    }
    
    public int backstage(int q, int si)
    {
        if(si > 10)
            return vieillissementAgedBrie(q);
        else if( si <= 10 && si > 5)
            return modificationBackstageNiveau1(q);
        else if( si > 0)
            return modificationBackstageNiveau2(q);
        else return 0;
    }
    
    
    public int modificationBackstageNiveau1(int q)
    {
        if(q <= 48)
            return q+2;
        return q;
            
    }
    
    public int modificationBackstageNiveau2(int q)
    {
        if(q <= 47)
            return q+3;
        return q;
    }
    
    
    public boolean isQuality0( int q)
    {
        if(q == 0)
            return true;
        return false;
    }
    
    public boolean isSellIn0(int si)
    {
        if(si == 0)
            return true;
        return false;
    }
    
    public int modificationQualityNormal(int q)
    {
        if(!isQuality0(q))
            return q--;
        return q;
    }
    
    public int modificationQualityRapide(int q)
    {   
        if(!isQuality0(q) && isModifiableRapide(q))
            return q-2;
        else if(!isQuality0(q))
            return q-1;
        else return q;
            
    }
    
    public boolean isModifiableRapide(int q)
    {
        if(q-2 > 0)
            return true;
        return false;
    }
    
    public int modificationSellIn(int si)
    {
        if(!isSellIn0(si))
            return si--;
        return si;
    }
    
    public boolean isQualityMax(int q)
    {
        if(q == 50)
            return true;
        return false;
    }
    
}
