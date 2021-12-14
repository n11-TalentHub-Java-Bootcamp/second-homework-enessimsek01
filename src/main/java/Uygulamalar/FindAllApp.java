package Uygulamalar;

import entity.Urun;
import entityService.UrunEntityService;

import java.util.List;

public class FindAllApp
{
    public static void main(String[] args) {
        UrunEntityService service=new UrunEntityService();
        List<Urun> urunList= service.findAll();

        for(Urun urun:urunList){
            System.out.println(urun);
        }
    }
}
