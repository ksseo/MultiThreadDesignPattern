public class Main {
    public static void main(String[] args) {
        try {
            new MiniServer(8888).execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
