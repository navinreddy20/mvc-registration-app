import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

private String name;
private String email;
private String password;
private String city;
private Connection connection;
private PreparedStatement pstmt;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public int registerInfo(String name, String email, String password, String city) throws SQLException {
 connection=	JdbcUtil.getConnection();
 int rst=0;
if(connection!=null) {
	String query="Insert into personinfo (uname, email, upassword, ucity) value(?,?,?,?)";
	pstmt=connection.prepareStatement(query);
	
	if(pstmt!=null) {
	pstmt.setString(1, name);
	pstmt.setString(2, email);
	pstmt.setString(3, password);
	pstmt.setString(4,city);
	
	rst= pstmt.executeUpdate();
	return rst;
	} 

}
	return rst;
}

}
