package lottoApi.controller;

import lottoApi.model.LottoExtraction;
import lottoApi.model.LottoWinner;
import lottoApi.service.LottoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lotto")
public class LottoController {

    public static final Logger logger = LoggerFactory.getLogger(LottoController.class);

    @Autowired
    @Qualifier("LottoServiceTelegraph")
    private LottoService lottoService;

    @GetMapping("")
    public ResponseEntity<List<LottoExtraction>> getLotto()
    {
        return new ResponseEntity<List<LottoExtraction>>(lottoService.getLottos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LottoExtraction> getLottoById(@PathVariable("id") Long lottoId){
        return new ResponseEntity<LottoExtraction>(lottoService.getLottoById(lottoId), HttpStatus.OK);
    }

    @GetMapping("/winners")
    public ResponseEntity<List<LottoWinner>> getAllWinners(){
        return new ResponseEntity<List<LottoWinner>>(lottoService.getLottoWinners(), HttpStatus.OK);
    }

    @GetMapping("winners/{id}")
    public ResponseEntity<LottoWinner> getWinnerById(@PathVariable("id") Long winnerId){
        return new ResponseEntity<LottoWinner>(lottoService.getWinnerById(winnerId), HttpStatus.OK);
    }

}
