package org.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@Component
public class HappyFortuneService implements FortuneService {

    private String fortune;
    @Override
    public String tellFortune() {
        return fortune;
    }

    @PostConstruct
    public void init(){
        File file = new File("src/main/resources/sai.txt");
        System.out.println(file.getAbsolutePath());
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            this.fortune = br.readLine();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
