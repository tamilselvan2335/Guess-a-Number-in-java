package pro;
import java.util.Random;
import java.util.Scanner;

public class Guess_Number {
	
  public static void main(String[]args)
  {
	  Guess_Number gn=new Guess_Number();
	  
	  int []a=gn.random();	  
	  gn.guess_num(a);
	  
	 
  }

 private int[] random() {
	    Random rand = new Random();
	    Scanner input = new Scanner(System.in);
	    int random_number=(int) (Math.random()*(10000)); 	    
	    int[] ran=new int[4];
	    int n=random_number;
	     for(int i=0;n>0;i++) {
	    	 int result=n%10; 	   
	    	 ran[i]=ran[i]+result;	    	 
	    	 n=n/10;	 	  
	     }	     
		  
	     for(int i=1;i<=ran.length;i++) {//i=1
	    	 
	    	 for(int j=0;j<ran.length-i;j++) {//ran.length-i=2
	    		 if(ran[i-1]==ran[i+j]) {    			 
	    		 random(); 
  	    	 }	    		 
	     }
	     }
	    return ran;
	 }

  private void guess_num(int [] a) {
     Scanner sc = new Scanner(System.in);
         
    String[]store=new String[4];
    int[]input=new int[4];
    while(true) {
    System.out.println("Enter 4 digit number:");
    int[] count= {0,1,2,3};//1,0
    input[0]=sc.nextInt();
    input[1]=sc.nextInt();
    input[2]=sc.nextInt();
    input[3]=sc.nextInt();
    
    for(int i=0;i<input.length;i++){
    	
    {//case 1:
  	  
  if(a[count[0]]==input[i]) {store[i]="C";}
  else if(a[count[1]]==input[i]) {store[i]="P";}
  else if(a[count[2]]==input[i]) {store[i]="P";}
  else if(a[count[3]]==input[i]) {store[i]="P";}
  else{store[i]="X";}
    }
    if(i<3) {
   
    count[0]=count[0]+1;
    count[i+1]=count[i+1]-1;}
   
    }
    
 System.out.println(input[0]+" " +" "+input[1]+" " +" "+input[2]+" " +" "+input[3]);
 
  for(int i=0;i<store.length;i++) {
     System.out.print(store[i]+"  ");                 

  }
  System.out.println();
    if(a[0]==input[0]&&a[1]==input[1]&&a[2]==input[2]&&a[3]==input[3]) {
     System.out.println(); 
    System.out.println("you guess is correct");
       break;
    }
  
    } 
	
}
  }

/*
 OUTPUT:
 
 Enter 4 digit number:
1
2
3
4
1  2  3  4
X  X  X  P  
Enter 4 digit number:
4
5
6
7
4  5  6  7
P  X  P  P  
Enter 4 digit number:
8
4
7
6
8  4  7  6
P  P  P  P  
Enter 4 digit number:
6
8
4
7
6  8  4  7
P  P  C  P  
Enter 4 digit number:
7
6
4
8
7  6  4  8
C  C  C  C  

you guess is correct

*/