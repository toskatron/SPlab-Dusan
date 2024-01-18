package com.example.splab;

import com.example.splab.difexample.ClientComponent;
import com.example.splab.difexample.SingletonComponent;
import com.example.splab.difexample.TransientComponent;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SPlabApplication {

    public static void main(String[] args) {
    
            ApplicationContext context =
                    SpringApplication.run(SPlabApplication.class, args);

            TransientComponent transientBean =
                    context.getBean(TransientComponent.class);
            transientBean.operation();

            transientBean = context.getBean(TransientComponent.class);
            transientBean.operation();

            SingletonComponent singletonBean =
                    context.getBean(SingletonComponent.class);
            singletonBean.operation();

            singletonBean = context.getBean(SingletonComponent.class);
            singletonBean.operation();

            ClientComponent c = context.getBean(ClientComponent.class);
            c.operation();

            c = (ClientComponent)context.getBean("clientComponent");
            c.operation();
    }

}