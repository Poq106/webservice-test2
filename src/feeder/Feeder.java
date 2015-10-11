package feeder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import collector.Collector;

/**
 * Servlet implementation class Feeder
 */
@WebServlet("/Feeder")
public class Feeder extends HttpServlet {
	private static final long serialVersionUID = 1L;
//    
//	Collector collector = new Collector();
//	int numberOfCollectedCases = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Feeder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	//	numberOfCollectedCases = collector.collect().length();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out = response.getWriter();
	   // out.println("collector no: " + numberOfCollectedCases);
	    out.println("asdasdasd");
	}

}
