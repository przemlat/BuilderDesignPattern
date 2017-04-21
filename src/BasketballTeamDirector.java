/**
 * Created by plato on 2017-04-20.
 */
public class BasketballTeamDirector {

    private BasketballTeamBuilder basketballTeamBuilder;

    public BasketballTeamDirector(BasketballTeamBuilder basketballTeamBuilder){
        this.basketballTeamBuilder = basketballTeamBuilder;
    }

    public BasketballTeam getBasketballTeam(){

        return this.basketballTeamBuilder.getBasketballTeam();
    }

    public void createBasketballTeam(){

        this.basketballTeamBuilder.buildTeamPointGuard();
        this.basketballTeamBuilder.buildTeamShootingGuard();
        this.basketballTeamBuilder.buildTeamSmallForward();
        this.basketballTeamBuilder.buildTeamPowerForward();
        this.basketballTeamBuilder.buildTeamCenter();
    }

}
