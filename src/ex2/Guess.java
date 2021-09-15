package ex2;


import java.util.Calendar;
import java.util.Scanner;

public class Guess {
    Calendar now = Calendar.getInstance();
    Scanner str = new Scanner(System.in);

    String name, enter;
    int before, after;

    public Guess(String name) {
        this.name = name;
    }

    public int run(){
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        System.out.print(name+" 시작 <Enter>키  >>");

        enter = str.nextLine();
        now = Calendar.getInstance();

        System.out.println("    현재 초 시간 = "+ now.get(Calendar.SECOND));

        before = now.get(Calendar.SECOND);

        System.out.print("10초 예상 후 <Enter>키  >>");

        enter = str.nextLine();
        now = Calendar.getInstance();

        System.out.println("\t현재 초 시간 = "+ now.get(Calendar.SECOND));

        after = now.get(Calendar.SECOND);

        if(before < after) {
            return after - before;
        }
        else {
            return (60 - before) + after;
        }
    }
}

