package DraftUserStories;

public class Main {
	public static void main(String[] args) {
		Board b = new Board();
		Robot r = new Robot(); // init robot and test tileFront
		b.makeBoard();
		b.printBoard();
		
//		System.out.println(b.getTileUnder(r.getRoboty(), r.getRobotx())); // test for tile under
		

		r.setRobotx(0);
		r.setRoboty(1);
		r.setDirection(2);
		
		System.out.println(b.getTileFront(r.getRobotx(), r.getRoboty(), r.getDirection()));
		
		r.rotate(1);
		System.out.println(b.getTileFront(r.getRobotx(), r.getRoboty(), r.getDirection()));
		
		r.move(4, r.getDirection());
		System.out.println(b.getTileUnder(r.getRoboty(), r.getRobotx())); // test for tile under


	}
	
	
}
