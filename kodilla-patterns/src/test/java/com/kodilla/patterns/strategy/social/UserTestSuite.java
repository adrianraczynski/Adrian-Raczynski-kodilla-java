package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;


public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam Bambosz");
        User evan = new YGeneration("Evan Drobniewski");
        User marek = new ZGeneration("Marek Krajewski");

        //When
        String adamPublishingIn = adam.sharePost();
        String evanPublishingIn = evan.sharePost();
        String marekPublishingIn = marek.sharePost();

        System.out.println("Millenials: " + adamPublishingIn);
        System.out.println("YGeneration: " + evanPublishingIn);
        System.out.println("ZGeneration: " + marekPublishingIn);

        //Then
        Assert.assertEquals("We publishing by twitter, this best option for us.", adamPublishingIn);
        Assert.assertEquals("We are going for new trends and we choose Snapchat.", evanPublishingIn);
        Assert.assertEquals("Now we prefer publishing by facebook.", marekPublishingIn);

    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User adam = new Millenials("Adam Bambosz");

        //When
        String adamPublishingIn = adam.sharePost();
        System.out.println("\n" + "Millenials: " + adamPublishingIn);

        adam.changeSocialPublisher(new FacebookPublisher());
        String adamSecondPublishingIn = adam.sharePost();
        System.out.println("Millenials Adam change social publisher: " + adamSecondPublishingIn);


        //Then
        Assert.assertEquals("Now we prefer publishing by facebook.",adamSecondPublishingIn );


    }
}