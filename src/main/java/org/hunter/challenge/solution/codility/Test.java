package org.hunter.challenge.solution.codility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Hunter on 31/03/2018.
 */
public class Test {
    public static void main(String[] args) {

        String text    =
                "John writes about this, and John writes about that," +
                        " and John writes about everything. "
                ;

        String patternString1 = "(writes)";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

//        System.out.println("found: " + matcher);

        while(matcher.find()) {
            System.out.println("found: " + matcher.groupCount());
        }
    }
}
