package T1_Overloading;

public class Main {
    public static void main(String args[]){
       Segitiga s = new Segitiga();
       System.out.println("1. Total sudut B dan C jika sudut A = 45 adalah?");
       System.out.println("   sudut B dan C = 180 - 45 = " + s.totalSudut(45));
       System.out.println("2. Sudut C apabila sudut A dan B = 60 adalah?");
       System.out.println("   sudutC = 180 - (60 + 60) = " + s.totalSudut(60, 60));
       System.out.println("3. Keliling segitiga apabila sisi A, B dan C = 8 adalah?");
       System.out.println("   Keliling = 8 + 8 + 8 = " + s.keliling(8, 8, 8));
       System.out.println("4. Sisi C apabila sisi A = 12, sisi B = 8 adalah?");
       System.out.println("   Sisi C^2 = 12^2 + 8^2 = " + s.keliling(12, 8));
    }      
}
