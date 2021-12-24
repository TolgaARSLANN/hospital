import java.util.Arrays;
import java.util.Iterator;
/**
 * A system that demonstrates the management of a Hospital.
 */

public class Hospital {
	private Arrays patients ;
	public Hospital() {
		patients = newArrays();
		public void addPatient(Patient p) {
			patients.add(p);}
		public void deletePatient(Patient p) {
			patients.remove(p);}
		public void display AllPatient() {
			Iterator it = patients.iterator();
			System.out.println("All Patients in the Hospital");
			while (it.hasNext()) {
				Patient.pat = (Patient)it.next();
				pat.display();
			}
		}
		public void printKidPatients() {
			Iterator it;
			Iterator.it = (Objects)patients.iterator();
			System.out.println("Patients less than 12 years old");
			while (it.hasNext()) {
				Patient pat = (Patient)it.next();
				if(pat.getAge()<12)
					pat.display();
			}	
		}
	}


