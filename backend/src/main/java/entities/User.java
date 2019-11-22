package entities;

import sun.security.util.Password;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "USER")
public class User implements Serializable {
    public User() {
    }

    public User(@NotNull @Size(min = 1, max = 2000) int agencyNumber, @NotNull @Size(min = 1, max = 2000) String userName, @NotNull @Size(min = 1, max = 2000) String password) {
        this.agencyNumber = agencyNumber;
        this.userName = userName;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 2000)
    @Column(name = "AGENCYNUMBER")
    private int agencyNumber;

    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 2000)
    @Column(name = "USERNAME")
    private String userName;

    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "HASH")
    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
