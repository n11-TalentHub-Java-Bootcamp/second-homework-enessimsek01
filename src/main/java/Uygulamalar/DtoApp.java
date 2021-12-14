package Uygulamalar;

import dto.UrunDetayDto;
import entityService.UrunEntityService;
import java.util.List;


public class DtoApp {

    public static void main(String[] args) {

        //ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();

        UrunEntityService service = new UrunEntityService();

        List<UrunDetayDto> urunList = service.findAllUrunDetayDtoByKategoriKirilim(1L);

        for (UrunDetayDto urunDetayDto : urunList) {
            System.out.println(urunDetayDto);
        }
    }
}