public class Main {
    public static void main(String[] args) {
        Cesare cs = new Cesare();
        String msg_encode = cs.encode("ciao sono uno studente");
        System.out.println(msg_encode);
        String msg_decode = cs.decode(msg_encode);
        System.out.println(msg_decode);
    }
    
}
