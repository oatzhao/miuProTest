package Lecture11.prob1;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != Key.class) return false;
		Key key = (Key)ob;
		return key.firstName.equals(firstName) && key.lastName.equals(lastName);
	}

	@Override
	public int hashCode(){
		int result = 17;
		int hashFirst = firstName.hashCode();
		int hashSecond = lastName.hashCode();
		result += 31 * result + hashFirst;
		result += 31 * result + hashSecond;
		return result;
	}
}
