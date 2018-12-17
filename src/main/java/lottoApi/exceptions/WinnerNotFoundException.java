package lottoApi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WinnerNotFoundException extends RuntimeException {
    public WinnerNotFoundException(String exception) {
        super(exception);
    }
}
