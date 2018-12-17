package lottoApi.service;

import lottoApi.exceptions.WinnerNotFoundException;
import lottoApi.model.LottoExtraction;
import lottoApi.exceptions.LottoNotFoundException;
import lottoApi.model.LottoWinner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("LottoServiceTelegraph")
public class LottoServiceTelegraph implements LottoService {

    private List<LottoExtraction> lottos;
    private List<LottoWinner> lottoWinners;

    public LottoServiceTelegraph() {

        lottos = Arrays.asList(
                new LottoExtraction(0L,
                                    123456L,
                                     new ArrayList<Integer>(Arrays.asList(1, 3, 5, 25, 46, 70)),
                                     new ArrayList<Long>(Arrays.asList(0L))),
                new LottoExtraction(1L,
                                    145456L,
                                     new ArrayList<Integer>(Arrays.asList(1, 3, 35, 47, 59, 87)),
                                     new ArrayList<Long>(Arrays.asList(1L, 2L))),
                new LottoExtraction(2L,
                                    143456L,
                                     new ArrayList<Integer>(Arrays.asList(1, 21, 32, 43, 56, 67)),
                                     new ArrayList<Long>(Arrays.asList(0L, 2L)))
                );
        lottoWinners = Arrays.asList(
                new LottoWinner(0L, "Winner_1", new ArrayList<Integer>(Arrays.asList(1, 3, 5, 25, 46, 70))),
                new LottoWinner(1L, "Winner_2", new ArrayList<Integer>(Arrays.asList(1, 3, 5, 25, 46))),
                new LottoWinner(2L, "Winner_3", new ArrayList<Integer>(Arrays.asList(1, 3, 5, 25)))
        );
    }

    @Override
    public List<LottoExtraction> getLottos()
    {
        if (lottos == null)
            throw new LottoNotFoundException(String.format("No lotto found"));
        return lottos;
    }

    @Override
    public List<LottoWinner> getLottoWinners() {
        if (lottoWinners == null)
            throw new WinnerNotFoundException(String.format("No winner found"));
        return lottoWinners;
    }

    @Override
    public LottoExtraction getLottoById(long id) {
        LottoExtraction lottoFound = null;
        for(LottoExtraction lotto : lottos)
            if(lotto.getId() == id)
                lottoFound = lotto;
        if(lottoFound == null)
            throw new LottoNotFoundException(String.format("lotto with id %d was not found", id));
        return lottoFound;
    }

    @Override
    public LottoWinner getWinnerById(long id) {
        LottoWinner winnerFound = null;
        for(LottoWinner winner : lottoWinners)
            if(winner.getId() == id)
                winnerFound = winner;
        if(winnerFound == null)
            throw new WinnerNotFoundException(String.format("winner with id %d not found", id));
        return winnerFound;
    }

}
