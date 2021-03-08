package week4;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {
	
	public static final int APPLICATION_HEIGHT = 350; //setting window size
	public static final int APPLICATION_WIDTH = 500;//setting window size
	
	public void run() {
		int x = (int)(getWidth() - APPLICATION_WIDTH / 2);
		int y = (int)(getHeight() - APPLICATION_HEIGHT /2);
		
		GImage image = new GImage("image.png"); //Image is saved as image.png on my assignment folder
		add(image, 0, 0); // adding the original image
		add(flipHorizontally(image), 250, 0); //Image will be flip horizontally
	}
	
	
	private GImage flipHorizontally(GImage image) {
		int[][]array = image.getPixelArray();
		int height = array.length;
		int width = array[0].length;
		
		for(int row = 0; row < height; row++) {
			for(int i = 0; i < width /2; i++) {
				int flipped = width - i - 1;
				int temp = array[row][i];
				array[row][i] = array[row][flipped];
				array[row][flipped] = temp;
			}
		}		
		return new GImage(array);
	}	

}
