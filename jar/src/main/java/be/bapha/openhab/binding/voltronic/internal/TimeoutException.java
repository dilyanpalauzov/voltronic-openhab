package be.bapha.openhab.binding.voltronic.internal;

import java.io.Serial;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

/** Fired for disconnected devices **/
@NonNullByDefault
class TimeoutException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public TimeoutException() {
    };

    public TimeoutException(String message, @Nullable Throwable cause) {
        // possibly not needed
        super(message, cause);
    }
}
