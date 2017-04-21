/**
 * Created by plato on 2017-04-20.
 */
public class BasketballTeam implements BasketballTeamPlan{

    private String pointGuard;
    private String shootingGuard;
    private String smallForward;
    private String powerForward;
    private String center;

    @Override
    public void setTeamPointGuard(String pointGuard) {
        this.pointGuard = pointGuard;
    }

    public String getTeamPointGuard() { return pointGuard; }

    @Override
    public void setTeamShootingGuard(String shootingGuard) {
        this.shootingGuard = shootingGuard;
    }

    public String getTeamShootingGuard() { return shootingGuard; }

    @Override
    public void setTeamSmallForward(String smallForward) {
        this.smallForward = smallForward;
    }

    public String getTeamSmallForward() { return smallForward; }

    @Override
    public void setTeamPowerForward(String powerForward) {
        this.powerForward = powerForward;
    }

    public String getTeamPowerForward() { return powerForward; }

    @Override
    public void setTeamCenter(String center) {
        this.center = center;
    }

    public String getTeamCenter() { return center; }
}
