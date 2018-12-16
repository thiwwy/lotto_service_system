package lottoApi.model;

import java.util.List;

public class LottoExtraction {
    private long id;
    private long date;
    private List<Integer> winningNumbers;

    public LottoExtraction(long id, long date, List<Integer> winningNumbers) {
        this.id = id;
        this.date = date;
        this.winningNumbers = winningNumbers;
    }

    public long getId() {
        return id;
    }

    public long getDate() {
        return date;
    }

    public List<Integer> getWinningNumbers() {
        return winningNumbers;
    }
}
