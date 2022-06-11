package com.google.sps.servlets;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
//import com.google.gson.Gson;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/information")
public final class InformationServlet extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Strings
        String currentInfo = "I'm taking finals this week";
        String pastInfo = "I did a few art commisions this past month" ;
        String futureInfo = "I'll be aplying to community service programs this summer";
        //Create array of strings
        ArrayList<String> personalInfo = new ArrayList<String>();
        personalInfo.add(currentInfo);
        personalInfo.add(pastInfo);
        personalInfo.add(futureInfo);
        String json = convertToJson(personalInfo);
        //Display
        response.setContentType("application/json;");
        response.getWriter().println(json);
    }
    private String convertToJson(ArrayList<String> info) {
        String json = "{";
        json += "\"currentInfo\": ";
        json += "\"" + info.get(0) + "\"";
        json += ", ";
        json += "\"pastInfo\": ";
        json += "\"" + info.get(1) + "\"";
        json += ", ";
        json += "\"futureInfo\": ";
        json += "\"" +info.get(2)+ "\"";
        json += "}";
        System.out.println(json);
        return json;
      }
    /*private String convertToJsonUsingGson(ArrayList<String> info) {
        Gson gson = new Gson();
        String json = gson.toJson(info);
        return json;
      }
      */
    
}
