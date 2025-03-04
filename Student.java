// Student.java - Defines the Student class
class Student {
    private String name;
    private String prn;
    private String dept;
    private String batch;
    private double cgpa;

    // Constructor
    public Student(String name, String prn, String dept, String batch, double cgpa) {
        this.name = name;
        this.prn = prn;
        this.dept = dept;
        this.batch = batch;
        this.cgpa = cgpa;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPrn() { return prn; }
    public void setPrn(String prn) { this.prn = prn; }
    
    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    public String getBatch() { return batch; }
    public void setBatch(String batch) { this.batch = batch; }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }

    public void display() {
        System.out.println("Name: " + name + " PRN: " + prn + " Dept: " + dept + " Batch: " + batch + " CGPA: " + cgpa);
    }
}
