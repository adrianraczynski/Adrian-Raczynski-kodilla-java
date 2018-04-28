package com.kodilla.pattern2.observer.forum;

public class ForumUser implements ObserverAAA{

    private final String username;
    private int updateCount;

    public ForumUser(String username) {
        this.username = username;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(username + " New messege in topic: " + forumTopic.getName() + " \n" +
                "(total: " + forumTopic.getMesseges().size() + " messeges");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }


}