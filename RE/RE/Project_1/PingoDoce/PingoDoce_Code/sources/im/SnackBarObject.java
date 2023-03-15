package im;

import java.lang.ref.WeakReference;
import p181jd.Intrinsics;
import p470yf.SnackBarAction;

/* renamed from: im.b */
/* loaded from: classes2.dex */
public final class SnackBarObject {

    /* renamed from: a */
    private final String f17018a;

    /* renamed from: b */
    private final int f17019b;

    /* renamed from: c */
    private final int f17020c;

    /* renamed from: d */
    private WeakReference f17021d;

    public SnackBarObject(String str, SnackBarAction snackBarAction, int i, int i2) {
        Intrinsics.isThisObjectNull(str, "message");
        this.f17018a = str;
        this.f17019b = i;
        this.f17020c = i2;
        this.f17021d = new WeakReference(snackBarAction);
    }

    /* renamed from: a */
    public final int m21907a() {
        return this.f17020c;
    }

    /* renamed from: b */
    public final int m21906b() {
        return this.f17019b;
    }

    /* renamed from: c */
    public final String m21905c() {
        return this.f17018a;
    }

    /* renamed from: d */
    public final SnackBarAction m21904d() {
        return (SnackBarAction) this.f17021d.get();
    }
}
