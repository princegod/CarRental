package UserController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.RegisterService;

import com.CarRental.Model.UserModel.Address;
import com.CarRental.Model.UserModel.User;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String date=request.getParameter("date");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String street=request.getParameter("street");
		String city=request.getParameter("city");
        String state=request.getParameter("state");
        String country=request.getParameter("country");
        String pincode=request.getParameter("pin");
        PrintWriter out= response.getWriter();
		Address add=new Address(email,mobile,street,city,state,country,pincode);
		
		User user1=new User();
		user1.setUsername(name);
		user1.setDob(date);
		user1.setGender(gender);
		user1.setPassword(password);
		user1.getListOfAddress().add(add);
		try{
			RegisterService registerService= new RegisterService();
			boolean result =registerService.register(user1);
			
			if(result){
				out.println("<h1>thanks for register</h1>");	
			}else{
				out.println("<h1>failed</h1>");
				
			}
			
			}finally{
			out.close();
			
		}
		
	}

}
