public class Controlador implements Servlet {

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        //
        String action = request.getParameter("action");

        // 
        if (action.equals("/site3.html")) {
            response.sendRedirect(action);
        }
    }
}
