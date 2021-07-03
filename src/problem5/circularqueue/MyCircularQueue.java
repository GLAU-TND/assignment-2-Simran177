/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
//to implement circular queue
import problem5.student.Student;
public class MyCircularQueue {
    private int size;
    private int first;
    private int last;
    private int maxSize;
    private Student[] circularQueue;

    public MyCircularQueue(int maxSize){
        this.maxSize=maxSize;
        circularQueue =new Student[maxSize];
        this.first=0;
        this.last=0;
        this.size=0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Student[] getCircularQueue() {
        return circularQueue;
    }

    public void setCircularQueue(Student[] circularQueue) {
        this.circularQueue = circularQueue;
    }
    private boolean isEmpty(){
        return size==0;
    }

    private boolean isFull(){
        return size==maxSize;
    }
    public void enqueue(Student element){
        if(!isFull()){
            circularQueue[last]=element;
            last=(last+1)%maxSize;
            size++;
        }
        else{
            System.out.println("Queue is full.");
        }
    }

    public Student dequeue(){
        Student response=null;
        if(!isEmpty()){
            size--;
            response= circularQueue[first];
            first=(first+1)%maxSize;
            return response;

        }
        else{
            return response;
        }
    }

    public void show(){
        for (int i=0;i<size;i++){
            System.out.println(circularQueue[(i+first)%maxSize]);
        }
    }

    public void traverse(){

    }

}
