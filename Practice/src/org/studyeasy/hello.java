package org.studyeasy;

import org.studyeasy.laptop.Laptop;
import org.studyeasy.laptop.components.GraphicsCard;
import org.studyeasy.laptop.components.Processor;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Laptop lappy = new Laptop();
//		System.out.println(lappy.getProcessor().getBrand());
//		
		
		Processor processor = new Processor("Intel", "7200u", "7th", "4 cores", "8 threads", "3 MB", "2.5 GHz", "2.5 GHz", "5 GHz");
		
		GraphicsCard graphicscard = new GraphicsCard("Nvidia", 940 , "2 gb");
				
		Laptop gamingLaptop = new Laptop(15.6F, processor, "DDR 4", "2 TB", graphicscard, "SSD", "Multimedia");
		
		System.out.println(gamingLaptop);
	}

}
