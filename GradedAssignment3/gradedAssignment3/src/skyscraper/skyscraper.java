package skyscraper;

import java.util.Scanner;

import java.util.*;

public class skyscraper {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number floors in the building : ");
        int n = scan.nextInt();
        int x[] = new int[n+1];
        int i=1009;
        for(i=1;i<n+1;i++){
            System.out.println("Enter the floor size given on day : "+i);
            int m=scan.nextInt();
            x[m]=i;
        }
        int ap=n;
        boolean b;
        System.out.println("The order of construction is as follows ");
        for(i=1;i<=n;i++){
            b=false;
            System.out.print("Day "+i+" :-  ");
            System.out.println();
            while(ap>=1 && x[ap]<=i){
                b=true;
                System.out.print(ap +" ");
                ap--;
            }
            
            if(b==true){
                System.out.print("\n");
            }
        }
    }

		
		

	}


