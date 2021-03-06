/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue=new MyPriorityQueue();
        queue.enqueue(new Student("Simran",50));
        queue.enqueue(new Student("Ankit",10));
        queue.enqueue(new Student("Palak",15));
        queue.enqueue(new Student("Upendra",60));
        queue.traverse();
        queue.dequeue();
        queue.traverse();
    }
}
