package pentle;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 100; i >=0; i--) {
            System.out.println(i);
        }
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        for (int j = 300; <= 1000; j++) {
            if (j % 2 == 0 && j % 3 == 0) {
                System.out.println(j);
            }
        }


    }

}
