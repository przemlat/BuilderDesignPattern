/**
 * Created by plato on 2017-04-20.
 */
public class FirstTeamBuilder implements BasketballTeamBuilder {

    private BasketballTeam basketballTeam;

    public FirstTeamBuilder(){
        this.basketballTeam = new BasketballTeam();
    }

    @Override
    public void buildTeamPointGuard() {
        basketballTeam.setTeamPointGuard("Piotr Nowak");
    }

    @Override
    public void buildTeamShootingGuard() {
        basketballTeam.setTeamShootingGuard("Tomasz Kowalski");
    }

    @Override
    public void buildTeamSmallForward() {
        basketballTeam.setTeamSmallForward("Krzysztof Noga");
    }

    @Override
    public void buildTeamPowerForward() {
        basketballTeam.setTeamPowerForward("Daniel Kot");
    }

    @Override
    public void buildTeamCenter() {
        basketballTeam.setTeamCenter("Kamil Wiosna");
    }

    public BasketballTeam getBasketballTeam(){
        return this.basketballTeam;
    }
}
