package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public final class C1405x extends Writer {

    /* renamed from: w */
    private final String f4192w;

    /* renamed from: x */
    private StringBuilder f4193x = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1405x(String str) {
        this.f4192w = str;
    }

    /* renamed from: a */
    private void m37121a() {
        if (this.f4193x.length() > 0) {
            Log.d(this.f4192w, this.f4193x.toString());
            StringBuilder sb2 = this.f4193x;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m37121a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m37121a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m37121a();
            } else {
                this.f4193x.append(c);
            }
        }
    }
}
