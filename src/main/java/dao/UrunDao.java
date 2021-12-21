package dao;

import entity.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrunDao extends JpaRepository<Urun, Long> {
    List<Urun> findAll();

    Urun findProductById(Long urunId);

}
