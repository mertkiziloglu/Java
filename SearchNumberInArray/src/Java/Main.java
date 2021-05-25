package Java;

public class Main {

    public static void main(String[] args) {
	int [] numbers= new int[]{1,2,4,5,6,3,7,8,9};
	int search=55;
	boolean have=false;

	for (int number:numbers){
	    if (number==search){
	        have=true;
	        break;
        }
    }
	if (have){
        System.out.println("Yes I have a number");
    }
	else {
        System.out.println("No I dont have a number.");
    }
    }
}
