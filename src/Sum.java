public class Sum {
    void sum(int x, long b){
        System.out.println(x+b);
    }
    void sum(int y, int c){
        System.out.println(y+c);
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        s.sum(5,123647886l);
        s.sum(9,456);
    }
}
