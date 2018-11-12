package lt.paintcrud.Server.Controller;

import lt.paintcrud.Server.model.Receptai;
import lt.paintcrud.Server.model.ReceptaiCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceptaiController {
    @Autowired
    private ReceptaiCRUD receptaiCRUD;

    @GetMapping("/receptai")
    public @ResponseBody
    Iterable<Receptai> getReceptai() {
        return receptaiCRUD.findAll();
    }
}
