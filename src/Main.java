// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        ///FIBONACCI///
//        Fibonacci f = new Fibonacci();
//        f.fibonacci(10);
//        System.out.println();
        //=======================//
        HunterVs hunterVs = new HunterVs(5,10);
        hunterVs.print();
        hunterVs.shoot();
    }
}
class Fibonacci{
public void fibonacci(int n) {
    int fib0 = 0, fib1 = 1, fib3;
    System.out.printf("%d %d ",fib0, fib1);
    for (int i = 2; i < n; i++) {
        fib3 = fib0 + fib1;
        fib0 = fib1;
        fib1 = fib3;
        System.out.printf("%d ",fib3);

}
}
}
class HunterVs {
    private int[] monsters;
    private static final int MaxHp = 30;
    private static final int MinHp = 1;
    private final int rifleDamage;
    public HunterVs(int monstersAmount, int _rifleDamage){
        rifleDamage = _rifleDamage;
        monsters = new int[monstersAmount];
        for (int i =0; i<monstersAmount; i++) {
            Random rand = new Random();
             monsters[i] = rand.nextInt(MaxHp) + MinHp;
        }
    }
    public void print(){
        System.out.println("Monsters' hp: ");
        for (int i=0;i<this.monsters.length;i++){
            System.out.printf("%d ",monsters[i]);
        }
        System.out.println();
    }
    public void shoot(){
        System.out.print("Order of monsters' deaths: ");
        for (int i=0;i<this.monsters.length;i++) {
            this.monsters[i] = this.monsters[i]%this.rifleDamage;
            if (this.monsters[i] == 0) System.out.printf("%d ",i+1);
        }
        for (int i = this.rifleDamage-1; i > 0; i--){
            for (int j = 0; j< this.monsters.length;j++)
                if (this.monsters[j] == i) System.out.printf("%d ",j+1);
        }
    }



}



