public class Main {
    static final int TRAGUARDO = 100;
    static int posizione = 0;

    public static void main(String[] args) {
        BambinoExtends carlo = new BambinoExtends("Carlo");
        BambinoExtends matilde = new BambinoExtends("Matilde");
        BambinoExtends francesco = new BambinoExtends("Francesco");

        carlo.start();
        matilde.start();
        francesco.start();
    }
}