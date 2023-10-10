package SimplePrograms;

public class medicalStudent implements Student {
	
	public medicalStudent() {
		System.out.println("Inside Medical Student Constructor");
	}

	@Override
	public void admissionProcess() {
		System.out.println("Inside Admission Process method");		
	}

	@Override
	public void medicalCheckup() {
		System.out.println("Inside Medical Checkup method");				
	}

	@Override
	public void hostelCheckin() {
		System.out.println("Inside Hostel Checkin method");
		System.out.println("");
	}
	
	public void medicalDress() {
	System.out.println("Inside Medical Dress method");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new medicalStudent();
		s.admissionProcess();
		s.medicalCheckup();
		s.hostelCheckin();
		
		medicalStudent ms = new medicalStudent();
		ms.medicalDress();
		
		
		
		
	}

	}
