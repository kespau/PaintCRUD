package lt.paintcrud.Server.Controller;

import lt.paintcrud.Server.model.Kiekiai;
import lt.paintcrud.Server.model.KiekiaiCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KiekiaiController {
    @Autowired
    private KiekiaiCRUD kiekiaiCRUD;

    @GetMapping("/kiekiai")
    public @ResponseBody
    Iterable<Kiekiai> getKiekiai() {
        return kiekiaiCRUD.findAll();
    }
}
