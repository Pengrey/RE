package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.C1508a;
import androidx.profileinstaller.C1511d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: androidx.profileinstaller.a */
/* loaded from: classes.dex */
public class C1508a {

    /* renamed from: a */
    private final AssetManager f4403a;

    /* renamed from: b */
    private final Executor f4404b;

    /* renamed from: c */
    private final C1511d.InterfaceC1514c f4405c;

    /* renamed from: e */
    private final File f4407e;

    /* renamed from: f */
    private final String f4408f;

    /* renamed from: g */
    private final String f4409g;

    /* renamed from: h */
    private final String f4410h;

    /* renamed from: j */
    private C1509b[] f4412j;

    /* renamed from: k */
    private byte[] f4413k;

    /* renamed from: i */
    private boolean f4411i = false;

    /* renamed from: d */
    private final byte[] f4406d = m36894c();

    public C1508a(AssetManager assetManager, Executor executor, C1511d.InterfaceC1514c interfaceC1514c, String str, String str2, String str3, File file) {
        this.f4403a = assetManager;
        this.f4404b = executor;
        this.f4405c = interfaceC1514c;
        this.f4408f = str;
        this.f4409g = str2;
        this.f4410h = str3;
        this.f4407e = file;
    }

    /* renamed from: b */
    private void m36895b() {
        if (!this.f4411i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* renamed from: c */
    private static byte[] m36894c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return null;
        }
        switch (i) {
            case 24:
            case 25:
                return C1517g.f4430d;
            case 26:
                return C1517g.f4429c;
            case 27:
                return C1517g.f4428b;
            case 28:
            case 29:
            case 30:
                return C1517g.f4427a;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m36892e(int i, Object obj) {
        this.f4405c.mo36860a(i, obj);
    }

    /* renamed from: g */
    private static boolean m36890g() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return false;
        }
        return i == 24 || i == 25;
    }

    /* renamed from: h */
    private void m36889h(final int i, final Object obj) {
        this.f4404b.execute(new Runnable() { // from class: y2.a
            @Override // java.lang.Runnable
            public final void run() {
                C1508a.this.m36892e(i, obj);
            }
        });
    }

    /* renamed from: d */
    public boolean m36893d() {
        if (this.f4406d == null) {
            m36889h(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.f4407e.canWrite()) {
            m36889h(4, null);
            return false;
        } else {
            this.f4411i = true;
            return true;
        }
    }

    /* renamed from: f */
    public C1508a m36891f() {
        m36895b();
        if (this.f4406d == null) {
            return this;
        }
        try {
            AssetFileDescriptor openFd = this.f4403a.openFd(this.f4409g);
            FileInputStream createInputStream = openFd.createInputStream();
            this.f4412j = C1516f.m36847l(createInputStream, C1516f.m36852g(createInputStream, C1516f.f4425a), this.f4408f);
            if (createInputStream != null) {
                createInputStream.close();
            }
            openFd.close();
        } catch (FileNotFoundException e) {
            this.f4405c.mo36860a(6, e);
        } catch (IOException e2) {
            this.f4405c.mo36860a(7, e2);
        } catch (IllegalStateException e3) {
            this.f4405c.mo36860a(8, e3);
        }
        C1509b[] c1509bArr = this.f4412j;
        if (c1509bArr != null && m36890g()) {
            try {
                AssetFileDescriptor openFd2 = this.f4403a.openFd(this.f4410h);
                try {
                    FileInputStream createInputStream2 = openFd2.createInputStream();
                    this.f4412j = C1516f.m36850i(createInputStream2, C1516f.m36852g(createInputStream2, C1516f.f4426b), c1509bArr);
                    if (createInputStream2 != null) {
                        createInputStream2.close();
                    }
                    openFd2.close();
                    return this;
                } catch (Throwable th2) {
                    if (openFd2 != null) {
                        try {
                            openFd2.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e4) {
                this.f4405c.mo36860a(9, e4);
            } catch (IOException e5) {
                this.f4405c.mo36860a(7, e5);
            } catch (IllegalStateException e6) {
                this.f4405c.mo36860a(8, e6);
            }
        }
        return this;
    }

    /* renamed from: i */
    public C1508a m36888i() {
        ByteArrayOutputStream byteArrayOutputStream;
        C1509b[] c1509bArr = this.f4412j;
        byte[] bArr = this.f4406d;
        if (c1509bArr != null && bArr != null) {
            m36895b();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e) {
                this.f4405c.mo36860a(7, e);
            } catch (IllegalStateException e2) {
                this.f4405c.mo36860a(8, e2);
            }
            try {
                C1516f.m36840s(byteArrayOutputStream, bArr);
                if (!C1516f.m36842q(byteArrayOutputStream, bArr, c1509bArr)) {
                    this.f4405c.mo36860a(5, null);
                    this.f4412j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f4413k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f4412j = null;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.profileinstaller.b[], byte[]] */
    /* renamed from: j */
    public boolean m36887j() {
        byte[] bArr = this.f4413k;
        if (bArr == null) {
            return false;
        }
        m36895b();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f4407e);
                    C1510c.m36876k(byteArrayInputStream, fileOutputStream);
                    m36889h(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e) {
                m36889h(6, e);
                return false;
            } catch (IOException e2) {
                m36889h(7, e2);
                return false;
            }
        } finally {
            this.f4413k = null;
            this.f4412j = null;
        }
    }
}
