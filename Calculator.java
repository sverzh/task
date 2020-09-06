class Calculator {
    private  static Number a;
    private static Number b;

    public Calculator(Number a,Number b,String c) throws Exception {
        this.a=a;
        this.b=b;
        switch (c){
            case "+": Calculator.Add();break;
            case "-": Calculator.Substract();break;
            case "*": Calculator.Multiplication();break;
            case "/": Calculator.Devision();break;
            default:
                System.out.println("Выбранная операция не поддерживается или не верная запись"); }
    }
    private static void Add() throws Exception {
        if (allArabics()) System.out.println(a.ToInt()+b.ToInt());
        else if (allRome()) System.out.println(Number.toRome(a.ToInt()+b.ToInt()));

        else throw new Exception("Не возможно выполнить операцию");
    }
    private static void Substract() throws Exception {
        if (allArabics()) System.out.println(a.ToInt()-b.ToInt());
        else if (allRome())
            if ( a.ToInt()>b.ToInt()) System.out.println(Number.toRome(a.ToInt()-b.ToInt()));
        else throw new Exception("Отрицательный результат");
        else throw new Exception("Не возможно выполнить операцию");
    }
    private static void  Multiplication() throws Exception {
        if (allArabics())  System.out.println(a.ToInt()*b.ToInt());
        else  if (allRome()) System.out.println(Number.toRome(a.ToInt()*b.ToInt()));
        else throw new Exception("Не возможно выполнить операцию");
       }

    private static void Devision()throws Exception{
        if (allArabics()) System.out.println(a.ToInt()/b.ToInt());
        else if (allRome()) System.out.println(Number.toRome(a.ToInt()/b.ToInt()));
        else throw new Exception("Не возможно выполнить операцию");
    }
     private static boolean allArabics(){
         return a.isArabic() & b.isArabic();
     }
    private static boolean allRome(){
        return a.isRome() & b.isRome();
    }


}
