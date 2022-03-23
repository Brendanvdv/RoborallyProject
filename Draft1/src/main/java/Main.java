package amirrobot;

public class Main {
    public static void main(String[] args) {
	Board b = new Board(5,7);
	Robot r = new Robot(b); // init robot and test tileFront
	b.makeBoard();
	b.printBoard();

	//		System.out.println(b.getTileUnder(r.getRoboty(), r.getRobotx())); // test for tile under


//	r.setRobotx(0);
//	r.setRoboty(1);
//	r.setDir(2);
	System.out.println("Direction: " + r.getDir() + " Col: " + r.getRobotx() + " Row: " + r.getRoboty());

	System.out.println("The tile under is: " + r.getTileUnder(b));

	System.out.println("The tile in front is: " + r.getTileFront(b));

	r.valid_move(b,10);
	System.out.println("The tile under is: " + r.getTileUnder(b)); // test for tile under

	r.rotate(1);
	System.out.println("The tile in front is: " + r.getTileFront(b));

	

    }


}
