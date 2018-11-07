package com.hn.hn_core_web;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FsShell;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HnCoreWebApplicationTests {

    @Test
    public void contextLoads() {

        System.out.println("----------------------Test Are You Ok?-----------------------");
    }

    @Test
    public void testHadoop (){

        System.out.println("------------------Test Ok！---------------------");
        try {
            //读取本地文件系统,并创建输入流
            FileSystem fs = FileSystem.get(new URI("hdfs://114.115.173.182:9000"),new Configuration(),"root");
            System.out.println("------------------连接成功！---------------------");
            InputStream in = new FileInputStream("G://KuGou/陈雷 - 欢喜就好.ape");
            System.out.println("-------------------文件获取成功！------------------------");
            //在HDFS上创建一个文件返回输出流
            OutputStream out = fs.create(new Path("/user/master/input/陈雷 - 欢喜就好.ape"));
            System.out.println("---------------------返回成功----------------------");
            //将输入流写到输出流,buffersize是4k,即每读4k数据返回一次,写完返回true
            IOUtils.copyBytes(in,out,4096,true);
            System.out.println("---------------------上传Hadoop文件成功!----------------");
            java.sql.Date date = new java.sql.Date(new Date().getTime());
            System.out.println(date.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
