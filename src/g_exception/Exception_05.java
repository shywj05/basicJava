package g_exception;

import java.sql.SQLException;

public class Exception_05 {
	public static void main(String[] args) {

		Controller.controllerMethod();
		
		
		
		
		
	}
}

class Controller{
	static void controllerMethod(){
		
			Service.serviceMethod();
			
	}
}

class Service{
	static void serviceMethod(){//던질 때는 throws 쓰고 예외종류
		try {
			Dao.daoMethod();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			
		}
	}
	
}

class Dao{
	static void daoMethod() throws SQLException{
		
		throw new SQLException();
		
	}
	
}



