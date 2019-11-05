public class Figures {
    public static void main(String[] args) {
        System.out.println("Rectangle: ");
        A();
        System.out.println();
        System.out.println("Triangle1: ");
        Ba();
        System.out.println();
        System.out.println("Triangle2: ");
        Bb();
        System.out.println();
        System.out.println("Triangle3: ");
        Bc();
        System.out.println();
        System.out.println("Triangle4: ");
        Bd();
    }

    static void A() {
        int n = 5;
        char c = '#';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
        //in.close();
    }

    static void Ba() {
        int n = 8;
        char c = '#';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }

            System.out.println();
        }
    }
    static void Bb() {
        int n = 8;
        char c = '#';

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void Bc() {
        int n = 8;
        char c = '#';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k=n;k>i;k--){
                System.out.print(c);
            }

            System.out.println();
        }
    }

    static void Bd() {
        int n = 8;
        char c = '#';

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print(c);
            }

            System.out.println();
        }
        // in.close();

    }

}





