//package Homework0807.Ex10;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Modifier;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//
//        try {
//
//            Knowledge knowledge = new Knowledge();
//
//            System.out.println(knowledge.askQuestion("question?"));
//
//            setFinalStaticField(Knowledge.class, "ANSWER", 411);
//
//
//            System.out.println(knowledge.askQuestion("question?"));
//
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
//    }
//
//    private static void setFinalStaticField(Class<?> clazz, String fieldName, Object value)
//
//            throws ReflectiveOperationException {
//
//
//        Field field = clazz.getDeclaredField(fieldName);
//
//        field.setAccessible(true);
//
//
//        Field modifiers = Field.class.getDeclaredField("modifiers");
//
//        modifiers.setAccessible(true);
//
//        modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);
//
//
//        field.set(null, value);
//
//    }
//
//
//
//    public class Knowledge {
//
//        private static final Integer ANSWER = 42;
//
//
//        public String askQuestion(String question) {
//
//            return "The answer to '" + question + "' is: " + ANSWER;
//
//        }
//
//    }
//}
//
