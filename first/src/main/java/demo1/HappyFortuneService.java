package demo1;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private String[] fortunes = new String[]{"Good", "Amazing", "Superb"};

    @Override
    public String predict(){
        int randomIndex = new Random().nextInt(2);
        return fortunes[randomIndex];
    }
}
