package Homework1006.MyListEx7;
/** ������� ���� MyList.
 * ��������� � ������������ ��������� ��������� ������������ ���� ����������
 * ��������� ���������� ����� List. ̳������� ���������� ��������� �����䳿 �
 * ����������� ������� �������� ����� ��������� ��������, ���������� ��� ���������
 * �������� �������� �� �������� �������� � ���������� ����� ��� ������� ��� ��������� �������� ������� ��������.
 */

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList("My List 1", 1);
        MyList myList2 = new MyList("My List 2", 2);
        MyList myList3 = new MyList("My List 3", 3);

        MethodList methodList = new MethodList();

        methodList.add(myList);
        methodList.add(myList2);
        methodList.add(myList3);
        methodList.getIndex(0);
        methodList.getIndex(1);
        methodList.getIndex(2);
        methodList.readLenth();
    }
}