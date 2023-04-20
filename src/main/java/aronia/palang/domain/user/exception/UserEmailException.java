package aronia.palang.domain.user.exception;

import aronia.palang.global.exception.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserEmailException extends RuntimeException{

    private final ErrorCode errorCode;

    public UserEmailException(String message) {
        super(message);
        this.errorCode = ErrorCode.EMAIL_ALREADY_EXIST;
    }
}
