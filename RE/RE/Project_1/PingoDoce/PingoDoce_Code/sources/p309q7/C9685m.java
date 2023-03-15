package p309q7;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.m */
/* loaded from: classes.dex */
public final class C9685m {

    /* renamed from: a */
    static final Logger f25527a = Logger.getLogger(C9685m.class.getName());

    private C9685m() {
    }

    /* renamed from: a */
    public static void m10221a(@CheckForNull InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            try {
                f25527a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
