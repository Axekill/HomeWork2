public class Main {
    public static void main(String[] args) {
        // 1 задание
        byte q =12;
        short w= -2134;
        int a= 234;
        long d = 215858545;
        float r= 4.155f;
        double s = 6.21564874564;
        char b = 42;
        boolean j= true;

        // 2 задание
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        var weightBoxers = boxer1+ boxer2;
        var weightDifference = boxer2- boxer1;

        // 3 задание

        var bananas= 5 * 80;
        var milk = 2 * 105;
        var iceCream = 2*100;
        var eggs = 4* 70;
        double blender = bananas + milk + iceCream + eggs;
        int grInKg=1000;
        double scales = blender / grInKg;

        // 4 задание

        int excessWeightKg = 7;
        int kgInGr=1000;
        int excessWeight= excessWeightKg*kgInGr;
        int ration1= 250;
        int ration2= 500;
        int daysOfWeightLoss = excessWeight / ration1 ;
        System.out.println(daysOfWeightLoss);
        int daysOfWeightLoss2= excessWeight / ration2;
        System.out.println(daysOfWeightLoss2);
        int averageDays = (daysOfWeightLoss+daysOfWeightLoss2)/2 ;

        // задание 5
        int Masha = 67760;
        int Den = 83690;
        int Cris = 76230;
        var year = 12;
        double increaseCash = 0.1;
        // вычисление увеличеной зарплаты на10%
        double increaseCashMasha= (Masha*increaseCash)+Masha;
        double increaseCashDen= (Den*increaseCash)+Den;
        double increaseCashCris= (Cris*increaseCash)+Cris;
        // разница годовой зарплаты
        double yearCashMasha = (increaseCashMasha * year)-(Masha*year);
        double yearCashDen = (increaseCashDen * year)-(Den*year);
        double yearCashCris = (increaseCashCris * year)-(Cris*year);



        System.out.println(yearCashMasha);
    }
}