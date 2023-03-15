package androidx.compose.p018ui.platform;

import android.view.ViewConfiguration;
import androidx.compose.p018ui.platform.ViewConfiguration;
import p181jd.Intrinsics;

/* compiled from: AndroidViewConfiguration.android.kt */
/* renamed from: androidx.compose.ui.platform.g0 */
/* loaded from: classes.dex */
public final class C0718g0 implements ViewConfiguration {

    /* renamed from: a */
    private final ViewConfiguration f2257a;

    public C0718g0(ViewConfiguration viewConfiguration) {
        Intrinsics.isThisObjectNull(viewConfiguration, "viewConfiguration");
        this.f2257a = viewConfiguration;
    }

    /* renamed from: a */
    public long m39753a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    /* renamed from: b */
    public long m39752b() {
        return 40L;
    }

    /* renamed from: c */
    public long m39751c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    /* renamed from: d */
    public float m39750d() {
        return this.f2257a.getScaledTouchSlop();
    }

    /* renamed from: e */
    public long m39749e() {
        return ViewConfiguration.C0766a.m39639a(this);
    }
}
