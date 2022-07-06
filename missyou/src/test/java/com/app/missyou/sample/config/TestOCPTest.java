package com.app.missyou.sample.config;


import com.app.missyou.MissyouApplication;
import com.app.missyou.sample.service.IConnect;
import com.app.missyou.sample.service.ISkill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MissyouApplication.class)
@RunWith(SpringRunner.class)
public class TestOCPTest {

    // byName注入
//    @Autowired
//    private ISkill diana;

//    @Autowired
//    @Qualifier(value = "camille")
//    private ISkill iSkill;

    @Autowired
    private ISkill lrelia;

    private IConnect mysql;

    @Autowired
    public void setMysql(IConnect mysql) {
        this.mysql = mysql;
    }


    // set方法注入
    /*@Autowired
    public void setDiana(ISkill diana) {
        this.diana = diana;
    }*/
    // 构造方法注入 单元测试不能使用
    /*@Autowired
    public TestOCPTest(ISkill diana) {
        this.diana = diana;
    }*/

    @Test
    public void test() {
//        diana.e();
//        iSkill.e();
        lrelia.e();
        mysql.connect();
    }
}