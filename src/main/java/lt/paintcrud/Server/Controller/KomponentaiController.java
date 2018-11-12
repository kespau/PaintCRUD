package lt.paintcrud.Server.Controller;

import lt.paintcrud.Server.model.Komponentai;
import lt.paintcrud.Server.model.KomponentaiCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KomponentaiController {
    @Autowired
    private KomponentaiCRUD komponentaiCRUD;

    @GetMapping("/komponentai")
    public @ResponseBody
    Iterable<Komponentai> getKomponentai() {

        return komponentaiCRUD.findAll();
    }
}