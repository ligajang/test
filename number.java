package add;
import java.util.Scanner;

public class number {
	public static void main(String[] args) {
		int i,num[];
		float score [];
		
		score = new float [10];
		num = new int [6];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入分数（0-100）：");
		for(i=0;i<5;i++) { 
			score [i] = scanner.nextFloat();
			if (score [i] == 100) num[0]++;
			if (score [i]>=90 && score [i]<=99) num[1]++;
			if (score [i]>=80 && score [i]<=89) num[2]++;
			if (score [i]>=70 && score [i]<=79) num[3]++;
			if (score [i]>=60 && score [i]<=69) num[4]++;
			if (score [i]<60) num[5]++;
	}
	    scanner.close();
	    
	    System.out.println("输入的成绩为100有："+num[0]+"个");
	    System.out.println("输入的成绩为90-99有："+num[1]+"个");
	    System.out.println("输入的成绩为80-89有："+num[2]+"个");
	    System.out.println("输入的成绩为70-79有："+num[3]+"个");
	    System.out.println("输入的成绩为60-69有："+num[4]+"个");
	    System.out.println("输入的成绩小于60有："+num[5]+"个");
	
	}
}



