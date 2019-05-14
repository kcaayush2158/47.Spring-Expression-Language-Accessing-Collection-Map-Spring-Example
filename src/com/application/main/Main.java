package com.application.main;

import com.application.model.TelephoneDirectoryAccessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TelephoneDirectoryAccessor telephoneDirectoryAccessor = context.getBean("telephoneDirectoryAccessor", TelephoneDirectoryAccessor.class);
        System.out.println(" Phone Number :"+telephoneDirectoryAccessor.getPhonenumber());

        context.close();
    }
}
