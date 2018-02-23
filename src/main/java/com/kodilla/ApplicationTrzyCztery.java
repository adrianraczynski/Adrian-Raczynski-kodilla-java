package com.kodilla;


public class ApplicationTrzyCztery {

    public static void main (String[] args) {

        Queue queue = new Queue();

        System.out.println("Queue of objects with 'a': " + queue.queueMaker());
        System.out.println("Number of objects in queue: " + queue.queueMaker().size()+"\n");

        SeparationQueue separationQueue = new SeparationQueue();

        separationQueue.separationQueueProcessor(queue.queueMaker());
    }
}