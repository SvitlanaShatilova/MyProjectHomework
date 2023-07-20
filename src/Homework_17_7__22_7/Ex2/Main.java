package Homework_17_7__22_7.Ex2;
/**Створіть клас, використовуючи SAXParser, де опишіть ієрархію XML файлу.
 * Необхідно, щоб проект створював
 * XML-файл і будував дерево (місто, назва вулиці, будинок).
 * У місті використовуйте аттрибут
 * (наприклад, <city size=”big>Kiev</city>).*/
public class Main {
    public static void main(String[] args) {
        DomBildXml.domBildAdress();
        SaxPars.saxParsAdress();
    }
}
