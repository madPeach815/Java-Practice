public class Person implements Comparable<Person> {

	//If you want to Comparable<Object> unlikely String or int, you must
	//define compareTo() method. 
	
	private String name, idNum;
	private boolean fullTime;
	
	
	//Constructor for Person Class
	public Person(String name, String idNum, boolean fullTime) {
		this.name = name;
		this.idNum = idNum;
		this.fullTime = fullTime;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIdNum() {
		return idNum;
	}
	
	public boolean isFullTime() {
		return fullTime;
	}
	
	public void updateName(String name) {
		this.name = name;
	}
	
	public void changeFTStatus(boolean fullTime) {
		this.fullTime = fullTime;
	}
	
	@Override
	public String toString() {
		return "[" + name + ", id: " + idNum + "]";
	}
	
	// The equals method so that two Person objects with the same idNum return true.
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} //this and obj has same address means they are same. 
		if(obj == null || this.getClass() != obj.getClass()) {
			return false;
		} //If obj is null or they are not in the same class, they are not equal.
		
		Person p = (Person) obj;
		// if it gets here, that means obj is not null and this and obj are in the same class.
		
		return this.idNum.equals(p.idNum);
	}
	
	//The compareTo method will compare the idNum and return the difference.
	public int compareTo(Person other) {
		//idNum is String.
		return this.idNum.compareTo(other.idNum);
	}
	
}
