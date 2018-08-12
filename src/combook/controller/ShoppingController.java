package combook.controller;

import java.io.IOException;
import java.util.TreeSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.book.bean.Book;
import com.book.service.BookService;
import com.book.service.BookServiceImpl;

/**
 * @author Sayali Martal
 *
 */
/**
 * Servlet implementation class ShoppingController
 */
@WebServlet("*.app")
public class ShoppingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookService service = new BookServiceImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();  //Store action to be performed
		HttpSession session = request.getSession();
		
		session.setAttribute("cartCount", service.getCartCount());  //Store cart items in session
		session.setAttribute("cartItems", service.viewCart());   //Store cart count in session
		
		switch (action) 
		{
		case "/add.app":
			
			String bookId=request.getParameter("bookId");  //Retrieve book id
			service.addBookToCart(Integer.parseInt(bookId));  //Add desired book to cart
			
			response.sendRedirect("refresh.app");  //Redirect to home page
			break;
			
		case "/refresh.app":
			
			service.addBooks();
			TreeSet<Book> books = service.viewAllBooks();  //Retrieve list of available books
			request.setAttribute("books", books);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response); //Send details to home page
			break;
			
		case "/viewcart.app":

			response.sendRedirect("cartdetails.jsp");  //Redirect to page with cart details
			break;
			
		case "/remove.app":
			bookId=request.getParameter("bookId");  //Retrieve book id
			service.deleteBookFromCart(Integer.parseInt(bookId));  //Remove desired book from cart
			
			response.sendRedirect("viewcart.app");  //Redirect to page with cart details
			break;
			
		default: break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}