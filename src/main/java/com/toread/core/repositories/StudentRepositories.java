package com.toread.core.repositories;

import com.toread.core.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Administrator on 14-1-12.
 */
public interface StudentRepositories extends JpaRepository<Student,Long>,QueryDslPredicateExecutor<Student>{
}
