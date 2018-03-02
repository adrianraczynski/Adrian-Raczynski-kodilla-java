package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {

    public String share() {
        return "We publishing by twitter, this best option for us.";
    }
}
