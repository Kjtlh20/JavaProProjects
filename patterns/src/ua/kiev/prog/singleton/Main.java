package ua.kiev.prog.singleton;

public class Main {
    public static void main(String[] args) {
        SimpleSingleton simple = SimpleSingleton.getInstance();
        simple.check();

        AdvancedSingleton adv = AdvancedSingleton.getInstance();
        adv.check();
    }
}
