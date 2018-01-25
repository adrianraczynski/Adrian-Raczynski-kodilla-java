package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate userBirth;
    private final int postNumber;

    public ForumUser(final int userID, final String userName, final char userSex, final int postNumber,
                     int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirth = LocalDate.of (yearOfBirth, monthOfBirth, dayOfBirth);
        this.postNumber = postNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBirthday() {
        return userBirth;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "Forum user (" + "name: " + userName + ", sex: " + userSex + ", date of birth; "
                + userBirth + ", number of post on the forum: " + postNumber + ")";
    }
}
