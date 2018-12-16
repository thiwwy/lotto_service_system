package lottoApi.service;

import lottoApi.model.LottoExtraction;
import lottoApi.exceptions.LottoNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("LottoServiceTelegraph")
public class LottoServiceTelegraph implements LottoService {

    private List<LottoExtraction> lottos;

    public LottoServiceTelegraph() {

        lottos = Arrays.asList(
                new LottoExtraction(0L, 123456L, new ArrayList<Integer>(Arrays.asList(1, 3, 5, 25, 46, 70))),
                new LottoExtraction(1L, 145456L, new ArrayList<Integer>(Arrays.asList(1, 3, 35, 47, 59, 87))),
                new LottoExtraction(2L, 143456L, new ArrayList<Integer>(Arrays.asList(1, 21, 32, 43, 56, 67)))
                );
    }

    @Override
    public List<LottoExtraction> getLottos()
    {
        if (lottos == null)
            throw new LottoNotFoundException(String.format("No lottos found"));
        return lottos;
    }


}
