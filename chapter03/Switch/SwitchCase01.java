package chapter03.Switch;

public class SwitchCase01 {

	public static void main(String[] args) {

        int ranking=2;
        char medalColor;
        
        switch (ranking) {
		case 1: 
			medalColor='G';
			break;
		case 2:
			medalColor='S';
			//break;
		case 3:
			medalColor='B';
			break;

		default: // 
			medalColor='A';
			break;
			 
		}

        System.out.println(ranking + " " +medalColor+ "");
	}

}
