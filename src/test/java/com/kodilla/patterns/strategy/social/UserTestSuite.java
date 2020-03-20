package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User zdzichu = new Millenials("dzidek");
        User andrzej = new YGeneration("endriu");
        User janusz = new ZGeneration("passerati");

        //When
        String zdzichuSocial = zdzichu.sharePost();
        String andrzejSocil = andrzej.sharePost();
        String januszSocial = janusz.sharePost();

        //Then
        Assert.assertEquals("Facebook", zdzichuSocial);
        Assert.assertEquals("Twitter", andrzejSocil);
        Assert.assertEquals("Snapchat", januszSocial);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User janusz = new ZGeneration("passerati");

        //When
        String januszSocial = janusz.sharePost();
        janusz.setSocialPublisher(new FacebookPublisher());
        januszSocial = janusz.sharePost();

        //Then
        Assert.assertEquals("Facebook", januszSocial);

    }

}