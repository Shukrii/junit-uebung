package daten;
import java.util.Date;

public class Student extends Person implements Comparable<Student> {

	public Student(String firstName, String lastName) {
		this(firstName, lastName, false);
	}

	public Student(String firstName, String lastName, boolean selfEntitled) {
		super(firstName, lastName);
		setSelfEntitled(selfEntitled);
	}
	
	public Student(String firstName, String lastName, boolean selfEntitled, Date birthdate) {
        super(firstName, lastName);
        setSelfEntitled(selfEntitled);
        setBirthDate(birthdate);
	}


	private boolean selfEntitled;
	private Date birthDate; // TODO add getter,setter,Constructors
	
	public boolean isSelfEntitled(){
        return selfEntitled;
	}

	public void setSelfEntitled(boolean selfEntitled) {
		this.selfEntitled = selfEntitled;
	}

	
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
	}
	
	
	@Override
	public int compareTo(Student o) {
		int result = 0;

		// TODO implement meaningful unit tests
		if ((result = getLastName().compareTo(o.getLastName())) == 0) {
			if ((result = getFirstName().compareTo(o.getFirstName())) == 0) {
				result = birthDate.compareTo(o.birthDate); // TODO change to
															// getter after
															// implementation
			}
		}
		return result;
	}

	@Override
	public String toString() {
		// TODO missing implementation
		return super.toString() + String.format("{IsSelfEntitled=%s, birthDate=%s}", isSelfEntitled(), getBirthDate());
	}
}
