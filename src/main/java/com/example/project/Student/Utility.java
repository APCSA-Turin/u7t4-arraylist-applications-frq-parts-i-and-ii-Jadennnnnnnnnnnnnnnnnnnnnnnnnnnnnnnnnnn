package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (compare(list.get(j), list.get(j + 1)) > 0) {
                    swap(list, j);
                }
            }
        }
        return list;
    }

    private static int compare(Student x, Student y) {
        int last = x.getLastName().compareTo(y.getLastName());
        if (last != 0) {
            return last;
        }

        int first = x.getFirstName().compareTo(y.getFirstName());
        if (first != 0) {
            return first;
        }

        return x.getGpa() > y.getGpa() ? -1 : 1;
    }

    private static void swap(ArrayList<Student> list, int i) {
        Student temp = list.get(i);
        list.set(i, list.get(i + 1));
        list.set(i + 1, temp);
    }

    public static void main(String[] args) {
    }
}
