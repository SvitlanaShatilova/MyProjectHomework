package Homework2705.PlayableRecodable;

public class Player implements Playable, Recodable{

    @Override
    public void play() {
        System.out.println("Програвач в режимі \"PLAY\"");
    }

    @Override
    public void record() {
        System.out.println("Програвач в режимі \"RECORD\"");
    }

    @Override
    public void pause() {
        System.out.println("Програвач в режимі \"PAUSE\"");
    }

    @Override
    public void stop() {
        System.out.println("Програвач в режимі \"STOP\"");
    }
}
