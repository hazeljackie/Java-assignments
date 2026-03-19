public class HospitalMain {

    public static void main(String[] args) {

        HospitalWard ward = new HospitalWard();

        Patient p1 = new Patient("H1","John",40,"Flu");
        Patient p2 = new Patient("H2","Mary",35,"Malaria");
        Patient p3 = new Patient("H3","Peter",50,"Injury");
        Patient p4 = new Patient("H4","Lucy",28,"Infection");
      
        ward.admitPatient(p1);
        ward.admitPatient(p2);
        ward.admitPatient(p3);

        ward.dischargePatient("H2");
        p3.updateDiagnosis("Recovered");

        System.out.println("Currently Admitted Patients:");
        ward.listAdmittedPatients();
    }
}
