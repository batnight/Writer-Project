/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorena.writer.persistence;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.sorena.writer.entity.User;
import com.sorena.writer.persistence.configuration.GetConnection;
import javax.ejb.EJB;
import javax.swing.text.Document;

/**
 *
 * @author Mohammad Jalili
 */
public class UserPersistence {

    @EJB
    GetConnection getConnection;
    
    MongoClient client = getConnection.getMongoClient();
    Gson g = new Gson();
    
    /**
     * 
     * @param u object of user contain user name for select from db.
     * @return if username exist return owner other information.
     */
    public User selectByUsername(User u) {
        //connect to db
        DB db = client.getDB("writer");
        //get collection
        DBCollection collection = db.getCollection("users");
        //instance of document and set username value to that.
        BasicDBObject doc = new BasicDBObject();
        doc.put("username", u.getUsername());
        //find the collection and fill restult in to cursor.
        DBCursor cursor = collection.find(doc);
        //check if document have value return that else return null.
        if(cursor.hasNext()){
            return g.fromJson(cursor.toString(), User.class);
        }else{
            return null;
        }
    }
    
    public User selectByEmail(User u) {
        //connect to db
        DB db = client.getDB("writer");
        //get collection
        DBCollection collection = db.getCollection("users");
        //instance of document and set email value to that.
        BasicDBObject doc = new BasicDBObject();
        doc.put("email", u.getEmail());
        //find the collection and fill restult in to cursor.
        DBCursor cursor = collection.find(doc);
        //check if document have value return that else return null.
        if(cursor.hasNext()){
            return g.fromJson(cursor.next().toString(), User.class);
        }else{
            return null;
        }
    }
    
    
}
