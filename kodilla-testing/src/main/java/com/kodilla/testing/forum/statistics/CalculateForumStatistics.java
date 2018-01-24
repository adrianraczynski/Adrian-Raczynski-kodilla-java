package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateForumStatistics {

    private int numberOfPosts;
    private int numberOfComments;
    private int numberOfUsers;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;


    public int getNumberOfUsers () {
        return numberOfUsers;
    }

    public int getNumberOfComments () {
        return numberOfComments;
    }

    public int getNumberOfPosts () {
        return numberOfPosts;
    }

    public double getNumberOfAvgPostPerUser (int numberOfPosts, int numberOfUsers) {
        return avgPostPerUser;
    }

    public double getNumberOfAvgCommentPerUser (int numberOfComments, int numberOfUsers) {
        return avgCommentPerUser;
    }

    public double getNumberOfAvgCommentPerPost (int numberOfComments, int numberOfPosts) {
        double getAvgCommentPerPost = avgCommentPerPost;
        return getAvgCommentPerPost;
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

