package p269o9;

import com.google.firebase.crashlytics.internal.common.C4196g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p219l9.C7011f;
import p269o9.C8041e;

/* renamed from: o9.f */
/* loaded from: classes.dex */
class C8046f implements InterfaceC8035a {

    /* renamed from: d */
    private static final Charset f20798d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f20799a;

    /* renamed from: b */
    private final int f20800b;

    /* renamed from: c */
    private C8041e f20801c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFileLogStore.java */
    /* renamed from: o9.f$a */
    /* loaded from: classes.dex */
    public class C8047a implements C8041e.InterfaceC8045d {

        /* renamed from: a */
        final /* synthetic */ byte[] f20802a;

        /* renamed from: b */
        final /* synthetic */ int[] f20803b;

        C8047a(C8046f c8046f, byte[] bArr, int[] iArr) {
            this.f20802a = bArr;
            this.f20803b = iArr;
        }

        @Override // p269o9.C8041e.InterfaceC8045d
        /* renamed from: a */
        public void mo17065a(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.f20802a, this.f20803b[0], i);
                int[] iArr = this.f20803b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueueFileLogStore.java */
    /* renamed from: o9.f$b */
    /* loaded from: classes.dex */
    public static class C8048b {

        /* renamed from: a */
        public final byte[] f20804a;

        /* renamed from: b */
        public final int f20805b;

        C8048b(byte[] bArr, int i) {
            this.f20804a = bArr;
            this.f20805b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8046f(File file, int i) {
        this.f20799a = file;
        this.f20800b = i;
    }

    /* renamed from: f */
    private void m17068f(long j, String str) {
        int i;
        if (this.f20801c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.f20800b / 4) {
                str = "..." + str.substring(str.length() - i);
            }
            this.f20801c.m17077t(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f20798d));
            while (!this.f20801c.m17096L() && this.f20801c.m17081j0() > this.f20800b) {
                this.f20801c.m17088b0();
            }
        } catch (IOException e) {
            C7011f.m19611f().m19612e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    /* renamed from: g */
    private C8048b m17067g() {
        if (this.f20799a.exists()) {
            m17066h();
            C8041e c8041e = this.f20801c;
            if (c8041e == null) {
                return null;
            }
            int[] iArr = {0};
            byte[] bArr = new byte[c8041e.m17081j0()];
            try {
                this.f20801c.m17098F(new C8047a(this, bArr, iArr));
            } catch (IOException e) {
                C7011f.m19611f().m19612e("A problem occurred while reading the Crashlytics log file.", e);
            }
            return new C8048b(bArr, iArr[0]);
        }
        return null;
    }

    /* renamed from: h */
    private void m17066h() {
        if (this.f20801c == null) {
            try {
                this.f20801c = new C8041e(this.f20799a);
            } catch (IOException e) {
                C7011f m19611f = C7011f.m19611f();
                m19611f.m19612e("Could not open log file: " + this.f20799a, e);
            }
        }
    }

    @Override // p269o9.InterfaceC8035a
    /* renamed from: a */
    public void mo17073a() {
        C4196g.m28373e(this.f20801c, "There was a problem closing the Crashlytics log file.");
        this.f20801c = null;
    }

    @Override // p269o9.InterfaceC8035a
    /* renamed from: b */
    public String mo17072b() {
        byte[] mo17071c = mo17071c();
        if (mo17071c != null) {
            return new String(mo17071c, f20798d);
        }
        return null;
    }

    @Override // p269o9.InterfaceC8035a
    /* renamed from: c */
    public byte[] mo17071c() {
        C8048b m17067g = m17067g();
        if (m17067g == null) {
            return null;
        }
        int i = m17067g.f20805b;
        byte[] bArr = new byte[i];
        System.arraycopy(m17067g.f20804a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // p269o9.InterfaceC8035a
    /* renamed from: d */
    public void mo17070d() {
        mo17073a();
        this.f20799a.delete();
    }

    @Override // p269o9.InterfaceC8035a
    /* renamed from: e */
    public void mo17069e(long j, String str) {
        m17066h();
        m17068f(j, str);
    }
}
