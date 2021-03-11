package com.ltts.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.*;
import com.ltts.model.*;


/**
 * Servlet implementation class InsertAuctionServlet
 */
@WebServlet("/InsertAuction")
public class InsertAuction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAuction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int aid=Integer.parseInt(request.getParameter("auc_id"));
		int pid=Integer.parseInt(request.getParameter("player_id"));
		int tid=Integer.parseInt(request.getParameter("team_id"));
		int amt=Integer.parseInt(request.getParameter("amount"));
		Auction p=new Auction(aid,pid,tid,amt);
		System.out.println("Inside Servlet: "+p);
		Auctiondao pd=new Auctiondao();
		boolean b=false;
		try {
			b=pd.insertAuction(p); // Control TRanfers to Dao file
			RequestDispatcher rd = request.getRequestDispatcher("");
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
