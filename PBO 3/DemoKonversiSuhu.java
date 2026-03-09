/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nasya Putri Anjani
 */
public class DemoKonversiSuhu {
    
    public static void main(String[]args){
    KonversiSuhu2 ks2 = new KonversiSuhu2();
    
    double c = 100;
    System.out.println("Konversi Suhu Celcius ke Fahrenheit : " + ks2.celciusToFahrenheit(c));
    
    c = 75;
    System.out.println("Konversi Suhu Celcius ke Reamur : " + ks2.celciusToReamur(c));
    
    double f = 45;
    System.out.println("Konversi Suhu Fahrenheit ke Reamur : " + ks2.fahrenheitToReamur(f));
    }
    
}
