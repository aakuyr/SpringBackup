package org.demo;


public class SadFortuneService implements FortuneService {

    @Override
    public String  tellFortune() {
        return "Not the best fortune today but okay";
    }
}
