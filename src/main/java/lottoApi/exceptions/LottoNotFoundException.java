package lottoApi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LottoNotFoundException extends RuntimeException{
    public LottoNotFoundException(String exception) {
        super(exception);
    }
}
