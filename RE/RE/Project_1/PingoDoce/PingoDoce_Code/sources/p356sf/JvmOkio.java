package p356sf;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sf.g0 */
/* loaded from: classes2.dex */
public final class JvmOkio extends AsyncTimeout {

    /* renamed from: l */
    private final Socket f26553l;

    public JvmOkio(Socket socket) {
        Intrinsics.isThisObjectNull(socket, "socket");
        this.f26553l = socket;
    }

    /* renamed from: v */
    protected IOException m8678v(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* renamed from: z */
    protected void m8677z() {
        try {
            this.f26553l.close();
        } catch (AssertionError e) {
            if (C10200t.m8564d(e)) {
                Logger m8556a = C10201u.m8556a();
                Level level = Level.WARNING;
                m8556a.log(level, "Failed to close timed out socket " + this.f26553l, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            Logger m8556a2 = C10201u.m8556a();
            Level level2 = Level.WARNING;
            m8556a2.log(level2, "Failed to close timed out socket " + this.f26553l, (Throwable) e2);
        }
    }
}
