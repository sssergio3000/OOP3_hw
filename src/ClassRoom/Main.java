package ClassRoom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kind;
        Pupil[] ppls = new Pupil[4];// массив учеников
        byte counter = 0;
        while (counter < 4) {
            System.out.println("What kind of pupil do we create?: ");
            kind = scan.nextLine();
            switch (kind) {
                case "Excellent": {
                    ppls[counter] = new ExcellentPupil();
                    counter += 1;
                    System.out.println("Excellent Pupil created");
                    break;
                }
                case "Good": {
                    ppls[counter] = new GoodPupil();
                    counter += 1;
                    System.out.println("Good Pupil created");
                    break;
                }
                case "Bad": {
                    ppls[counter] = new BadPupil();
                    counter += 1;
                    System.out.println("Bad Pupil created");
                    break;
                }
                default: {
                    System.out.println("No such kind");
                }

            }


        }//while
        ClassRoom class1 = new ClassRoom(ppls);
        System.out.println("---------------------");

        for (Pupil pup : class1.pupil) {
            System.out.println("This is pupil of kind " + pup.getClass());
            pup.read();
            pup.relax();
            pup.study();
            pup.write();
            System.out.println("_________________________");

        }

    }//main
}//class
