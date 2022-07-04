class Emp {
	 private int id;
	 private String name;
	 
	void setName(String name) {
			this.name=name;
	 }
	 
	 String getName() {
		return name;
	 }
	 void setid(int id) {
			this.id=id;
	 }
	 
	 int getid() {
		return id;
	 }
}
class Demo20 {
	public static void main(String args[]) {
		 Emp e = new Emp();
		 e.setid(100);
		 e.setName("Praveen");
		 System.out.print("ID : "+ e.getid() + "Name : "+e.getName());
	}
}