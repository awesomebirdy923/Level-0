
public class For_Loop_Gauntlet {

	public static void main(String[] args) {
		int age = 0;
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		for (int i = 0; i < 100; i++) {
			if(i%2 == 0){
				System.out.println(i);
			}
		}
		for (int i = 1; i < 100; i++) {
			if(i%2 == 1){
				System.out.println(i);
			}
		}
		for (int i = 1; i < 501; i++) {
			if(i%2 == 1){
				System.out.println(i + " " + "odd");
			}
			else{
				System.out.println(i + " " + "even");
			}
		}
		for (int i = 7; i < 778; i+=7) {
			System.out.println(i);
		}
		for (int i = 2004; i < 2017; i++) {
			System.out.println ("In "+i+" i was "+age+" years old");
			age++;
		}for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i+" "+j);
			}
		}
		for (int i = 1; i < 10; i++) {
			System.out.print(i);
			if(i%3 == 0){
				System.out.println();
			}
			}
		for (int i = 0; i < 101; i++) {
			System.out.print(i + " ");
			if(i%10 == 0){
				System.out.println();
			}
		}
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");				
			}
			System.out.println(" ");
		}
	}
	
}
