package singo;

public class Singo {

    private static Singo singo = new Singo();

    private Singo() {

    }

    public static Singo getSingo() {
        return singo;
    }
}
