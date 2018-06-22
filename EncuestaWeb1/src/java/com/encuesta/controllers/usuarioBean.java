/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encuesta.controllers;

import com.encuesta.model.Usuario;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Juan Gallo
 */
@Named(value = "usuarioBean")
@SessionScoped
public class usuarioBean implements Serializable{

    /**
     * Creates a new instance of usuarioBean
     * @return 
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
   public List<Usuario> getUsers() throws ClassNotFoundException, SQLException {

		Connection connect = null;

		String url = "jdbc:mysql://localhost:3306/db_encuesta";

		String username = "root";
		String password = "";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection(url, username, password);
			// System.out.println("Connection established"+connect);

		} catch (SQLException ex) {
			System.out.println("in exec");
			System.out.println(ex.getMessage());
		}

		List<Usuario> users = new ArrayList<Usuario>();
		PreparedStatement pstmt = connect.prepareStatement(
                        "select * form tbl_usuario");
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			Usuario user = new Usuario();
			user.setId_user(rs.getString("id_user"));
			user.setNom_user(rs.getString("nom_user"));
			user.setPass(rs.getString("pass"));
			user.setTipousuario(rs.getString("tipousuario"));
                        user.setNombre(rs.getString("nombre"));
			user.setDescrtipo(rs.getString("descrtipo"));
                        user.setNom_user(rs.getString("nombre"));
                        user.setFechaNac(rs.getDate("fechaNac"));
        
			users.add(user);

		}

		// close resources
		rs.close();
		pstmt.close();
		connect.close();

		return users;

	}
}
