/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorena.writer.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Mohammad
 */
@Stateless
@LocalBean
@Path("/user")
public class UserService {

    public UserService() {
    }

    @GET
    @Produces({"text/plain", "application/json"})
    public String HelloWorld() {
        return "Hello";
    }

    @POST
    @Consumes({"application/xml", "application/json", "text/plain"})
    @Produces(("text/plain"))
    public String TestPost(String name){
        return name;
    }
}
