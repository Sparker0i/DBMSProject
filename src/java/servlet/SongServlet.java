/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import connection.DataConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import music.*;

/**
 *
 * @author Spark
 */
public class SongServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html lang=\"en\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <title>Welcome to AAVA Music Studios</title>\n" +
"    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n" +
"    <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n" +
"    <script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n" +
"</head>\n" +
"<body>\n" +
"<!-- The drawer is always open in large screens. The header is always\n" +
"   shown, even in small screens. -->\n" +
"<style>\n" +
"    .demo-layout-transparent {\n" +
"        background: #00FFFF center / cover;\n" +
"    }\n" +
"    .demo-layout-transparent .mdl-layout__header,\n" +
"    .demo-layout-transparent .mdl-layout__drawer-button {\n" +
"        /* This background is dark, so we set text to white. Use 87% black instead if\n" +
"           your background is light. */\n" +
"        color: white;\n" +
"    }\n" +
"</style>\n" +
"<div class = \"demo-layout-transparent mdl-layout mdl-js-layout mdl-layout--fixed-header mdl-layout--fixed-tabs\">\n" +
"    <header class = \"mdl-layout__header\">\n" +
"        <!-- Top row, always visible -->\n" +
"        <div class = \"mdl-layout__header-row\">\n" +
"            <!-- Title -->\n" +
"            <span class = \"mdl-layout-title\">Welcome to AAVA Music Studios</span>\n" +
"        </div>\n" +
"\n" +
"        <!-- Tabs -->\n" +
"        <div class = \"mdl-layout__tab-bar mdl-js-ripple-effect\">\n" +
"            <a href = \"album\" class = \"mdl-layout__tab \">Album</a>\n"+
"            <a href = \"#scroll-tab-6\" class = \"mdl-layout__tab is-active\">Song</a>\n"+ 
"            <a href = \"singer\" class = \"mdl-layout__tab\">Singer</a>\n"+ 
"            <a href = \"music-director\" class = \"mdl-layout__tab\">Music Director</a>\n"+ 
"            <a href = \"author\" class = \"mdl-layout__tab\">Author</a>\n"+
"        </div>\n" +
"    </header>\n" +
"\n" +
"    <main class = \"mdl-layout__content\">\n" +
"        <section class = \"mdl-layout__tab-panel is-active\" id = \"scroll-tab-6\">\n" +
"            <div class = \"page-content\">");
            ArrayList<Song> songs = MusicHandler.getSongs(new DataConnection().getConnection());
            out.println("<center><table border=\"1\">"
                    + "<tr><td>Song ID</td><td>Title</td><td>Author ID</td></tr>");
            for (Song song: songs) {
                int id = song.song_id;
                String t = song.title;
                int a = song.author_id;
                out.println("<tr><td>" + id + "</td><td>" + t +"</td><td>" + a + "</td></tr>");   
            }
            out.println("</table></center>");
            out.println("</div>\n" +
"        </section>\n" +
"    </main>\n" +
"</div>\n" +
"\n" +
"</body>\n" +
"</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
