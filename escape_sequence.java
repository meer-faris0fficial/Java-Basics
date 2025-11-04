public class escape_sequence {
    public static void main(String[] args) {
        System.err.println("hello \"Tahir\".....");  // it will print "" in the output
        System.err.println("hello \\Tahir\\.....");  // it wil print \tahir\ in the output
        System.err.println("hello \nTahir.....");  // it will print tahir in the new line
        System.err.println("hello \tTahir.....");  // it will give the tab space to  tahir
        System.err.println("hello \bTahir.....");  // it will backspace one character
    }
}
