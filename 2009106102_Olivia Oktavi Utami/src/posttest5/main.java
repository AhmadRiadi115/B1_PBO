
package posttest5;


import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int choosemenu;

        Emina face = new Emina("", "", 0, 0);
        ArrayList<Emina> faces = new ArrayList<>();

        Emina lip = new Emina("", "", 0, 0);
        ArrayList<Emina> lips = new ArrayList<>();

        Emina eye = new Emina("", "", 0, 0);
        ArrayList<Emina> eyes = new ArrayList<>();
        
        Emina say = new Emina("","",0,0);
        Emina say1 = new Emina("","",0,0);
        Emina say2 = new Emina("","",0,0);
        
        while (true) {
            System.out.println("====================================");
            System.out.println("        welcome to drugstore        ");
            System.out.println("====================================");
            System.out.println("------------select the menu below----------");
            System.out.println("|   [1] Show All Stock Emina cosmetics     |");
            System.out.println("|   [2] Add stock Emina cosmetics          |");
            System.out.println("|   [3] Edit stock Emina cosmetics         |");
            System.out.println("|   [4] Remove stock Emina cosmetics       |");
            System.out.println("|   [5] Exit                               |");
            System.out.println("--------------------------------------------");
            System.out.println(" CHOOSE MENU : ");

            choosemenu = input.nextInt();
            switch (choosemenu) {
                case 1:
                    System.out.println("===Category Stocks Emina====");
                    System.out.println("|         [1] Face         |");
                    System.out.println("|         [2] Lips         |");
                    System.out.println("|         [3] Eyes         |");
                    System.out.println("|         [4] Exit         |");
                    System.out.println("|===========================");

                    choosemenu = Integer.valueOf(input.nextInt());
                    switch (choosemenu) {
                        case 1:
                            face.faceShow(faces);
                            say2.saysfaces();
                            break;
                        case 2:
                            lip.lipsShow(lips);
                            say1.sayslips();
                            break;
                        case 3:
                            eye.eyesShow(eyes);
                            say.sayseyes();
                            break;
                        case 4:

                            break;
                        default:
                            System.out.println("Not available.");

                    }
                    break;
                case 2:
                    System.out.println("===Category Stocks Emina====");
                    System.out.println("|         [1] Face         |");
                    System.out.println("|         [2] Lips         |");
                    System.out.println("|         [3] Eyes         |");
                    System.out.println("|         [4] Exit         |");
                    System.out.println("|===========================");

                    choosemenu = Integer.valueOf(input.nextInt());
                    switch (choosemenu) {
                        case 1:
                            face.faceAdd(faces);
                            break;
                        case 2:
                            lip.lipsAdd(lips);
                            break;
                        case 3:
                            eye.eyesAdd(eyes);
                            break;
                        case 4:

                            break;
                        default:
                            System.out.println("Not available.");

                    }
                    break;
                case 3:
                    System.out.println("===Category Stocks Emina====");
                    System.out.println("|         [1] Face         |");
                    System.out.println("|         [2] Lips         |");
                    System.out.println("|         [3] Eyes         |");
                    System.out.println("|         [4] Exit         |");
                    System.out.println("|===========================");

                    choosemenu = Integer.valueOf(input.nextInt());
                    switch (choosemenu) {
                        case 1:
                            face.facesEdit(faces);
                            
                            break;
                        case 2:
                            lip.lipsEdit(lips);

                            break;
                        case 3:
                            eye.eyesEdit(eyes);

                            break;
                        case 4:
                            
                            break;
                        default:
                            System.out.println("Not available.");

                    }
                    break;
                case 4:
                    System.out.println("===Category Stocks Emina====");
                    System.out.println("|         [1] Face         |");
                    System.out.println("|         [2] Lips         |");
                    System.out.println("|         [3] Eyes         |");
                    System.out.println("|         [4] Exit         |");
                    System.out.println("|===========================");

                    choosemenu = Integer.valueOf(input.nextInt());
                    switch (choosemenu) {
                        case 1:
                            face.facesRemove(faces);
                            break;
                        case 2:
                            lip.lipsRemove(lips);
                            break;
                        case 3:
                           eye.eyesRemove(eyes);
                            break;
                        case 4:
                            
                            break;
                        default:
                            System.out.println("Not available.");

                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not available.");
            }
        }
    }
}
