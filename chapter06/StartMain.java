package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
        
		
        int select;
        String check;
        //��ü����
        Start st=new Start();
        
        
        
        while (true) {
        	System.out.println("���ڸ� �Է��ϼ��� : ");
        	Scanner scan=new Scanner(System.in);
            select=scan.nextInt();
            check=st.check(select);
        	if(check.equals("SUCCESS"))
        	   break;
        	
			
		}//while
        
        Start obj = new Start();
        int num;
        Scanner s=new Scanner(System.in);
        
        do {
        	System.out.println("���� �Է� : ");
        	num=s.nextInt();
        }while (obj.check(num).equals("FAIL"));
				
        	
        }

	}


