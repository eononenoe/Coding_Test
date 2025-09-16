import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double cnt = 0;
        for (int i = 0; i < 20; i++) {
            String[] s = sc.nextLine().trim().split("\\s+");
            String book = s[0];
            double point = Double.parseDouble(s[1]);
            String grade = s[2];
            double score;

            if(grade.equals("P")){
                continue;
            }
            switch (grade) {
                case "A+":
                    score = 4.5;
                    break;
                case "A0":
                    score = 4.0;
                    break;
                case "B+":
                    score = 3.5;
                    break;
                case "B0":
                    score = 3.0;
                    break;
                case "C+":
                    score = 2.5;
                    break;
                case "C0":
                    score = 2.0;
                    break;
                case "D+":
                    score = 1.5;
                    break;
                case "D0":
                    score = 1.0;
                    break;
                 case "F":
                    score = 0.0;
                    break;
                default:
                    score = 0;
                    break;
            }
            sum += (point*score);
            cnt += point;
        }
        System.out.println(sum/cnt);
    }
}
