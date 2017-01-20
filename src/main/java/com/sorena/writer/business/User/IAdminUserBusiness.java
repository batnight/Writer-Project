/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorena.writer.business.User;

import com.sorena.writer.entity.User;
import com.sorena.writer.utility.message.MessageInterface;
import javax.ejb.Local;

/**
 *
 * @author Mohammad
 */
@Local
public interface IAdminUserBusiness {

    MessageInterface register(User user);

    MessageInterface update(User user);

    boolean blockUser(User user);

    boolean unBlockUser(User user);
    
    MessageInterface login(User user);
}
