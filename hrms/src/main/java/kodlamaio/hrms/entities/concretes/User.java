package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Sen artık bir entitiy sin
@Table(name = "hrms") // veri tababında hangi tabloya karşılık geliyorsa, o yazılır
public class User {

	@Id // tablo işlemlerini bu id ye göre yapar
	@GeneratedValue // id nin ne şekilde çalışacağını ayarlar, artış miktarını birer birer şeklinde
					// belirler
	@Column(name = "Users") // veri tababında hangi columna kaşılık geliyorsa, o yazılır
	private String users;

	@Column(name = "SystemPersonnels")
	private String systemPersonnels;

	@Column(name = "Employers")
	private String employers;

	@Column(name = "Jobseekers")
	private String jobseekers;

	@Column(name = "LeadingEMail")
	private int leadingEMail;

	@Column(name = "NationalityIdAvailability")
	private boolean nationalityIdAvailability;

	@Column(name = "EmployerEMailAvailability")
	private boolean employerEMailAvailability;

	@Column(name = "JobseekerEMailAvailability")
	private boolean jobseekerEMailAvailability;

	@Column(name = "CompanyNameConroller")
	private boolean companyNameConroller;

	@Column(name = "DateOfBirthController")
	private boolean dateOfBirthController;

	@Column(name = "EmployerEMailController")
	private boolean employerEMailController;

	@Column(name = "FirstNameController")
	private boolean firstNameController;

	@Column(name = "JobseekerEMailController")
	private boolean jobseekerEMailController;

	@Column(name = "LastNameController")
	private boolean lastNameController;

	@Column(name = "NationalityIdController")
	private boolean nationalityIdController;

	@Column(name = "PasswordAgainController")
	private boolean passwordAgainController;

	@Column(name = "PasswordController")
	private boolean passwordController;

	@Column(name = "PhoneNumberController")
	private boolean phoneNumberController;

	@Column(name = "SystemPersonnelController")
	private boolean systemPersonnelController;

	@Column(name = "WebsiteController")
	private boolean websiteController;

	@Column(name = "MernisVerification")
	private boolean mernisVerification;

	@Column(name = "JobseekerEMailVerification")
	private boolean jobseekerEMailVerification;

	@Column(name = "HRMSVerification")
	private boolean hrmsVerification;

	@Column(name = "EmployerEMailVerification")
	private boolean employerEMailVerification;

	public User() {}
	
	public User(String users, String systemPersonnels, String employers, String jobseekers, int leadingEMail,
			boolean nationalityIdAvailability, boolean employerEMailAvailability, boolean jobseekerEMailAvailability,
			boolean companyNameConroller, boolean dateOfBirthController, boolean employerEMailController,
			boolean firstNameController, boolean jobseekerEMailController, boolean lastNameController,
			boolean nationalityIdController, boolean passwordAgainController, boolean passwordController,
			boolean phoneNumberController, boolean systemPersonnelController, boolean websiteController,
			boolean mernisVerification, boolean jobseekerEMailVerification, boolean hrmsVerification,
			boolean employerEMailVerification) {

		this.users = users;
		this.systemPersonnels = systemPersonnels;
		this.employers = employers;
		this.jobseekers = jobseekers;
		this.leadingEMail = leadingEMail;
		this.nationalityIdAvailability = nationalityIdAvailability;
		this.employerEMailAvailability = employerEMailAvailability;
		this.jobseekerEMailAvailability = jobseekerEMailAvailability;
		this.companyNameConroller = companyNameConroller;
		this.dateOfBirthController = dateOfBirthController;
		this.employerEMailController = employerEMailController;
		this.firstNameController = firstNameController;
		this.jobseekerEMailController = jobseekerEMailController;
		this.lastNameController = lastNameController;
		this.nationalityIdController = nationalityIdController;
		this.passwordAgainController = passwordAgainController;
		this.passwordController = passwordController;
		this.phoneNumberController = phoneNumberController;
		this.systemPersonnelController = systemPersonnelController;
		this.websiteController = websiteController;
		this.mernisVerification = mernisVerification;
		this.jobseekerEMailVerification = jobseekerEMailVerification;
		this.hrmsVerification = hrmsVerification;
		this.employerEMailVerification = employerEMailVerification;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public String getSystemPersonnels() {
		return systemPersonnels;
	}

	public void setSystemPersonnels(String systemPersonnels) {
		this.systemPersonnels = systemPersonnels;
	}

	public String getEmployers() {
		return employers;
	}

	public void setEmployers(String employers) {
		this.employers = employers;
	}

	public String getJobseekers() {
		return jobseekers;
	}

	public void setJobseekers(String jobseekers) {
		this.jobseekers = jobseekers;
	}

	public int getLeadingEMail() {
		return leadingEMail;
	}

	public void setLeadingEMail(int leadingEMail) {
		this.leadingEMail = leadingEMail;
	}

	public boolean isNationalityIdAvailability() {
		return nationalityIdAvailability;
	}

	public void setNationalityIdAvailability(boolean nationalityIdAvailability) {
		this.nationalityIdAvailability = nationalityIdAvailability;
	}

	public boolean isEmployerEMailAvailability() {
		return employerEMailAvailability;
	}

	public void setEmployerEMailAvailability(boolean employerEMailAvailability) {
		this.employerEMailAvailability = employerEMailAvailability;
	}

	public boolean isJobseekerEMailAvailability() {
		return jobseekerEMailAvailability;
	}

	public void setJobseekerEMailAvailability(boolean jobseekerEMailAvailability) {
		this.jobseekerEMailAvailability = jobseekerEMailAvailability;
	}

	public boolean isCompanyNameConroller() {
		return companyNameConroller;
	}

	public void setCompanyNameConroller(boolean companyNameConroller) {
		this.companyNameConroller = companyNameConroller;
	}

	public boolean isDateOfBirthController() {
		return dateOfBirthController;
	}

	public void setDateOfBirthController(boolean dateOfBirthController) {
		this.dateOfBirthController = dateOfBirthController;
	}

	public boolean isEmployerEMailController() {
		return employerEMailController;
	}

	public void setEmployerEMailController(boolean employerEMailController) {
		this.employerEMailController = employerEMailController;
	}

	public boolean isFirstNameController() {
		return firstNameController;
	}

	public void setFirstNameController(boolean firstNameController) {
		this.firstNameController = firstNameController;
	}

	public boolean isJobseekerEMailController() {
		return jobseekerEMailController;
	}

	public void setJobseekerEMailController(boolean jobseekerEMailController) {
		this.jobseekerEMailController = jobseekerEMailController;
	}

	public boolean isLastNameController() {
		return lastNameController;
	}

	public void setLastNameController(boolean lastNameController) {
		this.lastNameController = lastNameController;
	}

	public boolean isNationalityIdController() {
		return nationalityIdController;
	}

	public void setNationalityIdController(boolean nationalityIdController) {
		this.nationalityIdController = nationalityIdController;
	}

	public boolean isPasswordAgainController() {
		return passwordAgainController;
	}

	public void setPasswordAgainController(boolean passwordAgainController) {
		this.passwordAgainController = passwordAgainController;
	}

	public boolean isPasswordController() {
		return passwordController;
	}

	public void setPasswordController(boolean passwordController) {
		this.passwordController = passwordController;
	}

	public boolean isPhoneNumberController() {
		return phoneNumberController;
	}

	public void setPhoneNumberController(boolean phoneNumberController) {
		this.phoneNumberController = phoneNumberController;
	}

	public boolean isSystemPersonnelController() {
		return systemPersonnelController;
	}

	public void setSystemPersonnelController(boolean systemPersonnelController) {
		this.systemPersonnelController = systemPersonnelController;
	}

	public boolean isWebsiteController() {
		return websiteController;
	}

	public void setWebsiteController(boolean websiteController) {
		this.websiteController = websiteController;
	}

	public boolean isMernisVerification() {
		return mernisVerification;
	}

	public void setMernisVerification(boolean mernisVerification) {
		this.mernisVerification = mernisVerification;
	}

	public boolean isJobseekerEMailVerification() {
		return jobseekerEMailVerification;
	}

	public void setJobseekerEMailVerification(boolean jobseekerEMailVerification) {
		this.jobseekerEMailVerification = jobseekerEMailVerification;
	}

	public boolean isHrmsVerification() {
		return hrmsVerification;
	}

	public void setHrmsVerification(boolean hrmsVerification) {
		this.hrmsVerification = hrmsVerification;
	}

	public boolean isEmployerEMailVerification() {
		return employerEMailVerification;
	}

	public void setEmployerEMailVerification(boolean employerEMailVerification) {
		this.employerEMailVerification = employerEMailVerification;
	}

}
