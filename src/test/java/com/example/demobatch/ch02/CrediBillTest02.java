package com.example.demobatch.ch02;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huyunhui
 * @ClassName CrediBillTest02
 * @date 2020/12/8 14:22
 * @desc TODO
 * @see
 */
public class CrediBillTest02 {
    public  static   void main(String[] args)
    {
        ApplicationContext   context = new ClassPathXmlApplicationContext("ch02/job.xml");
        JobLauncher  launcher = (JobLauncher) context.getBean("jobLauncher");
        Job  job = (Job) context.getBean("billJob");
        try{
            JobExecution  result = launcher.run(job,new JobParameters());
            System.out.println("执行的结果："+result);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
