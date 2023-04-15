package fileRW;

public class attribute { // clase persona
	 private String name;	// atributo
	 
	// getter
	 public String getName() {
		 return name;
	 }
	 
	 // setter
	 public void setName(String newName) {
		 this.name = newName;
	 }

	public static void main(String[] args) {
		attribute mipersona = new attribute();
		mipersona.name = "John Doe";
		System.out.println(mipersona.name);
	}

}