package demo1;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;
    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        System.out.println("FLAG IS "+ flag);
        this.flag = flag;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("EXPERIMENTING WITH INIT METHOD" + email);
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("EXPERIMENTING WITH DESTROY METHOD" + team);
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice batting everyday";
    }

    @Override
    public String tellFortune() {
        return fortuneService.predict();
    }
}
