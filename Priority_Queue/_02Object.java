//How to compir the objects of the class
//1. use "Comparable Interface" : which use "Compair to funtion" to compair the objects of the class

import java.util.*;
public class _02Object{

    public static class Student implements Comparable<Student>{
        String name;
        int rollNo;
        int rank;

        public Student(String name, int rollNo, int rank){
            this.name = name;
            this.rollNo = rollNo;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A",12,5));
        pq.add(new Student("B",10,2));
        pq.add(new Student("C",8,3));
        pq.add(new Student("D",11,1));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rollNo + "->" + pq.peek().rank);
            pq.remove();
        }

    }
}