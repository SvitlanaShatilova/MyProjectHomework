package Homework_17_7__22_7.Ex2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

/**Створіть клас, використовуючи SAXParser, де опишіть ієрархію XML файлу.
 * Необхідно, щоб проект створював
 * XML-файл і будував дерево (місто, назва вулиці, будинок).
 * У місті використовуйте аттрибут
 * (наприклад, <city size=”big>Kiev</city>).*/
public class DomBildXml {
    public static void domBildAdress() {
        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();
            Element root = document.createElement("Adress");
            document.appendChild(root);
            Element city1 = document.createElement("City");
            city1.setAttribute("size", "big");
            city1.setTextContent("Kiev");
            root.appendChild(city1);
            Element street1 = document.createElement("Street");
            street1.setTextContent("Khreshchatyk");
            city1.appendChild(street1);
            Element house1 = document.createElement("House");
            house1.setTextContent("22");
            street1.appendChild(house1);
            Element city2 = document.createElement("City");
            city2.setAttribute("size", "big");
            city2.setTextContent("Cherkasy");
            root.appendChild(city2);
            Element street2 = document.createElement("Street");
            street2.setTextContent("B.Vyshnevetsky");
            city2.appendChild(street2);
            Element house2 = document.createElement("House");
            house2.setTextContent("34");
            street2.appendChild(house2);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult sr = new StreamResult(new File("C:\\Users\\User\\IdeaProjects\\MyProjectHomework\\src\\Homework_17_7__22_7\\Ex2\\city.xml"));
            transformer.transform(source, sr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

