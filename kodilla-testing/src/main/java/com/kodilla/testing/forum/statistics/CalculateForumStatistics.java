package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateForumStatistics {

    private int numberOfPosts;
    private int numberOfComments;
    private int numberOfUsers;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;
    private Statistics statistics;

    public CalculateForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberOfUsers (int numberOfUsers) {
        return numberOfUsers;
    }

    public int getNumberOfComments (int numberOfComments) {
        return numberOfComments;
    }

    public int getNumberOfPosts (int numberOfPosts) {
        return numberOfPosts;
    }



    public void calculateAdvStatistics (Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (statistics.usersNames().size() !=0 && statistics.postsCount() != 0) {

            avgPostPerUser = (statistics.postsCount())/(statistics.usersNames().size());

        } else {
            avgPostPerUser = 0;
        }

        if(statistics.usersNames().size() !=0 && statistics.commentsCount() != 0) {

            avgCommentPerUser = (statistics.commentsCount())/(statistics.usersNames().size());

        } else {
            avgCommentPerUser = 0;
        }

        if (statistics.commentsCount() !=0 && statistics.postsCount() != 0) {

            avgCommentPerPost = (statistics.commentsCount())/(statistics.postsCount());

        } else {
            avgCommentPerPost = 0;
        }
    }
}

