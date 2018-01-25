package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate userBirthday;
    private final int postNumber;

    public ForumUser(final int userID, final String userName, final char userSex, final LocalDate userBirthday, final int postNumber) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirthday = userBirthday;
        this.postNumber = postNumber;
    }
}
