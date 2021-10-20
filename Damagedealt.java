import java.util.Scanner;

// <Amari Lombel>, Damage dealt , Andrew Jackson High School, <Date>, <Time>, v0.0

public class DamageDealt {
    public static void main (String[]args){
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("please Enter Your weapon: ");
    
        String WeaponName = myScanner.nextLine();
        
        System.out.println("Your weapon is:" + WeaponName);  



    }
}