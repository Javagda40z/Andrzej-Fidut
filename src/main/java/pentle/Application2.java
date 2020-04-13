package pentle;

public class Application2 {
    public static void main(String[] args) {

        String napis = "Jestem na dobrej drodze do zostania profesjonalnym programistą Java";

        for (int i = 1; i <= 10; i++) {
            System.out.println("nr: " + i + napis);
        }
        System.out.println(napis.length());

        for (int i = 0; i < napis.length(); i = i + 2) {
            System.out.println(napis.charAt(i));
        }

        while (true) {
            System.out.println(napis);
        }
    }
}
