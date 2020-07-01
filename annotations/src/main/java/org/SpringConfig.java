package org;

import org.demo.HappyFortuneService;
import org.demo.MyLogger;
import org.demo.PushupCoach;
import org.demo.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource({"classpath:log.properties", "classpath:xyz.properties"})

public class SpringConfig {

    @Bean
    public MyLogger myLogger(){
        return new MyLogger();
    }

    @Bean
    public HappyFortuneService happyFortuneService(){
        HappyFortuneService h = new HappyFortuneService();
        h.init();
        return h;
    }

    @Bean
    public PushupCoach pushupCoach(){
        return new PushupCoach(happyFortuneService());
    }

    @Bean
    public SwimCoach swimCoach(){
        SwimCoach s = new SwimCoach();
        s.setFortuneService(happyFortuneService());
        return s;
    }

}
