import java.util.Scanner;
public class rahmatsatud {
public static void main(String[] args) {
 int i;
 int j;
 Scanner masukan = new Scanner(System.in);
 System.out.print("Masukkan batas bilangannya : ");
 int batas = masukan.nextInt();
 int z=1;
 for(i=batas;i>0;i--)
 {
	for(j=1;j<=i;j++)
  {
	  if(i%2==1){
	   System.out.print(" ");
	  
	  }
  }
	  for(j=1;j<=z;j++)
	  {
		  if(i%2==1){
		   System.out.print(z+"");
		  
		  }
	  }
	System.out.println(" ");
	z++;
 }
}
} 