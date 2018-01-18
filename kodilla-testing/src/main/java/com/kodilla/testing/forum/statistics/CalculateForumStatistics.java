package com.kodilla.testing.forum.statistics;
import java.util.ArrayList;
import java.util.List;

public class CalculateForumStatistics implements Statistics {

    private Statistics statistics;
    private int numberOfPosts;
    private int numberOfComments;
    private ArrayList <String> list;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;

    public CalculateForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public List<String> usersNames() { // list of users names
        return list;
    }

    public int postsCount() {         // total quantity of forum posts
        return numberOfPosts;
    }

    public int commentsCount() {      // total quantity of forum comments
        return numberOfComments;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        double avgPostPerUser = numberOfPosts/list.size();
        double avgCommentPerUser = numberOfComments/list.size();
        double avgCommentPerPost = numberOfComments/numberOfPosts;
    }

    public void ShowStatistics() {

        System.out.println("Statistics: " + avgPostPerUser + avgCommentPerUser + avgCommentPerPost );
    }
}

