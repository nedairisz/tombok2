package tombfeltoltes;

import java.util.Random;

public class VelSzam {
    
    static Random rnd = new Random();
    
    public static void main(String[] args){
        final int DB =5;
        int[] korok = new int[DB];
        
        /*feltöltés*/
        for (int i =0; i<DB; i++){
            //korok[i]=(int)(Math.random()*100);//0..99
            korok[i]=rnd.nextInt();//Integer.MIN_VALUE..Integer.MAX_VALUE
            //korok[i] =rnd.nextInt(100);//0..99
            //korok[i]=rnd.nextInt(15,48);//15..47
        }
    }
}
