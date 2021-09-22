package by.it.academy;

public class MavenClass {


    public static String printMe() {
        return "Maven Borisevich";
    }

    public int summarazingNumbers(Integer randomNumber) {
        if (randomNumber == null) {
            return 0;
        }
        return randomNumber + randomNumber;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println(MavenClass.printMe());
        }

    }
}
