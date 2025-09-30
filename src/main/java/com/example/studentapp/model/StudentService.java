/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.studentapp.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class StudentService {
    private static final String PERSISTENCE_UNIT_NAME = "student-unit";
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static void addStudent(Student student) {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    public static Student findStudentById(int id) {
        EntityManager em = factory.createEntityManager();
        Student student = em.find(Student.class, id);
        em.close();
        return student;
    }

    public static List<Student> findAllStudents() {
        EntityManager em = factory.createEntityManager();
        List<Student> students = em.createNamedQuery("Student.findAll", Student.class).getResultList();
        em.close();
        return students;
    }
}
