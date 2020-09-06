
import java.util.Arrays;

class Number {
    private String a;

    private static String[] toint = {null,"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    private static String[] romans = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C" };
    private static int[] ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100 };

    Number(String a){
        this.a = a;
        }

        int ToInt() throws Exception {

        if (isRome())
        for (int i = 1; i <=10 ; i++) {
            if (a.equals(toint[i])) return i;
        }
        if (isArabic()) {
            if (Integer.parseInt(a) != 0) return Integer.parseInt(a);
            if (Integer.parseInt(a) == 0) throw new Exception("Все или одно из чисел равно 0");
        }
        else throw new Exception("Не возможно посчитать!");

        return 0;
    }

    static String toRome(int num) {
        StringBuilder sb = new StringBuilder();
        int times;
        for (int i = ints.length - 1; i >= 0; i--) {
            times = num / ints[i];
            num %= ints[i];
            while (times > 0) {
                sb.append(romans[i]);
                times--;
            }
        }
        return sb.toString();
    }

     boolean isRome(){
         return Arrays.asList(toint).contains(a);
    }

    boolean isArabic(){
        try{
            Integer.parseInt(a);
        }
        catch (Exception e){
            return false;
        }
        return true;

    }

}
