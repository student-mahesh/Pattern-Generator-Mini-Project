
import java.util.Scanner;

public class TextAnalyzerSystem {
    public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the String:");
String text=sc.nextLine();

System.out.println("Original Text is :"+text);

String lowertext=text.toLowerCase();  			// lowercase  is done in another variable 

int vowel=0;       // vowel and consonant
int consonant=0;

for(int i=0;i<text.length();i++){

    char ch =lowertext.charAt(i);

    if(ch>='a'  && ch<='z'){

        if(ch=='a' || ch=='e' || ch=='i'  ||ch=='o' ||ch=='u'){

            vowel++;

        }else{

        consonant++;
    }
    }
}
    System.out.println("vowel count : "+vowel);
    System.out.println("consonant count: "+consonant);
    System.out.println();


    String reverse="";     // reverse          
    for(int i=text.length()-1;i>=0;i--){

        reverse= reverse + text.charAt(i);

    }
    System.out.println("reverse String is "+reverse);
    System.out.println();

    String cleanText= lowertext.replace(" ","");  
                                                       							 // as while palindrone the string get fail in between space occur
    int start=0;
    int end=cleanText.length()-1;
    boolean isPalindrome=true;

    while(start<end){

        if(cleanText.charAt(start)!=cleanText.charAt(end)){

            isPalindrome=false;
            break;

        }
        start++;
        end--;
    }
        if(isPalindrome){

            System.out.println("String is Palindrome");

        }else{

            System.out.println("String is not Palindrome");
            
        }
        System.out.println();
    
    
    boolean[] isVisited=new boolean[cleanText.length()];  				// frequency of the character
    
    for(int i =0;i<cleanText.length();i++){

            if(isVisited[i]==true){  
                continue;

            }
            int count=1;                       // current character itself already apppearsonce 

            for(int j=i+1;j<cleanText.length();j++){

                if(cleanText.charAt(i)==cleanText.charAt(j)){

                        count++;
                        
                        isVisited[j]=true;
                }

            }  
        System.out.println("Frequency of Char is:"+cleanText.charAt(i)+"="+count);
    }
  System.out.println();

    System.out.println("Enter the another string:");     ///Compare string
    String text2=sc.nextLine();

    if(text.equals(text2)){

        System.out.println("Both String are equal");
    }else{

        System.out.println("Both are not Equal");

    }
    System.out.println();

    System.out.println("Upper case of String is");    //Upper case 
    System.out.println(text.toUpperCase());


    System.out.println("Lower case of String is");   // lower case
    System.out.println(text.toLowerCase());


    sc.close();
    }
    
}
