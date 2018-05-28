package com.project;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import com.project.util.FormatDate;

@Component
public class Jobs {
public final static long ONE_Minute =  60 * 1000;
    
    @Scheduled(fixedDelay=ONE_Minute)
    public void fixedDelayJob(){
        System.out.println(FormatDate.format4(new Date())+" >>fixedDelay执行....");
    }
    
    @Scheduled(fixedRate=ONE_Minute)
    public void fixedRateJob(){
        System.out.println(FormatDate.format4(new Date())+" >>fixedRate执行....");
    }

    @Scheduled(cron="0 15 3 * * ?")
    public void cronJob(){
        System.out.println(FormatDate.format4(new Date())+" >>cron执行....");
    }

}
