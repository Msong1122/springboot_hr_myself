package com.msong.hrserver_myself;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HrserverMyselfApplicationTests {


    @Test
    public void contextLoads() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println("一般格式: "+date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf.format(date);
        System.out.println(str);
        Date date1 = new Date("2018/11/22");
        System.out.println(sdf.format(date1));
        Date parse = null;
        try {
            parse = sdf.parse("2018-11-22");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse);
    }
    @Test
    public void testFile(){
//        File mybatis = new File("mybatis");
//        boolean exists = mybatis.exists();
//        System.out.println(exists);
        String path = HrserverMyselfApplicationTests.class.getClass().getResource("/").getPath();
        System.out.println(path);
    }
    @Test
    public void testsss(){
        int num =0 ;
        for (int i=0;i<100;i++){
                num=++num;
        }
        System.out.println(num);
    }
    @Test
    public void timeTest(){

    }
    @Test
    public void test2(){
        System.out.println("nihao");
    }

}
