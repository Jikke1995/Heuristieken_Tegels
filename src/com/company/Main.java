package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // while je nog kan lezen:
            try {
            BufferedReader Lesrooster =
                    new BufferedReader (new FileReader("resources/StudentsFile.csv"));
            while(true) {
                String name = Lesrooster.readLine();
                if (name == null) break;
                students.add(new Student(name.split(",")[0] + ", " + name.split(",")[1], name.split(",")[2]));
            }
            Lesrooster.close();
        } catch (IOException ex) {
                System.out.println("Can't find file");
                System.exit(1);
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

