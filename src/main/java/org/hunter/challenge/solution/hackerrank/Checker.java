package org.hunter.challenge.solution.hackerrank;

import org.hunter.challenge.solution.helper.Player;

import java.util.Comparator;

/**
 * Created by Hunter on 16/03/2018.
 */
public class Checker implements Comparator{
    public int compare(Object o1, Object o2) {
        Player p1=(Player) o1;
        Player p2=(Player) o2;

        if(p1.score>p2.score){
            return -1;
        }else if(p1.score<p2.score){
            return 1;
        }else {
            return p1.name.compareTo(p2.name);
        }
    }

    public Comparator reversed() {
        return null;
    }

    public Comparator thenComparing(Comparator other) {
        return null;
    }

}
