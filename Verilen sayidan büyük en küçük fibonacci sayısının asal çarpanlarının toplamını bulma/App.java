//Verilen Sayi 10000

package org.csystem.app;
class App{
    public static void main(String[] args) {
        NumberUtil.run();

    }
}

class NumberUtil{
    public static int getFibonacci()
    {
        int a = 1;
        int b = 1;
        int c = 0;
        for (;;){
            c = a + b ;
            a = b ;
            b = c;

            if (c > 10000)
                break;
        }
        return c;
    }
    public static boolean isPrime(int val)
    {
        if (val < 1)
            return false;
        if (val % 2 == 0)
            return val == 2;
        if (val % 3 == 0)
            return val == 3;
        if (val % 5 == 0)
            return val == 5;
        if (val % 7 == 0)
            return val == 7;
        for (int i = 11 ; i * i <= val ; ++i)
            if (i % val == 0)
                return false;
        return true;
    }
    public static void run()
    {
        int sum = 0;
        int a = getFibonacci();
        for (int i = 0 ; i <= a; ++i)
            if (isPrime(i))
                sum += i;
        System.out.printf("Verdiğiniz değerden büyük en küçük fibonacci sayisinin asal çarpanlarının toplamı %d%n",sum);
    }


}