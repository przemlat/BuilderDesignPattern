/**
 * Created by plato on 2017-04-20.
 */
public interface BasketballTeamBuilder {

    public void buildTeamPointGuard();
    public void buildTeamShootingGuard();
    public void buildTeamSmallForward();
    public void buildTeamPowerForward();
    public void buildTeamCenter();

    public BasketballTeam getBasketballTeam();

}
