package com.domain;



/**
 * DdetailId entity. @author MyEclipse Persistence Tools
 */

public class DdetailId  implements java.io.Serializable {


    // Fields    

     private Integer SId;
     private Integer DId;


    // Constructors

    /** default constructor */
    public DdetailId() {
    }

    
    /** full constructor */
    public DdetailId(Integer SId, Integer DId) {
        this.SId = SId;
        this.DId = DId;
    }

   
    // Property accessors

    public Integer getSId() {
        return this.SId;
    }
    
    public void setSId(Integer SId) {
        this.SId = SId;
    }

    public Integer getDId() {
        return this.DId;
    }
    
    public void setDId(Integer DId) {
        this.DId = DId;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DdetailId) ) return false;
		 DdetailId castOther = ( DdetailId ) other; 
         
		 return ( (this.getSId()==castOther.getSId()) || ( this.getSId()!=null && castOther.getSId()!=null && this.getSId().equals(castOther.getSId()) ) )
 && ( (this.getDId()==castOther.getDId()) || ( this.getDId()!=null && castOther.getDId()!=null && this.getDId().equals(castOther.getDId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSId() == null ? 0 : this.getSId().hashCode() );
         result = 37 * result + ( getDId() == null ? 0 : this.getDId().hashCode() );
         return result;
   }   





}