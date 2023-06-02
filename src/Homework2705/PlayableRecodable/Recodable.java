package Homework2705.PlayableRecodable;
/*Створіть 2 інтерфейси Playable та Recodable. У кожному з інтерфейсів створіть по 3 методи
 void play() / void pause() / void stop() та void record() / void pause() / void stop() відповідно.
 Створіть похідний клас Player від базових інтерфейсів Playable та Recodable. Написати програму, яка виконує програвання та запис.*/
public interface Recodable {
    void record();
    void pause();
    void stop();
}
