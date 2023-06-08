package Homework0306.Friends;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Friends friends = new Friends();

        Collections.sort(friends.myFriends);
        System.out.println(friends.myFriends);

    }
}