package com.gla.Generics.Genericsproblemset;
import java.util.*;
public class CourseManagment {
    abstract class CourseType {}
    class ExamCourse extends CourseType {}
    class AssignmentCourse extends CourseType {}
    class ResearchCourse extends CourseType {}

    class Course<T extends CourseType> {
        T type;

        Course(T type) {
            this.type = type;
        }
    }

    public static void showCourses(List<? extends CourseType> list) {
        for (CourseType c : list) {
            System.out.println(c.getClass().getSimpleName());
        }
    }
}
