package Homework2705.PlayableRecodable;

import java.util.Scanner;

/*Створіть 2 інтерфейси Playable та Recodable. У кожному з інтерфейсів створіть по 3 методи
 void play() / void pause() / void stop() та void record() / void pause() / void stop() відповідно.
 Створіть похідний клас Player від базових інтерфейсів Playable та Recodable. Написати програму, яка виконує програвання та запис.*/
public class Main {

      public static void operationPlayer(int operation){
          Player player = new Player();
        switch (operation){
            case (1):
                player.play();
                System.out.println("Виберіть наступну дію: \n 1 -> play; \n 2 -> record \n 3 -> pause \n 4 -> stop");
                Scanner sc1 = new Scanner(System.in);
                int oper1 = sc1.nextInt();
                operationPlayer(oper1);
                break;
            case (2):
                player.record();
                System.out.println("Виберіть наступну дію: \n 1 -> play; \n 2 -> record \n 3 -> pause \n 4 -> stop");
                Scanner sc2 = new Scanner(System.in);
                int oper2 = sc2.nextInt();
                operationPlayer(oper2);
                break;
            case (3):
                player.pause();
                System.out.println("Виберіть наступну дію: \n 1 -> play; \n 2 -> record \n 3 -> pause \n 4 -> stop");
                Scanner sc3 = new Scanner(System.in);
                int oper3 = sc3.nextInt();
                operationPlayer(oper3);
                break;
            case (4):
                player.stop();
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть дію: \n 1 -> play; \n 2 -> record \n 3 -> pause \n 4 -> stop");
        int operation = sc.nextInt();
        operationPlayer(operation);



    }
}
