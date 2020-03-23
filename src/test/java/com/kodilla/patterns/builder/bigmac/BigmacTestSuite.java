package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sezam")
                .burgers(5)
                .sauce("100 wysp")
                .ingredient("caebula")
                .ingredient("bekon")
                .sauce("standard")
                .build();
        System.out.println(bigmac);
         //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManySauces = bigmac.getSauces().size();
        String whatBun = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals(2,howManySauces);
        Assert.assertEquals("sezam", whatBun);
        Assert.assertEquals(5, howManyBurgers);

    }

}