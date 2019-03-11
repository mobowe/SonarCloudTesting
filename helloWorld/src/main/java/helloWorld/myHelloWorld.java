package helloWorld;

import javax.swing.JFrame;

public class myHelloWorld {

	public static int main(String[] args) {
		 
		JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setTitle("Hello world");
        frame.setVisible(true);
        
        return 0;
	}
	
	private boolean method1() {
		
        String blockCount = String.valueOf((int)Math.ceil(237 + 1)/10) ;

		return true;
	}

}
