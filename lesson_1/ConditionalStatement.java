public class ConditionalStatement {
    public static void main(String[] args) {
        int ageOfPerson = 29;
        boolean maleGender = false;
        float heightOfPerson = 1.64f;
        char firstLetter = 'A';

        if (ageOfPerson > 20) {
            System.out.println("you are over 20 years old");
        }
        if (maleGender) {
            System.out.println("male");
        }
        if (!maleGender) {
            System.out.println("female");
        }
        if (heightOfPerson < 1.80) {
            System.out.println("your height is less than 1.80");
        } else {
            System.out.println("your height is more than 1.80");
        }

        if (firstLetter == 'M') {
            System.out.println("First letter - M");
        } else if (firstLetter == 'I') {
            System.out.println("First letter - I");
        } else {
            System.out.println("First letter - " + firstLetter);
        }
    }
}