// 4. Deserialization
// Teknik membaca objek dari status tersimpan dalam sebuah class.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    String name;
    Student(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student: " + name;
    }
}

public class Main_Deserialization {
    public static void main(String[] args)
    {
        // Serialization
        try (ObjectOutputStream out
            = new ObjectOutputStream(
                new FileOutputStream("student.ser"))) {
            out.writeObject(new Student("Alice"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.ser"))) {
            Student s = (Student) in.readObject();
            System.out.println(s);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
run:
Student: Alice
*/
