/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HibernateExample;
import model.Character;

/**
 *
 * @author Kristopher Huffman
 */
public class CharacterApplication extends HttpServlet {
    public void init() throws ServletException {
        
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Set response content type
        response.setContentType("text/html");
        
        // Generate HTML file
        PrintWriter out = response.getWriter();
        String title = "CTI 360 Servlet Example";
        String doctype = "<!DOCTYPE HTML>";
        String cssStyles = "table {\n" + "border-collapse: collapse;\n" + "}\n" + "table, th, td {\n" + "border: 1px solid black;\n" +
            "}\n" + "th, td {\n" + "padding: 10px;\n" + "text-align: left;\n" + "}\n" + ".currentDate {\n" + "font-size: 12px;\n" + "}" + 
            "tbody th {background-color: #628ca6;color: white;};";
                
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String Job = request.getParameter("Job");
        String Hair = request.getParameter("Hair");
        String Body = request.getParameter("Body");
        Date create_date = new Date();
        
        HibernateExample hibernate = new HibernateExample();
        hibernate.addCharacter(firstName, lastName, Job, Hair, Body, create_date);
        
        ArrayList<Character> CharacterList = hibernate.getListCharacters();
        
        if(response.getStatus() == 200) {            
            out.write(doctype + 
                    "\n<html>\n"
                  + "<head>\n"
                  + "<title>" + title + "</title>\n"
                  + "</head>\n"
                  + "<style>" + cssStyles + "</style>\n"
                  + "<body>\n"
                  + "<h1>Output Values</h1>"
                  + "<p>Here is the output, returned by the server, of what you have entered into the form</p>"
                  + "<table border=\"1\">\n"
                  + "<tr>\n"
                  + "<th>Character ID</th>"
                  + "<th>First Name</th>"
                  + "<th>Last Name</th>"
                  + "<th>Job</th>"
                  + "<th>Hair</th>"
                  + "<th>Create Date</th>"
                  + "</tr>\n"
                  + "<tr>\n");
                 for(int i = 0; i < CharacterList.size(); i++) {
                     out.write("<tr>\n" 
                             + "<td>" + CharacterList.get(i).getCharacterId() + "</td>"
                             + "<td>" + CharacterList.get(i).getCharacterFirstName() + "</td>"
                             + "<td>" + CharacterList.get(i).getCharacterLastName() + "</td>"
                             + "<td>" + CharacterList.get(i).getCharacterJob() + "</td>"
                             + "<td>" + CharacterList.get(i).getCharacterHair() + "</td>"
                             + "<td>" + CharacterList.get(i).getCharacterBody() + "</td>"
                             + "<td>" + CharacterList.get(i).getCreateDate() + "</td>"
                             + "</tr>");
                 }
                 out.write("</tr>\n"
                  + "</table>\n"
                  + "<p class=\"currentDate\"><em>Received by server: " + create_date + "</em></p>\n"
                  + "<br />"
                  + "<button type=\"button\" onclick=\"window.location.href='index.html'\">Home</button>"  
                  + "</body>\n"
                  + "</html>"
            );
        }else {
            // Set error code and reason.
            response.sendError(400, "No request was received!" );
        }
    }
    
    public void destroy() {
        
    }
}
