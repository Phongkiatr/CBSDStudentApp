/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.example.studentapp.controller;

import com.example.studentapp.model.Student;
import com.example.studentapp.model.StudentService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "StudentServlet", urlPatterns = {"/addstudent"})
public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double gpa = Double.parseDouble(request.getParameter("gpa"));

        if (StudentService.findStudentById(id) != null) {
            request.setAttribute("error", "There is an existing student with this ID");
            
            List<Student> studentList = StudentService.findAllStudents();
            request.setAttribute("studentList", studentList);
            
            request.getRequestDispatcher("showError.jsp").forward(request, response);
            
        } else {
            // กรณีเพิ่มข้อมูลสำเร็จ
            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setGpa(gpa);
            StudentService.addStudent(student);

            request.setAttribute("student", student);
            
            List<Student> studentList = StudentService.findAllStudents();
            request.setAttribute("studentList", studentList);
            
            request.getRequestDispatcher("showResult.jsp").forward(request, response);
        }
    }
}