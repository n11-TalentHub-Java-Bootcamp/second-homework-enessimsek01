package entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class ProductReview {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name="YORUM",nullable = false,length = 500)
    private String yorum;

    @Column(name="YORUM_TARIHI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date yorumTarihi;

    @Override
    public String toString() {
        return "ProductReview{" +
                "id=" + id +
                ", yorum='" + yorum + '\'' +
                ", yorumTarihi=" + yorumTarihi +
                ", urunId=" + urunId +
                ", kullaniciAdi=" + kullaniciAdi +
                '}';
    }

    @Column(name="URUN_ID")
    private Long urunId;

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public Long getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(Long kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    @Column(name="KULLANICI_ADI")
    private Long kullaniciAdi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
