package lottoApi.controller;

import lottoApi.service.LottoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lotto")
public class LottoController {

    public static final Logger logger = LoggerFactory.getLogger(LottoController.class);

    @Autowired
    @Qualifier("lottoServiceHashMap")
    private LottoService lottoService;

    @GetMapping("")
    public ResponseEntity<String> getLotto(){
        return new ResponseEntity<String>("Lotto", HttpStatus.OK);
    }

}
