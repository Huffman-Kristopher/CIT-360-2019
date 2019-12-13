/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import model.Character;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Kristopher Huffman
 */
public class HibernateExample {

    private static SessionFactory factory;
    private static Transaction tx;
    private static Session session;
    
    public HibernateExample () {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
      }
    }

    public void addCharacter(String firstName, String lastName, String Job, String Hair, String Body, Date createDate) {
        session = factory.openSession();
        try {
            tx = session.beginTransaction();
            Character Character = new Character(firstName, lastName, Job, Hair, Body, createDate);
            session.save(Character);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
    }
    
    public ArrayList<Character> getListCharacters() {
        session = factory.openSession();
        ArrayList<Character> CharacterList = new ArrayList<Character>();
        try {
            tx = session.beginTransaction();
            List Characters = session.createQuery("FROM Character").list();
            
            for(Iterator iterator = Characters.iterator(); iterator.hasNext();){
                Character Character = (Character) iterator.next();
                CharacterList.add(new Character(Character.getCharacterId(), Character.getCharacterFirstName(),
                    Character.getCharacterLastName(), Character.getCharacterJob(), Character.getCharacterHair(),
                    Character.getCharacterBody(),Character.getCreateDate()));
         }
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
        return CharacterList;
    }    
}
