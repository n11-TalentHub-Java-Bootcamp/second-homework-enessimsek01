package dao;

import entity.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KategoriDao extends JpaRepository<Kategori,Long> {

    List<Kategori> findAll();
    Kategori findKategoriById(Long kategoriId);
}
