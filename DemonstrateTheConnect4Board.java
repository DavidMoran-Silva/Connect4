

public class DemonstrateTheConnect4Board {
	
	public static void main (String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			
			@Override
			public void run() {
				Connect4GUI gui = new Connect4GUI();
			}
			
		});
	

  }
}
