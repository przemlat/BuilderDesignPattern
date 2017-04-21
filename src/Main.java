/**
 * Created by plato on 2017-04-20.
 */

// zmiana patryka
public class Main {

    public static void main(String[] args){

        //First Implementation
        BasketballTeamBuilder firstTeam = new FirstTeamBuilder();
        BasketballTeamDirector basketballTeamDirector1 = new BasketballTeamDirector(firstTeam);
        basketballTeamDirector1.createBasketballTeam();
        BasketballTeam pogonSiedlce = basketballTeamDirector1.getBasketballTeam();

        System.out.println("Players in Pogon Siedlce:");

        System.out.println("Point guard: " + pogonSiedlce.getTeamPointGuard());
        System.out.println("Shooting guard: " + pogonSiedlce.getTeamShootingGuard());
        System.out.println("Small forward: " + pogonSiedlce.getTeamSmallForward());
        System.out.println("Power forward: " + pogonSiedlce.getTeamPowerForward());
        System.out.println("Center: " + pogonSiedlce.getTeamCenter());

        //Second Implementation
        BasketballTeamBuilder secondTeam = new SecondTeamBuilder();
        BasketballTeamDirector basketballTeamDirector2 = new BasketballTeamDirector(secondTeam);
        basketballTeamDirector2.createBasketballTeam();
        BasketballTeam strzalaIganie = basketballTeamDirector2.getBasketballTeam();

        System.out.println("\nPlayers in Strzala Iganie:");

        System.out.println("Point guard: " + strzalaIganie.getTeamPointGuard());
        System.out.println("Shooting guard: " + strzalaIganie.getTeamShootingGuard());
        System.out.println("Small forward: " + strzalaIganie.getTeamSmallForward());
        System.out.println("Power forward: " + strzalaIganie.getTeamPowerForward());
        System.out.println("Center: " + strzalaIganie.getTeamCenter());


    }
}
