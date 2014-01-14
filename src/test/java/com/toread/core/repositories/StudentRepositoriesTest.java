package com.toread.core.repositories;

import com.toread.core.config.ApplicationConfig;
import com.toread.core.domain.Student;
import com.toread.core.service.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 14-1-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = ApplicationConfig.class)
@TestExecutionListeners(listeners={
        DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class
})
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=true)
public class StudentRepositoriesTest extends AbstractTransactionalJUnit4SpringContextTests{
    @Autowired
    StudentRepositories studentRepositories;

    @Test
    public void findOne(){
        Student student = new Student();
        student.setAddress("传奇人生");
        student.setAge(12);
        student.setName("lizhibing");
        studentRepositories.save(student);
        Student result = studentRepositories.findOne((long) 1);
        Assert.assertNotNull(result);
    }
}
