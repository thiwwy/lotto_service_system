package lottoApi.model;

import java.util.List;

public class Winner {
    private long id;
    private String name;
    private List<Integer> numbers;

    public Winner(long id, String name, List<Integer> numbers) {
        this.id = id;
        this.name = name;
        this.numbers = numbers;
    }
}
