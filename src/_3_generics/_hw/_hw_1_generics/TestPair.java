package _3_generics._hw._hw_1_generics;

public class TestPair {
    public static void main(String[] args) {
        Pair pair = new Pair<>("qwe", "ewq");
        System.out.println(pair.getFirstElem());
        System.out.println(pair.getSecondElem());
        pair.setFirstElem(1);
        pair.setSecondElem(2);
        System.out.println(pair.getFirstElem());
        System.out.println(pair.getSecondElem());
    }
}
