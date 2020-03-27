package problem3.myLinkedList;
import problem3.node.Node;
import problem3.student.Student;
public class MyLinkedList {
    private Node first;
    private Node last;
    public void addLast(Student student){
        Node node=new Node(student);
        if(first==null){
            first=node;
            last=node;
            return;
        }
    last.setNext(node);
        last=node;

        var current=first;
        while(current!=null){
            if (node.getData().getRollNo()<current.getData().getRollNo()){
                var temp=node.getData();
                node.setData(current.getData());
                current.setData(temp);
            }
            current=current.getNext();
        }
    }

}