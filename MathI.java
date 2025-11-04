public class MathI {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.random()); // generate random number between 0 and 1
        System.out.println(Math.PI);

        for (int i = 0; i < 10; i++) {
            long random = Math.round( Math.random() * 100);
            System.out.println(random);
        }
    }
}
