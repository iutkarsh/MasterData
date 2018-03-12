package master.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;


/**
 * 
 * @author Utkarsh
 */
public class DatabaseOperations {
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement ps =null;
    ResultSet res = null;
    ArrayList<Holder> mod = new ArrayList<Holder>();


    DatabaseOperations(){
        try{
            String mysql = "jdbc:mysql://localhost/mysql?autoReconnect=true&useSSL=false";
            String user = "root";
            String pass = "root";
            Class.forName("com.mysql.jdbc.Driver");
           
            conn = DriverManager.getConnection(mysql, user, pass);
            if(conn != null){
                System.out.println("Database connection established!");
                createTables();
            }else{
                System.out.println("Connection could not be established!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
 
    public void createTables(){
        String student = "CREATE TABLE IF NOT EXISTS student("+
                               "No INT AUTO_INCREMENT,"+
                               "Name VARCHAR(50) NOT NULL,"+
                               "Sem  INT NOT NULL,"+
                               "Branch VARCHAR(50),"+
                               "s1 INT,"+
                               "s2 INT,"+
                               "s3 INT,"+
                               "s4 INT,"+
                               "s5 INT,"+
                               "p1 INT,"+
                               "p2 INT,"+
                               "p3 INT,"+
                               "Total INT,"+
                               "Percent FLOAT(4,2),"+
                               "ATKT CHAR(1),"+
                               "SGPA FLOAT(4,2),"+
                               "Result VARCHAR(5),"+
                               "Primary Key (no, name, sem));";
        
        String teacher = "CREATE TABLE IF NOT EXISTS teacher("+
                              "Sem INT NOT NULL,"+
                              "Sub1 VARCHAR(30),"+
                              "Fac1 VARCHAR(30),"+
                              "Sub2 VARCHAR(30),"+
                              "Fac2 VARCHAR(30),"+
                              "Sub3 VARCHAR(30),"+
                              "Fac3 VARCHAR(30),"+
                              "Sub4 VARCHAR(30),"+
                              "Fac4 VARCHAR(30),"+
                              "Sub5 VARCHAR(30),"+
                              "Fac5 VARCHAR(30),"+
                              "Prac1 VARCHAR(30),"+
                              "Prac2 VARCHAR(30),"+
                              "Prac3 VARCHAR(30));";
        
        
        try{
            stmt = conn.createStatement();
            stmt.executeUpdate(student);
            System.out.println("Table 1 created");
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        try{
            stmt = conn.createStatement();
            stmt.executeUpdate(teacher);
            System.out.println("Table 2 created");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void addStudentRow(Holder h1) throws SQLException{
        String student = "INSERT INTO student"+
                         "(Name, Sem, Branch, s1, s2, s3, s4, s5, p1, p2, p3, total, percent, atkt, sgpa, result)"+
                         "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
      
        ps = conn.prepareStatement(student);

        ps.setString(1, h1.getName());
        ps.setInt(2, h1.getSem());
        ps.setString(3, h1.getBranch());
        ps.setInt(4, h1.getS1());
        ps.setInt(5, h1.getS2());
        ps.setInt(6, h1.getS3());
        ps.setInt(7, h1.getS4());
        ps.setInt(8, h1.getS5());
        ps.setInt(9, h1.getP1());
        ps.setInt(10, h1.getP2());
        ps.setInt(11, h1.getP3());
        ps.setInt(12, h1.getTotal());
        ps.setDouble(13, Double.valueOf(new DecimalFormat("##.##").format(h1.getPercent())));
        ps.setString(14, h1.getAtkt());
        ps.setDouble(15, h1.getSgpa());
        ps.setString(16, h1.getResult());
        
        ps.execute();
        ps = null;
    }
    
    public void addTeacherRow(HolderTeacher h1) throws SQLException{
        String teacher = "INSERT INTO teacher"+
                         "(Sem, Sub1, Fac1, Sub2, Fac2, Sub3, Fac3, Sub4, Fac4, Sub5, Fac5, Prac1, Prac2, Prac3)"+
                         "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
      
        ps = conn.prepareStatement(teacher);

        ps.setInt(1, h1.getSem());
        ps.setString(2, h1.getS1());
        ps.setString(3, h1.getF1());
        ps.setString(4, h1.getS2());
        ps.setString(5, h1.getF2());
        ps.setString(6, h1.getS3());
        ps.setString(7, h1.getF3());
        ps.setString(8, h1.getS4());
        ps.setString(9, h1.getF4());
        ps.setString(10, h1.getS5());
        ps.setString(11, h1.getF5());
        ps.setString(12, h1.getP1());
        ps.setString(13, h1.getP2());
        ps.setString(14, h1.getP3());
        
        ps.execute();
        ps = null;
    }
    
    public ArrayList<Holder> directQuery(String str){
        ArrayList<Holder> ht = new ArrayList<Holder>();
        
        try {
            ps = conn.prepareStatement(str);
            res = ps.executeQuery();
            res.beforeFirst();
            while(res.next()){
                ht.add(new Holder(res.getInt("No"), res.getInt("Sem"), res.getString("branch"),res.getInt("s1"), res.getInt("s2"), res.getInt("s3"), res.getInt("s4"),
                                         res.getInt("s5"), res.getInt("p1"), res.getInt("p2"),res.getInt("p3"), res.getInt("total"),
                                         res.getString("name"), res.getString("result"), res.getString("aktk"), res.getInt("percent"),
                                         res.getInt("Sgpa")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ht;
    }
}

