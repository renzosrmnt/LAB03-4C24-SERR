package com.tecsup.lab03.controller;

import com.tecsup.lab03.model.Student;

public class StudentController {

    public void createStudent(String name, int age) {
        Student student = new Student(name, age);
        // Lógica para guardar el estudiante en la base de datos o realizar alguna acción
    }

    public void updateStudent(int id, String newName, int newAge) {
        // Lógica para actualizar un estudiante por su ID
    }

    public void deleteStudent(int id) {
        // Lógica para eliminar un estudiante por su ID
    }

    public void listStudents() {
        // Lógica para listar todos los estudiantes
    }
}
