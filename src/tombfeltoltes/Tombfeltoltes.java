/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombfeltoltes;

import java.util.Scanner;

/**
 *
 * @author NédaÍriszAdelinda(SZ
 */
public class Tombfeltoltes {

    //static Scanner sc = new Scanner(System.in, "utf-8");
    //static Scanner sc = new Scanner(System.in, "latin2");
    static Scanner sc = new Scanner(System.in, "windows-1250");
    
    public static void main(String[] args) {
        /*bekérés*/
        /*1.: programba drótózva:*/
        //final int DB = 3;
        /*2.: user dönti el:*/
        System.out.print("Név db: ");
        final int DB = sc.nextInt();
        sc.nextLine();//enter kiolvasása a streamből
        
        String[] nevek = new String[DB];
        /*feltöltés*/
        for (int i = 0; i < DB; i++) {
            System.out.printf("%d/%d név: ", DB, i+1);
            String nev = sc.nextLine();
            nev = "Pál";
        }
        /*kiírás*/
        for (int i=0; i<DB; i++){
            System.out.println(nevek[i]);
        }
        
    }
    
}
