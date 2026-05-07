
import java.util.Scanner;
public class PatternGenerator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        int n;
        while(true){

            System.out.println("\n Pattern generator Menu ===");
            System.out.println("1. Right Triangle Pattren");
            System.out.println("2. Centre Pattren Pyramind");
            System.out.println("3. Inverted or reverse Pryamind Pattern");
            System.out.println("4.Exit");
            choice =sc.nextInt();
            
            if(choice==4){
                System.out.println("Thanks for visit");
                break;
            }
    
        System.out.print("Enter the number of rows:");
        n=sc.nextInt();

        switch(choice){
            case 1:  //Right traingle pattern 

                for(int i =1 ;i<=n;i++){        // row
              

                    for(int j=1;j<=i;j++){     // star
                        System.out.print("*");
                    } 
                    System.out.println();
                } 
                break;

            case 2:          // centre pattern pyramid
                for (int k=1;k<=n;k++){
                    for(int m=1;m<=n-k;m++){     // we can also write like this j<n

                        System.out.print(" ");
                    }
                    for(int p=1;p<=(2*k-1);p++){

                            System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 3:           // inverted pyramid
                for(int x=1;x<=n;x++){

                    for(int y=1;y<=n-x;y++){

                        System.out.print(" ");
                    }
                    for(int z=1;z<=(n-x+1);z++){

                            System.out.print("* ");
                    }
                     System.out.println();   
                }
                break;
            default:
                System.out.println("Invalid  Choice");
                
            }
        }   
    
        
            
            
    }
          
        
}


