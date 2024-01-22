package method;

public class Method1 {
    public static void main(String[] args) {
        //계산 1
        int a = 1;
        int b = 2;

        int sum1 = add(a,b);
        System.out.println("결과1 출력" + sum1);

        // 계산2
        int x = 10;
        int y = 20;

        //int sum2 = x + y;
        int sum2 = add(x, y);

        System.out.println("결과1 출력" + sum2);

    }

    public static int add(int a, int b) {
        int result = 0;
        result = a + b;
        System.out.println(a + "+" + b + "연산수행");
        return result;
    }
}
