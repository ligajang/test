package add;
import java.util.Scanner;

public class number {
	public static void main(String[] args) {
		int i,num[];
		float score [];
		
		score = new float [10];
		num = new int [6];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����������0-100����");
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
	    
	    System.out.println("����ĳɼ�Ϊ100�У�"+num[0]+"��");
	    System.out.println("����ĳɼ�Ϊ90-99�У�"+num[1]+"��");
	    System.out.println("����ĳɼ�Ϊ80-89�У�"+num[2]+"��");
	    System.out.println("����ĳɼ�Ϊ70-79�У�"+num[3]+"��");
	    System.out.println("����ĳɼ�Ϊ60-69�У�"+num[4]+"��");
	    System.out.println("����ĳɼ�С��60�У�"+num[5]+"��");
	
	}
}



