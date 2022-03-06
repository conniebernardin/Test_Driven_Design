import java.sql.SQLOutput;
import java.util.Scanner;

public class GradingClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        System.out.println(returnGrade(grade));

    }

    public static String returnGrade(int input){

        String output = "";

        if (input > 100 || input < 0){
            output ="Grade not valid";
        }else if (input < 50){
            output ="Fail";
        }
        else if (input < 60){
            output ="D";
        }
        else if (input < 70){
            output="C";
        }
        else if (input < 80){
            output="B";
        }
        else if (input < 100 && input >= 81){
            output="A";
        } return output;
    }
}
