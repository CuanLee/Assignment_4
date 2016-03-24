package ac.za.cput.assignment_4_3.LSP.Obey;

/**
 * Created by Cuan on 3/24/2016.
 */
public class Fielder extends CricketFielderAction {
    @Override
    public Boolean catchBall() {
        return false;
    }

    @Override
    public Boolean throwBall() {
        return true;
    }
}
