/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorena.writer.business.configuration;

import com.mongodb.MongoClient;
import com.sorena.writer.utility.defines.Urls;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

/**
 *
 * @author Mohammad
 * @param this class get singletone connection for mongodb db.
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class GetConnection {

    private MongoClient mongoClient = null;

    @Lock(LockType.READ)
    public MongoClient getMongoClient() {
        return mongoClient;
    }

    @PostConstruct
    public void init() {
        String mongoIpAddress = Urls.MONGODB_IP_URL;
        int mongoPortNumber = Urls.MONGODB_PORT_NUMBER;
        try{
            mongoClient = new MongoClient(mongoIpAddress,mongoPortNumber);
        } catch (UnknownHostException ex) {
            Logger.getLogger(GetConnection.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
}
