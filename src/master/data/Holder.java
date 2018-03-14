package master.data;

public class Holder {
    private int no, sem, s1, s2, s3, s4, s5, p1, p2, p3, total;
    private String name, result, atkt, branch, examForm;
    private double percent, sgpa;

    
    public Holder(){}
    
    public Holder(int no, int sem, String branch, int s1, int s2, int s3, int s4, int s5, int p1, int p2, int p3, int total, String name, String result, String atkt, double percent, double sgpa, String examForm) {
        this.setNo(no);
        this.setSem(sem);
        this.setBranch(branch);
        this.setS1(s1);
        this.setS2(s2);
        this.setS3(s3);
        this.setS4(s4);
        this.setS5(s5);
        this.setP1(p1);
        this.setP2(p2);
        this.setP3(p3);
        this.setTotal(total);
        this.setName(name);
        this.setResult(result);
        this.setAtkt(atkt);
        this.setPercent(percent);
        this.setSgpa(sgpa);
        this.setExamForm(examForm);
    }

    
//<editor-fold defaultstate="collapsed" desc="Getter and setter">
    
    public String getExamForm() {
        return examForm;
    }

    public void setExamForm(String examForm) {
        this.examForm = examForm;
    }
    
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public int getS4() {
        return s4;
    }

    public void setS4(int s4) {
        this.s4 = s4;
    }

    public int getS5() {
        return s5;
    }

    public void setS5(int s5) {
        this.s5 = s5;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getAtkt() {
        return atkt;
    }

    public void setAtkt(String atkt) {
        this.atkt = atkt;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
    
    public double getSgpa() {
        return sgpa;
    }

    public void setSgpa(double sgpa) {
        this.sgpa = sgpa;
    }
    
//</editor-fold>
}
