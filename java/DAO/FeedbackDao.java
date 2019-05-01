/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*; /*1.import thhe packages*/
import java.sql.DriverManager;

/**
 *
 * @author Adit Jana
 */
public class FeedbackDao {
    
        String sql =" insert into response.contact values('name','email','service','subject')";
        String url ="jdbc:mysql://localhost:3306/response";
        String username="root";
        String pass = "";
        
    public boolean Insert(String name, String email, String service, String subject)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,pass);
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,name);
            st.setString(2,email);
            st.setString(3,service);
            st.setString(4,subject);
            
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                return true;
            }
        
        }
        
        catch(ClassNotFoundException | SQLException e){
            
        }
        
        return false;
    }
    
}
