package ex3;

public class TimeCheck {
    public static void main(String[] args) {
        long start, end;
        final String text = "java";
        final int count = 100;

        // String 클래스의 처리속도
        String str = new String();
        start = System.nanoTime();
        for(int i=0; i<count; i++) {
            str += text;
        }
        end = System.nanoTime();
        System.out.println("String 클래스의 처리시간: "+(end-start)/100000.0+"밀리세컨");

        // StringBuffer 클래스의 처리속도
        StringBuffer sb = new StringBuffer();
        start = System.nanoTime();
        for(int i=0; i<count; i++) {
            sb = sb.append(text);
        }
        end = System.nanoTime();
        System.out.println("StringBuffer 클래스의 처리시간: "+(end-start)/100000.0+"밀리세컨");

        // StringBuffer 클래스의 처리속도
        StringBuilder sbd = new StringBuilder();
        start = System.nanoTime();
        for(int i=0; i<count; i++) {
            sbd = sbd.append(text);
        }
        end = System.nanoTime();
        System.out.println("StringBuilder 클래스의 처리시간: "+(end-start)/100000.0+"밀리세컨");
    }
}
