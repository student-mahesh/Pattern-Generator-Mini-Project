
import java.util.Scanner;

public class StudentResultSystem {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number of Student");
        int n=sc.nextInt();

        int[] marks=new int[n];

        System.out.println("Enter the Marks of Students");

        for(int i=0;i<n;i++){

            marks[i]=sc.nextInt();

        }
        
        System.out.println("Students Marks are");
        for(int i=0;i<n;i++){

            System.out.print(marks[i]+" ");

        }

        System.out.println();       // Add space 
        
        int sum=0;         // as sum store addtion value 
        for(int i=0;i<n;i++){    // sum and average

            sum=sum+marks[i];

        }
        double average= (double) sum/n;   // average   we take double because both int type reduce (.) value

        System.out.println("Total Marks of Students are:"+sum);
        System.out.println("Average Marks of Students are:"+average);

        System.out.println();       // Add space 

        int max=marks[0];   //it compare element from 0 index so it is return in array.

        for (int i =1;i<n;i++){

            if(marks[i]>max){

                max=marks[i];

            }
           
        }
        System.out.println("Highest Marks of Student is  :"+max);


        int min=marks[0];

        for(int i=1;i<n;i++){

            if(marks[i]<min){

                min=marks[i];
            }
                
        }
        System.out.println("The Lowest Marks of Student is:"+min);

        System.out.println();       // Add space 

        int evenCount =0;     // Even and Odd Marks count.
        int oddCount=0;

            for(int i=0;i<n;i++){

                if(marks[i]%2==0){

                    evenCount++;

                }else{

                    oddCount++;
                }

            }
            System.out.println("Even marks:"+evenCount);
            System.out.println("Odd count is :"+oddCount);

            System.out.println();       // Add space 
    
            System.out.println("Enter the key to search:");    
            int key=sc.nextInt();
                                         // searching marks
            boolean isFound=false;
            for(int i=0;i<n;i++){     // linear searching

                if(marks[i]==key){

                    isFound=true;
                    break;
                }
                
            }
            if(isFound){

                    System.out.println("Mark found");

                }else{

                        System.out.println("Mark Not  found");

                }
                System.out.println();

                                            // Marks Sort
            for (int i=0;i<n-1;i++){       // Bubble sort   //As every element at last get fix so n-1

                for(int j=0;j<n-i-1;j++){

                    if(marks[j]>marks[j+1]){

                        int temp =marks[j];
                        marks[j]=marks[j+1];
                        marks[j+1]=temp ;
                    }    
                }
                  
            }
            System.out.println("Sorted Marks are:");
            for(int i=0;i<n;i++){

                System.out.print(marks[i]+" ");
            }

            System.out.println();


            System.out.println("Reverse marks are:");   // reverse array
            for (int i=n-1;i>=0;i--){

                System.out.print(marks[i]+" ");

            }
            

        sc.close();
    }
}
