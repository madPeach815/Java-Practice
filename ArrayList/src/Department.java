import java.util.ArrayList;

public class Department {
	private String department;
	private ArrayList<Person> employees;

	public Department(String department) {
		this.department = department;
		this.employees = new ArrayList<Person>();
	}

	/*
	 * If the parameter is null, throw an appropriate exception. Adds the Person
	 * parameter to the Department class employees ArrayList
	 */
	public void addPerson(Person p) {
		if (p == null) {
			throw new IllegalArgumentException("p cannot be null");
		}
		this.employees.add(p);
	}

	/*
	 * If the parameter is null, throw an appropriate exception. Returns the index
	 * where the Person object is located in the employees ArrayList, returns -1 if
	 * it is not located in the ArrayList.
	 */
	public int findPerson(Person p) {
		if (p == null) {
			throw new IllegalArgumentException("p cannot be null");
		}

		/*
		 * this code is what I did at first. for(int i = 0; i < employees.size(); i++) {
		 * if(employees.get(i).equals(p)) { return i; } } return -1;
		 */

		return employees.indexOf(p);
		// this indexOf() method do exactly same as what I wrote first. but simpler and
		// it will return -1 when it couldn't find person.
	}

	/*
	 * If the parameter is null or empty, throw an appropriate exception. Searches
	 * the employees ArrayList for the Person with an idNum equal to the idNum
	 * passed in as an argument. If a Person is found, return the reference to the
	 * Person, otherwise return null. (Notice that findPerson is an overloaded
	 * method!!)
	 */
	public Person findPerson(String idNum) {
		if (idNum == null || idNum.isBlank()) {
			throw new IllegalArgumentException("idNum cannot be null");
		}
		/*
		 * first time I code this way. for (int i = 0; i < employees.size(); i++) { if
		 * (employees.get(i).getIdNum().equals(idNum)) { return employees.get(i); } }
		 */

		for (Person person : employees) {
			if (person.getIdNum().equals(idNum)) {
				return person;
			}
		}

		return null;
	}

	/*
	 * If the parameter is null or empty, throw an appropriate exception. Replace
	 * the Person in the employees ArrayList with the Person object passed in as the
	 * argument and return true. (Use the findPerson() method to get the index!) If
	 * the Person was not found in the ArrayList, throw an appropriate exception.
	 */
	public boolean updatePerson(Person p) {
		if (p == null) {
			throw new IllegalArgumentException("NoNo");
		}
		if (p.getIdNum() == null || p.getIdNum().isBlank() || p.getName() == null || p.getName().isBlank()) {
			throw new IllegalArgumentException("ohNo");
		}
		int index = this.findPerson(p);
		if (index >= 0) {
			employees.set(index, p);
			return true;
		} else {
			throw new IllegalArgumentException("Person is not exist");
		}
	}

	/*
	 * Traverse the employees ArrayList and concatenate to a String those Person
	 * objects who are full time employees. (called isFullTime() returns true.)
	 */
	public String getFullTime() {
		/*
		 * my first code
		 * 
		 * String fulltimeS = "";
		 * 
		 * for (Person p : employees) { if (p.isFullTime()) { fulltimeS += p.toString();
		 * } }
		 */

		StringBuffer fulltimeS = new StringBuffer();

		for (Person p : employees) {
			if (p.isFullTime()) {
				fulltimeS.append(p.toString()).append("\n");
			}
		}
		return fulltimeS.toString();
	}
}
