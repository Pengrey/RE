package gd;

import java.io.Closeable;
import p468yc.Exceptions;

/* renamed from: gd.a */
/* loaded from: classes2.dex */
public final class C5640a {
    /* renamed from: a */
    public static final void m23456a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                Exceptions.m1470a(th2, th3);
            }
        }
    }
}
