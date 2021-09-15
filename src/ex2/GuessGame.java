package ex2;

public class GuessGame {
    public static void main(String[] args) {
        Guess a = new Guess("황기태");
        Guess b = new Guess("이재문");

        int result1 = a.run();
        int result2 = b.run();

        if(Math.abs(result1 - 10) < Math.abs(result2 - 10)) {
            System.out.println("황기태의 결과 " + result1 + ", 이재문의 결과 " + result2 + ", 승자는 황기태");
        }
        else {
            System.out.println("황기태의 결과 " + result1 + ", 이재문의 결과 " + result2 + ", 승자는 이재문");
        }
    }
}
