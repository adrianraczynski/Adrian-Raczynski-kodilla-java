package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMainForumUser {
    public static void main(String[] args){
        Forum forum = new Forum ();
            Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                    .filter (ForumUser->ForumUser.getUserSex() == 'M')
                    .filter (ForumUser->ForumUser.getUserBirthday().isBefore(LocalDate.of(1998,1,25)))
                    .filter (ForumUser->ForumUser.getPostNumber() >= 1)
                    .collect (Collectors.toMap(ForumUser::getUserID, Forum -> Forum));



        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + "- " + entry.getValue())
                .forEach(System.out::println);
        }
}
