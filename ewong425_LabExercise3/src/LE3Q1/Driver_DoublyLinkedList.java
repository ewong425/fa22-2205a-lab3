package LE3Q1;

public class Driver_DoublyLinkedList {
    public static void main(String[] args) {
        header(3,1);
        DoublyLinkedList<MyStudent> EthanList = new DoublyLinkedList<>();
        MyStudent s0 = new MyStudent();
        MyStudent s1 = new MyStudent("Harry", 67.35);
        MyStudent s2 = new MyStudent("Luna", 87.5);
        MyStudent s3 = new MyStudent("Vincent", 60.5);
        MyStudent s4 = new MyStudent("Hermione", 89.2);
        System.out.println("Adding 4 students to the list.");
        EthanList.addLast(s0);
        EthanList.addLast(s1);
        EthanList.addLast(s2);
        EthanList.addLast(s3);
        System.out.println("The list content: ");
        System.out.println(EthanList.toString());
        DoublyLinkedList.Node<MyStudent> s2Node;
        s2Node = EthanList.findNode(s2);
        DoublyLinkedList.Node<MyStudent> s3Node;
        s3Node = EthanList.findNode(s3);
        EthanList.addBetween(s4,s2Node,s3Node);
        System.out.println("Adding Hermione to the list in between Luna and Vincent...");
        System.out.println("The list content: ");
        System.out.println(EthanList.toString());
        footer(3,1);
    }
    public static void header(int labE_number, int q_number) {
        System.out.println("=============================================");
        System.out.println("Lab Exercise: " + labE_number + "-Q" + q_number);
        System.out.println("Prepared by: Ethan Wong");
        System.out.println("Student Number: 251205049");
        System.out.println("Goal: To work with doubly linked lists and add our own methods to them");
        System.out.println("=============================================\n");
    }
    public static void footer(int labE_number, int q_number) {
        System.out.println("\n=============================================");
        System.out.println("Completion of Lab Exercise " + labE_number + "-Q" + q_number + " is successful!");
        System.out.println("Signing off -Ethan ");
        System.out.println("=============================================");
    }
}
