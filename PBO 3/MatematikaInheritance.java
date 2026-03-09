/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Nasya Putri Anjani
 */
public class MatematikaInheritance {

    public static void main(String[] args) {
        Matematika2 mtk2 = new Matematika2();
        
        int a, b;
        a = 20; b=10;
        System.out.println("Pertambahan : " + a + "+" + b + "=" + mtk2.pertambahan(a,b));
        
        a = 10; b =5;
        System.out.println("Pengurangan : " + a + "-" + b + "=" + mtk2.pengurangan(a,b));
        
        a=10; b=3;
        System.out.println("Perkalian   : " + a + "*" + b + "=" + mtk2.perkalian(a,b));
        
        a=21; b=2;
        System.out.println("Pembagian   : " + a + "/" + b + "=" + mtk2.pembagian(a,b));
        
        a=35; b=4;
        System.out.println("Modulus   : " + a + "%" + b + "=" + mtk2.modulus(a,b));
       
    }
    
}
