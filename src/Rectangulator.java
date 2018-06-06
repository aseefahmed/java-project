public class Rectangulator {
	 public static void main(String[] args){
	 	int length = Integer.parseInt(args[0]);
	 	int width = Integer.parseInt(args[1]);

	 	Rectangle myRectangle = new Rectangle(length, width)

	 	String output = String.format("*** Your Rectangble ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getParimeter());

	 	System.out.println(output);
	 }
}