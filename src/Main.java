import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    System.out.println("Hello Twitter user:)");
    System.out.println("For a rectangle tower press 1\n" +
            "For a triangular tower press 2\n" +
            "To exit press 3");

            Scanner myObj = new Scanner(System.in); //reading user choice
            int choice = Integer.parseInt(myObj.nextLine());
while (choice!=3) {
    int width = 0, height = 0;
    switch (choice) {
        case 1: {
            System.out.println("Enter rectangle width");
            width = Integer.parseInt(myObj.nextLine());//reading rec width
            do {
                System.out.println("Enter rectangle height");
                height = Integer.parseInt(myObj.nextLine());//reading rec height
                if (height < 2)
                    System.out.println("Wrong Input"); //announcement about mistake
            } while (height < 2); //check correct input

            PrintRec(width, height); //print the rec according to the terms
            break;
        }
        case 2: {
            System.out.println("Enter Triangle width");
            width = Integer.parseInt(myObj.nextLine());//reading Tri width
            System.out.println("Enter Triangle height");
            height = Integer.parseInt(myObj.nextLine());//readingg Tri height
            System.out.println("To print the area of the triangle press 1\n" +
                    "To print the triangle press 2");
            int myChoice = Integer.parseInt(myObj.nextLine());
            switch (myChoice) {
                case 1: {
                    System.out.println("Area: " + width * height);
                    break;
                }
                case 2: {
                    PrintTriangle(width, height);
                    break;
                }
            }
            break;
        }


    }
    System.out.println("Hello Twitter user:)");
    System.out.println("For a rectangle tower press 1\n" +
            "For a triangular tower press 2\n" +
            "To exit press 3");
     choice = Integer.parseInt(myObj.nextLine());
}
        System.out.println("bye!");

    }
    public static void PrintRec(int width, int height) {
        if (Math.abs(width - height) < 5) {
            //print Scope
            System.out.print("Scope: ");
            System.out.println(width * 2 + height * 2);
        }
        else
            //print Area
            System.out.println("Area: " + width * height);

    }

    public static void PrintTriangle(int width, int height) {
        //check triangle correctness
        if (width % 2 == 0 || width > 2 * height)
            System.out.println("Unable to print the triangle");
        else {
            int my_height = height - 2;
            int my_width = width / 2;
            int count = 0;
            int rest = 0;
            int num_of = 0;
            for (int j = 0; j < my_width; j++) { //print spaces for first *
                System.out.print(" ");
            }
            System.out.print("*\n"); //print first *
           /* if (my_height % 2 == 0)
                count = my_height / 2 - 1; //the amount of no even numbers except 1 for eve num
            else
                count = my_height / 2; //the amount of no even numbers except 1 for un even num*/
            count=width/2-1;
            //if(count!=0)
            rest = my_height % count;
           // if(my_height==2)
              //  rest=2;
           // if(my_height==1)
             //   rest=1;





            //
            my_width = my_width - 1;   //update number of spaces
            for (int k = 0; k < rest; k++) {

                for (int j = 0; j < my_width; j++) { //print spaces for rest
                    System.out.print(" ");
                }
                System.out.print("***");
                System.out.print("\n");
            }
           /* for (int h=0;h<count;h++)
            {
            for (int i=5;i<my_height-rest;i=i+2)
            {
                my_width=my_width-1;
                for(int j=0;j<my_width;j++){ //print spaces
                    System.out.print(" ");
                }

                    System.out.print("*");
                }
            }*/
          //  for (int j = 0; j < (my_height - rest)/count; j++) {


                    for (int h = 3; h < width; h+=2) {

                        for (int y = 0; y < my_height/count; y++) {
                            for (int m = 0; m < my_width; m++)  //print spaces
                                System.out.print(" ");
                            for (int g = 0; g < h; g++) {
                                System.out.print("*");

                            }
                            System.out.print("\n");
                        }
                        my_width-=1;
                    }
for(int i=0;i<width;i++)
    System.out.print("*");
                }
        System.out.print("\n");
            }

        }
    //}
