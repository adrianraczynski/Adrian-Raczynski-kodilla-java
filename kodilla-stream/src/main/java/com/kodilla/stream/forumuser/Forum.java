package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;


public class Forum {
    private final List <ForumUser> theListOfUsers = new ArrayList<>();

        public Forum() {
            theListOfUsers.add(new ForumUser(1, "Adam", 'M', 46, 1992, 6, 15));
            theListOfUsers.add(new ForumUser(2, "Paweł", 'M', 1, 1944, 6, 6));
            theListOfUsers.add(new ForumUser(3, "Monika", 'F', 0, 1939, 9, 1));
            theListOfUsers.add(new ForumUser(4, "Mateusz", 'M', 138, 2001, 1, 1));
            theListOfUsers.add(new ForumUser(5, "Alicja", 'F', 0, 1984, 2, 9));
            theListOfUsers.add(new ForumUser(6, "Karolina", 'F', 73, 1967, 10, 28));
            theListOfUsers.add(new ForumUser(7, "Magda", 'F', 9, 1975, 12, 24));
            theListOfUsers.add(new ForumUser(8, "Adrian", 'M', 2, 2005, 5, 1));
            theListOfUsers.add(new ForumUser(9, "Even", 'M', 1295, 1992, 3, 31));
            theListOfUsers.add(new ForumUser(10, "Piotr", 'M', 0, 1996, 8, 15));
            theListOfUsers.add(new ForumUser(11, "Małgorzata", 'F', 8, 1954, 9, 17));
            theListOfUsers.add(new ForumUser(12, "Michał", 'M', 0, 1992, 7, 12));
        }

    public List<ForumUser> getUserList() {
        return theListOfUsers;
    }


}
