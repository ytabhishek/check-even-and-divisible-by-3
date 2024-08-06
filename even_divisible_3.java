package conditional;
import java.util.Scanner;
public class even_divisible_3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n%2==0){
            if(n%3==0){
                System.out.println("This is a even number and also divisible by 3");
            }else{
                System.out.println(" This is a even number but it is not divisible by 3");
            }
            }else{
            System.out.println("This is not a  even number");

        }
        }
    }

