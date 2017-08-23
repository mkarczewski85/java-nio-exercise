import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Player  {

    private String name;
    private int score;



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


    @Override
    public String toString(){
        return name + ": " + score;
    }

}
