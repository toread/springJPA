package com.toread.core.service;

import com.toread.core.config.ApplicationConfig;
import com.toread.core.domain.Student;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.QueryDslJpaRepository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by Administrator on 14-1-14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = ApplicationConfig.class)
@TestExecutionListeners(listeners={
        DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class
})
public class StudentServiceTest extends TestCase {
    @Autowired
    StudentService studentService;
    @Test
    public void testFindStudents() throws Exception {
        List<Student> students = studentService.findStudents("lizhibing");
        assertTrue(students.size()>1);
    }
}
