package feladatok;

public class Szamok {
    public static void main(String[] args) {
        final int DB = (int)(Math.random()*(25-15+1)+15);
        int[] paratlanok = new int[DB];
        
        for (int i = 0; i < DB; i++) {
            int szam = (int)(Math.random()*(99-10+1)+10);
            if(szam % 2 == 0){
                szam++;
            }
            paratlanok[i] = szam;
        }
        
        paratlanok[(int)(Math.random()*paratlanok.length)]++;
        
        for (int i = 0; i < DB; i++) {
            System.out.print(paratlanok[i] + " ");
        }
        System.out.println("");
        
        int i = 0;
        while(!(paratlanok[i] % 2 == 0)){
            i++;
        }
        System.out.println("páros elem: " + paratlanok[i]);
    }
}
