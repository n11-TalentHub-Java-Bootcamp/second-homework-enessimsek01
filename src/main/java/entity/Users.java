package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="ADI",nullable = false,length = 50)
    private String Adi;

    @Column(name="SOYADI",nullable = false,length = 50)
    private String Soyadi;

    @Column(name="EMAIL",nullable = false,length = 50)
    private String Email;

    @Column(name="TELEFON",nullable = false,length = 15)
    private String Telefon;

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String adi) {
        this.Adi = adi;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Adi='" + Adi + '\'' +
                ", Soyadi='" + Soyadi + '\'' +
                ", Email='" + Email + '\'' +
                ", Telefon=" + Telefon +
                '}';
    }

    public String getSoyadi() {
        return Soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.Soyadi = soyadi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String telefon) {
        this.Telefon = telefon;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
