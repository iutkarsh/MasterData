package master.data;

/**
 *
 * @author Utkarsh
 */
public class HolderTeacher {
    private String s1, s2, s3, s4, s5, p1, p2, p3, f1, f2, f3, f4, f5;
    private int sem;
    
    public HolderTeacher(){}

    public HolderTeacher(int sem, String s1, String s2, String s3, String s4, String s5, String p1, String p2, String p3, String f1, String f2, String f3, String f4, String f5) {
        this.setSem(sem);
        this.setS1(s1);
        this.setS2(s2);
        this.setS3(s3);
        this.setS4(s4);
        this.setS5(s5);
        this.setP1(p1);
        this.setP2(p2);
        this.setP3(p3);
        this.setF1(f1);
        this.setF2(f2);
        this.setF3(f3);
        this.setF4(f4);
        this.setF5(f5);
    }


//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }
    
    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public String getS4() {
        return s4;
    }

    public void setS4(String s4) {
        this.s4 = s4;
    }

    public String getS5() {
        return s5;
    }

    public void setS5(String s5) {
        this.s5 = s5;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2;
    }

    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        this.f3 = f3;
    }

    public String getF4() {
        return f4;
    }

    public void setF4(String f4) {
        this.f4 = f4;
    }

    public String getF5() {
        return f5;
    }

    public void setF5(String f5) {
        this.f5 = f5;
    }
    
//</editor-fold>
    
}
