package by_it_academy;

public class MavenClass {


    public static String printMe() {
        return "Maven Borisevich";
    }

    public int calculateSmth(Integer randomNumber) {
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