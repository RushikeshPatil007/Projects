package placement_activity_system;

public class Student {

	int rollNumber;
	String name;
	String email;
	String resume;
	String company;
	String jobProfile;
	boolean Placed;
	String contactDetails;
	

	

	public Student(int rollNumber, String name, String email, String resume, String company, String jobProfile,
			boolean placed, String contactDetails) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.email = email;
		this.resume = resume;
		this.company = company;
		this.jobProfile = jobProfile;
		Placed = placed;
		this.contactDetails = contactDetails;
	}

	// Getters and Setters

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}
	
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJobProfile() {
		return jobProfile;
	}

	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}

	public boolean isPlaced() {
		return Placed;
	}

	public void setPlaced(boolean placed) {
		Placed = placed;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", email=" + email + ", resume=" + resume
				+ ", company=" + company + ", jobProfile=" + jobProfile + ", Placed=" + Placed + ", contactDetails="
				+ contactDetails + "]";
	}

	

}
