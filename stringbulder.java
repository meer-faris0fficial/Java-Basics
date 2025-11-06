// In Java, toString() is a method that returns a string (text) representation of an object

public class stringbulder {
    public static void main(String[] args) {
        String[] arr = new String[] {"this", "is" ,
                    "the", "best","java", "course" };
        StringBuilder sb = new StringBuilder();
        for (String  str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
