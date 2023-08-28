package Homework1006.MyDictionary;


    public class MyDictionary {
        public String word;
        public String translation;

        public MyDictionary(String word, String translation) {
            this.word = word;
            this.translation = translation;
        }

        public MyDictionary() {
        }

        @Override
        public String toString() {
            return "Українською: " + word + "| переклад на Англійську: " + translation;
        }
    }
