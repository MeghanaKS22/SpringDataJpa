package com.SpringdataJpa.SpringdataJpa.repository;

import com.SpringdataJpa.SpringdataJpa.Entity.Marks;
import com.SpringdataJpa.SpringdataJpa.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
public class studentRepo {


    @Autowired
    private StudentRepository StudentRepository;

    @Test
    @Rollback(value=false)
    void saveStudent(){
        Student student= Student.builder()
                .studentName("Meghana")
                .studentCity("Thirthahalli")
                .build();
        StudentRepository.save(student);
    }

    @Test
    @Rollback(value = false)
    void saveStudentWithMarks(){
        Marks marks= Marks.builder()
                .markOne("85")
                .studentSecondSemMarks("65")
                .studentThirdSemMarks("75")
                .build();


        Student student= Student.builder()
                .studentName("Darshuu")
                .studentCity("Bangalore")
                .marks(marks)
                .build();
              StudentRepository.save(student);



    }

    @Test
    public void printAllStudent(){
        List<Student> students=StudentRepository.findAll();
        System.out.println("students present in the Db are"+students);
    }

    @Test
    public void printAllStudentByName(){
        List<Student> student=StudentRepository.findByStudentName("Deepika");
        System.out.println(student);

    }

    @Test
    public void printAllStudentByNameContaining(){
        List<Student> student=StudentRepository.findByStudentNameContaining("D");
        System.out.println(student);

    }


}
