package homework.lesson7.pair;

public class PairRunner {

    public static void main(String[] args) {

        String str = "Java";
        Integer num = 8;

        Pair<String, Integer> pair = new Pair<>(str, num);
        System.out.println(pair.getLeft() + " " + pair.getRight());
    }
}
