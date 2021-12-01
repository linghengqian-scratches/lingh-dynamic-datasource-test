package com.lingh;

import com.lingh.dao.TeacherMapper;
import com.lingh.pojo.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LinghDynamicDatasourceTestApplicationTests {
    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        Teacher teacher = teacherMapper.getTeacher2(1);
        System.out.println(teacher);
    }
}
