/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datacnn;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
/**
 *
 * @author Thang
 */

 public class DatabaseConnection {

   

    /**
     * @param args the command line arguments
     */
    

   

        Connection cn = null;//cn là đối tượng thực hiện kết nối

        public DatabaseConnection() {
            String url = "jdbc:mysql://localhost/nv";//đường dẫn đến csdl
            try {
                this.cn = DriverManager.getConnection(url, "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        public ResultSet getData(String tbname) {
            ResultSet kq = null;
            Statement st = null;
            String sql = "select * from nhanvien";

            try {
                st = this.cn.createStatement();
                kq = st.executeQuery(sql);
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            return kq;
        }

        public void indl(String tablename) throws SQLException {
            DatabaseConnection con = new DatabaseConnection();
            ResultSet rs = null;
            rs = con.getData(tablename);
            while (rs.next()) //khi chưa hết các dòng trong bảng 
            {
                System.out.println("ID: " + rs.getString(1) + " Tên: " + rs.getString(2));
                System.out.println("================================");
            }

        }
        public void insert(int id,String ten)
        {
        String sql= "insert into nhanvien values("+id+",'"+ten+"')";
            try {
                Statement st=this.cn.createStatement();
                st.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        public void DongDL(String nv) throws SQLException
        {
        Statement st=this.cn.createStatement();
        st.close();
        }
        public void Delete(int id) throws SQLException
        {
        DatabaseConnection cn= new DatabaseConnection();
        Statement st=this.cn.createStatement();//tạo tình huống
        String sql="delete from nhanvien where id= '"+id+"'";
        st.executeUpdate(sql);
        }
        
           
    
        public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        // TODO code application logic here
        DatabaseConnection test = new DatabaseConnection();
        test.indl("nhanvien");
       test.insert(6,"Fuck this shit ");
        System.out.println("in lại bảng sau khi chèn thêm ");
        test.indl("nhanvien");
        
        
        
    }
}