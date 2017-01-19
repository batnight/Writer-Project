/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorena.writer.entity;

/**
 *
 * @author Mohammad
 * @parma this class keep section details;
 */
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Section {

    @Id
    private String _id;
    private String title;
    private String body;
    private int numOfSection;
    private int numOfWord;
    private boolean active=false;
    private List<Rate> rates;
    private User userCreator;  
    private Story story;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getNumOfSection() {
        return numOfSection;
    }

    public void setNumOfSection(int numOfSection) {
        this.numOfSection = numOfSection;
    }

    public int getNumOfWord() {
        return numOfWord;
    }

    public void setNumOfWord(int numOfWord) {
        this.numOfWord = numOfWord;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public User getUserCreator() {
        return userCreator;
    }

    public void setUserCreator(User userCreator) {
        this.userCreator = userCreator;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }
    
    
}
