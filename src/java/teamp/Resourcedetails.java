package teamp;
// Generated Jul 18, 2019 9:38:43 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Resourcedetails generated by hbm2java
 */
@Entity
@Table(name="resourcedetails"
    ,catalog="blackriders"
)
public class Resourcedetails  implements java.io.Serializable {


     private Integer id;
     private String resourceName;
     private String location;
     private String capacity;
     private String bookingCharge;

    public Resourcedetails() {
    }

    public Resourcedetails(String resourceName, String location, String capacity, String bookingCharge) {
       this.resourceName = resourceName;
       this.location = location;
       this.capacity = capacity;
       this.bookingCharge = bookingCharge;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="ResourceName", nullable=false, length=200)
    public String getResourceName() {
        return this.resourceName;
    }
    
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    
    @Column(name="Location", nullable=false, length=200)
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    
    @Column(name="Capacity", nullable=false, length=200)
    public String getCapacity() {
        return this.capacity;
    }
    
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    
    @Column(name="BookingCharge", nullable=false, length=200)
    public String getBookingCharge() {
        return this.bookingCharge;
    }
    
    public void setBookingCharge(String bookingCharge) {
        this.bookingCharge = bookingCharge;
    }




}


