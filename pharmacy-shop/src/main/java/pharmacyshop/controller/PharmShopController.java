package pharmacyshop.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pharmacyshop.service.PharmShopService;

@RestController
public class PharmShopController {

    private PharmShopService pharmShopService;

    public PharmShopController(PharmShopService pharmShopService) {
        this.pharmShopService = pharmShopService;
    }

    @CrossOrigin
    @GetMapping("/pharm-company-names")
    public List<String> getAllCompanyNames() {
        List<String> str = pharmShopService.getAllCompanyNames();
        return str;
    }
}