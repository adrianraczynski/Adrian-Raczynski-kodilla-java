package com.kodilla.pattern2.observer.homework;

public class Mentor implements HomeworkQueue {

    private String mentorName;
    private int updateCount;

    public Mentor(String studentName) {
        this.mentorName = studentName;
    }

    @Override
    public void update (HomeworkQueue homeworkQueue) {
        System.out.println("AAAAAAAAAAA");
        updateCount++;
    }

    public String getStudentName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
