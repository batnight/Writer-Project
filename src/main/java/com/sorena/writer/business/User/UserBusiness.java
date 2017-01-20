/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sorena.writer.business.User;

import com.sorena.writer.entity.User;
import com.sorena.writer.utility.message.MessageInterface;
import javax.ejb.Stateless;

/**
 *
 * @author Mohammad Jalili
 */
@Stateless
public class UserBusiness implements IAdminUserBusiness,IGeneralUserBusiness{

    /**
     * 
     * @param user this object contain user information for registration.
     * @return result message.
     */
    @Override
    public MessageInterface register(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MessageInterface update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean blockUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean unBlockUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MessageInterface login(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
