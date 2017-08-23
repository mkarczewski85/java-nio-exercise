import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-08-23.
 */
public class Player implements Comparable {

    private String name;
    private int score;
    private static List<Player> rankingPlayers = new ArrayList<>();


    public Player() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Player> getRankingPlayers(){
        return rankingPlayers;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
