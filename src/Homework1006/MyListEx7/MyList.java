package Homework1006.MyListEx7;
public class MyList {
    private String title;
    private int value;

    public MyList() {
    }

    public MyList(String title, int value) {
        this.title = title;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "title='" + title + '\'' +
                ", value=" + value +
                '}';
    }
}
