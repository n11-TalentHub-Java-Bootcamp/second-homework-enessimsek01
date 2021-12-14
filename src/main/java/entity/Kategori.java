package entity;

import javax.persistence.*;

@Entity
@Table(name = "KATEGORI")
public class Kategori {

    @SequenceGenerator(name="generator",sequenceName = "KATEGORI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID",nullable = false)
    private Long id;

    @Column(name="ADI",nullable = false,length = 50)
    private String adi;

    @Column(name="KIRILIM")
    private Long kirilim;


    //private Long ustKategoriId;

    @ManyToOne(fetch =FetchType.LAZY)  //FetchType always LAZY
    @JoinColumn(name = "ID_UST_KATEGORI")
    private Kategori ustKategoriId;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    @Override
    public String toString() {
        return "Kategori{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", kirilim=" + kirilim +
                ", ustKategoriId=" + ustKategoriId +
                '}';
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Long getKirilim() {
        return kirilim;
    }

    public void setKirilim(Long kirilim) {
        this.kirilim = kirilim;
    }

    public Kategori getUstKategoriId() {
        return ustKategoriId;
    }

    public void setUstKategoriId(Kategori ustKategoriId) {
        this.ustKategoriId = ustKategoriId;
    }
}

