package com.toread.core.service;

import com.mysema.query.types.Predicate;
import com.toread.core.domain.QStudent;
import com.toread.core.domain.Student;
import com.toread.core.repositories.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 14-1-13.
 */
@Service("studentService")
public class StudentService {
    @Autowired
    private StudentRepositories studentRepositories;

    public List<Student> findStudents(String name){
        return constructList(studentRepositories.findAll(nameIsLike(name)));
    }

    public static Predicate nameIsLike(final String name) {
       return QStudent.student.name.eq(name);
    }

    private List<Student> constructList(Iterable<Student> persons) {
        List<Student> list = new ArrayList<Student>();
        for (Student student: persons) {
            list.add(student);
        }
        return list;
    }

}
