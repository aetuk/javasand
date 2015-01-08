package servletInterface;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

import foundation.algo.sort.Quick;

/**
 * Servlet implementation class WebInterface
 */
@WebServlet(description = "Web interface for test harness", urlPatterns = { "/WebInterface" })
public class WebInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebInterface() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] outerArray=request.getParameterValues("values");
		
		int[] intvalues=convertarray(outerArray);
		
		Quick sorter = new Quick();
		
		sorter.sort(intvalues);
		
		PrintWriter out = response.getWriter();
		
		out.println(Arrays.toString(intvalues));
		
	}
	
	private int[] convertarray(String input[])
	{
		
		int[] intvalue = new int[input.length];

		for(int n = 0; n < input.length; n++) {
			intvalue[n] = Integer.parseInt(input[n]);
		  }
		
		return intvalue;
		
	}

}
