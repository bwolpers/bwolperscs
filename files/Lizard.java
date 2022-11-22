//Ben Wolpers
public class Lizard {
		 private double length;  
		 private String name;  
		 private String color;  
		 public Lizard(){ 
			 length = 0;
			 name = null;
			 color = null;
		 }
		 public Lizard(double length, String name, String color){  
		 this.length=length;  
		 this.name=name;  
		 this.color=color;  
		 }  
		 public String getName() {
			 return name;	
		 }
		 public String getColor() {
			 return color;
		 }
		 public double getLength() {
			 return length;
		 }
		 public void setColor(String colorGet) {
			 if (colorGet.length() > 0) {
			 this.color = colorGet;
			 }else {
				 this.color = "no color";
			 }
		 }
		 public void setName(String nameGet) {
			 if (nameGet.length() > 0) {
			 this.name = nameGet;
			 }else {
				 this.name = "no name";
			 }
		 }
		 public void setLength(int lengthGet) {
			 if (lengthGet > 0) {
			 this.length = lengthGet;
			 }else {
				 this.length = 0;
			 }
		 }
		
		 public String toString()
		    {
		        return "Lizard Name: " + name + "\nLizard Color: " + color + "\nLizard Length: " + length+ " feet";
		    } 
		
}