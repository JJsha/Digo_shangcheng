package com.domain;



/**
 * Ddetail entity. @author MyEclipse Persistence Tools
 */

public class Ddetail  implements java.io.Serializable {


    // Fields    

     private DdetailId id;
     private Integer number;


    // Constructors

    /** default constructor */
    public Ddetail() {
    }

    
    /** full constructor */
    public Ddetail(DdetailId id, Integer number) {
        this.id = id;
        this.number = number;
    }

   
    // Property accessors

    public DdetailId getId() {
        return this.id;
    }
    
    public void setId(DdetailId id) {
        this.id = id;
    }

    public Integer getNumber() {
        return this.number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }
   








}