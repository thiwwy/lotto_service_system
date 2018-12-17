package lottoApi.service;

import lottoApi.model.LottoExtraction;
import lottoApi.model.LottoWinner;

import java.util.List;

public interface LottoService {

    List<LottoExtraction> getLottos();
    List<LottoWinner> getLottoWinners();
    LottoExtraction getLottoById(long id);
    LottoWinner getWinnerById(long id);

}
