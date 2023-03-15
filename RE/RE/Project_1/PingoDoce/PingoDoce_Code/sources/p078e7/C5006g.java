package p078e7;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: e7.g */
/* loaded from: classes.dex */
public class C5006g implements InterfaceC5003d {

    /* renamed from: a */
    private static final C5006g f13941a = new C5006g();

    private C5006g() {
    }

    /* renamed from: d */
    public static InterfaceC5003d m25911d() {
        return f13941a;
    }

    @Override // p078e7.InterfaceC5003d
    /* renamed from: a */
    public final long mo25914a() {
        return System.currentTimeMillis();
    }

    @Override // p078e7.InterfaceC5003d
    /* renamed from: b */
    public final long mo25913b() {
        return System.nanoTime();
    }

    @Override // p078e7.InterfaceC5003d
    /* renamed from: c */
    public final long mo25912c() {
        return SystemClock.elapsedRealtime();
    }
}
