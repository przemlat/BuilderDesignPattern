/**
 * Created by plato on 2017-04-20.
 */
public class SecondTeamBuilder implements BasketballTeamBuilder {

    private BasketballTeam basketballTeam;

    public SecondTeamBuilder(){
        this.basketballTeam = new BasketballTeam();
    }

    @Override
    public void buildTeamPointGuard() {
        basketballTeam.setTeamPointGuard("Aleksander Stary");
    }

    @Override
    public void buildTeamShootingGuard() {
        basketballTeam.setTeamShootingGuard("Miłosz Miły");
    }

    @Override
    public void buildTeamSmallForward() {
        basketballTeam.setTeamSmallForward("Rafał Głowa");
    }

    @Override
    public void buildTeamPowerForward() {
        basketballTeam.setTeamPowerForward("Michał Kowalski");
    }

    @Override
    public void buildTeamCenter() {
        basketballTeam.setTeamCenter("Paweł Miły");
    }

    public BasketballTeam getBasketballTeam(){
        return this.basketballTeam;
    }
}
