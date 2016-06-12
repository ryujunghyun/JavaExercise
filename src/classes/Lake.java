
/*1. Lake의 Fish를 10마리로 늘려보자.
Fish를 배열로 만들 것!

2. 10마리 Fish 중 홀수 인덱스는 원래 대로 랜덤하게 움직이게 하고, 짝수 인덱스 Fish는 x, y를 무조건 1씩 증가하도록 움직이게 해보자.
새로운 Fish2 클래스를 만들어도 되고, Fish 클래스에 새로운 움직임 메소드를 만들어도 됨.*/
import java.util.Scanner;

/**
 * Created by jyheo on 2016-04-03.
 */
class Fish {
    private String name;
    private String shape;
    private int x, y;

    public Fish(String name, String shape) {
        this.name = name;
        //this.shape = shape;
       // x = 0;
        y = 0;
    }
    public Fish() {
        this.name = "Unknown";
        this.shape = "<--<";
        x = 0;
        y = 0;
    }
    public void move2(int width, int height){
        x++;
        y++;
        if(x>=width)
            x=0;
        if(y>=height)
            y=0;
    }

    public void display(int x, int y){
     if(this.x==x&&this.y==y){
         System.out.print(shape);

    }

    


    }
}

public class Lake {
    private int width;
    private int height;
    private Fish[] fish= new Fish[10];//배열 10개

    public Lake(int width, int height) {
        this.width = width;
        this.height = height;
        for(int i=0; i<fish.length; i++){
            fish[i]=new Fish("fish"+(i), "<--<");
        }
    }

    public void moveFish() {
        for(int i=0; i<10; i++){
            switch (i%2){
                case 0:
                    fish[i].move2(width, height);
                    break;
                case 1:
                    fish[i].move(width, height);
                    break;
            }
        }
    }

    public void display() {
        for (int i = 0; i < height; i++)
            System.out.print("|");
        for(int j=0; j<width; j++){
            for(int k=0; k<10; k++){
                fish[k].display(j, i);
            }
            System.out.print(" ");
        }
        System.out.println("|");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
            System.out.println();
    }

    public static void main(String args[]) {
        Lake lake = new Lake(80, 20);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            lake.moveFish();
            lake.display();
            scanner.next();
        }
    }
}
