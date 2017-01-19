/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorena.writer.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mohammad
 */
@Entity
@XmlRootElement
class Application {
    @Id
    private String _id;
    private String appName;
    private ApplicationCategory applicationCategory;
    private List<Devices> deviceses;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ApplicationCategory getApplicationCategory() {
        return applicationCategory;
    }

    public void setApplicationCategory(ApplicationCategory applicationCategory) {
        this.applicationCategory = applicationCategory;
    }

    public List<Devices> getDeviceses() {
        return deviceses;
    }

    public void setDeviceses(List<Devices> deviceses) {
        this.deviceses = deviceses;
    }
    
    
}
