package productandbuilder;

public class Student {
	private String id;
    private String firstName;
    private String lastName;
    private String dayOfBirth;
    private String currentClass;
    private String phone;
    
	public Student(StudentBuilder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.dayOfBirth = builder.dayOfBirth;
		this.currentClass = builder.currentClass;
		this.phone = builder.phone;
	}
    
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dayOfBirth="
				+ dayOfBirth + ", currentClass=" + currentClass + ", phone=" + phone + "]";
	}



	public static class StudentBuilder{
		private String id;
	    private String firstName;
	    private String lastName;
	    private String dayOfBirth;
	    private String currentClass;
	    private String phone;
	    
		public StudentBuilder setId(String id) {
			this.id = id;
			return this;
		}

		public StudentBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public StudentBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public StudentBuilder setDayOfBirth(String dayOfBirth) {
			this.dayOfBirth = dayOfBirth;
			return this;
		}

		public StudentBuilder setCurrentClass(String currentClass) {
			this.currentClass = currentClass;
			return this;
		}

		public StudentBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}
    
}
