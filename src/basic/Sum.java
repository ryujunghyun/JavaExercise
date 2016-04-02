import java.util.Scanner;

public class jh {
    public static void main(String[] args) {
        float Sum = 0;

        Scanner scanner = new Scanner(System.in);
        Sum = scanner.nextFloat();
        Sum += scanner.nextFloat();
        Sum += scanner.nextFloat();
        Sum += scanner.nextFloat();
        Sum += scanner.nextFloat();

        System.out.println("평균:"+Sum / 5);
    }
}
