import java.util.Scanner;
public class simple {
    public static void main(String[] args) {
        System.out.println("1.Addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("5.modules");
        Scanner in=new Scanner(System.in);
        int X,Y,Z,choice;
        System.out.println("Enter the first number:");
        X=in.nextInt();
        System.out.println("Enter the second number:");
        Y=in.nextInt();
        System.out.println("Enter the choice 1 to 5");
        choice=in.nextInt();
        switch (choice) {
            case 1:
            Z=X+Y;
            System.out.println("Addition:"+Z);
            break;
            case 2:
            Z=X-Y;
            System.out.println("Subtraction:"+Z);
            break;
            case 3:
            Z=X*Y;
            System.out.println("multiplication:"+Z);
            break;
            case 4:
            Z=X/Y;
            System.out.println("Division:"+Z);
            break;
            case 5:
            Z=X%Y;
            System.out.println("modules"+Z);
            break;
        }
    }
    
}
