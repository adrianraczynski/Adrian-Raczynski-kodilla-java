package com.kodilla.pattern2.observer.homework;

public class Mentor implements ObserverHomework {

    private String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update (HomeworkQueue homeworkQueue) {
        System.out.println("Mentor: " + mentorName + " must check exercise from students. " +
                           "You have to check " + homeworkQueue.getHomeworks().size() + " exerice." );
        updateCount++;
    }

    public String getStudentName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
