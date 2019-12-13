/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Kristopher Huffman
 */
public class Character {
    
    private String CharacterFirstName;
    private String CharacterLastName;
    private String CharacterJob;
    private String CharacterHair;
    private String CharacterBody;
    private Date createDate;
    private int CharacterId;
    
    public Character() {
    }
    
    public Character(String CharacterFirstName, String CharacterLastName, String CharacterJob, String CharacterHair, String CharacterBody, Date createDate) {
        this.CharacterFirstName = CharacterFirstName;
        this.CharacterLastName = CharacterLastName;
        this.CharacterJob = CharacterJob;
        this.CharacterHair = CharacterHair;
        this.CharacterHair = CharacterBody;
        this.createDate = createDate;
    }
    
    public Character(int CharacterId, String CharacterFirstName, String CharacterLastName, String CharacterJob, String CharacterHair, String CharacterBody, Date createDate) {
        this.CharacterId = CharacterId;
        this.CharacterFirstName = CharacterFirstName;
        this.CharacterLastName = CharacterLastName;
        this.CharacterJob = CharacterJob;
        this.CharacterHair = CharacterHair;
        this.CharacterBody = CharacterBody;
        this.createDate = createDate;
    }    

    public void setCharacterFirstName(String CharacterFirstName) {
        this.CharacterFirstName = CharacterFirstName;
    }
    
    public String getCharacterFirstName() {
        return CharacterFirstName;
    }
    
    public void setCharacterLastName(String CharacterLastName) {
        this.CharacterLastName = CharacterLastName;
    }
    
    public String getCharacterLastName() {
        return CharacterLastName;
    }

    public String getCharacterJob() {
        return CharacterJob;
    }

    public void setCharacterJob(String CharacterJob) {
        this.CharacterJob = CharacterJob;
    }
    
    public String getCharacterHair() {
    return CharacterHair;
    }

    public void setCharacterHair(String CharacterHair) {
        this.CharacterHair = CharacterHair;
    }
    
    public String getCharacterBody() {
    return CharacterHair;
    }

    public void setCharacterBody(String CharacterBody) {
        this.CharacterBody = CharacterBody;
    }
    
    public Date getCreateDate() {
    return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }    
    
    public int getCharacterId() {
        return CharacterId;
    }
    
    public void setCharacterId(int CharacterId) {
        this.CharacterId = CharacterId;
    }

}