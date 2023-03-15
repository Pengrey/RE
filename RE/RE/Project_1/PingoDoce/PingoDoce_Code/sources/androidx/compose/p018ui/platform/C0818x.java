package androidx.compose.p018ui.platform;

import android.content.res.Configuration;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p374u1.InterfaceC10800n;
import p374u1.TextInputService;
import p479z1.EnumC13618o;

/* compiled from: AndroidComposeView.android.kt */
/* renamed from: androidx.compose.ui.platform.x */
/* loaded from: classes.dex */
public final class C0818x {

    /* renamed from: a */
    private static InterfaceC6108l f2436a = C0819a.f2437w;

    /* compiled from: AndroidComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.x$a */
    /* loaded from: classes.dex */
    static final class C0819a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C0819a f2437w = new C0819a();

        C0819a() {
            super(1);
        }

        /* renamed from: a */
        public final TextInputService mo9587d(InterfaceC10800n interfaceC10800n) {
            Intrinsics.isThisObjectNull(interfaceC10800n, "it");
            return new TextInputService(interfaceC10800n);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC13618o m39488a(int i) {
        return m39483f(i);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m39487b(float[] fArr, float[] fArr2) {
        m39482g(fArr, fArr2);
    }

    /* renamed from: c */
    private static final float m39486c(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 0] * fArr2[0 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    /* renamed from: d */
    public static final EnumC13618o m39485d(Configuration configuration) {
        Intrinsics.isThisObjectNull(configuration, "<this>");
        return m39483f(configuration.getLayoutDirection());
    }

    /* renamed from: e */
    public static final InterfaceC6108l m39484e() {
        return f2436a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final EnumC13618o m39483f(int i) {
        if (i != 0) {
            if (i != 1) {
                return EnumC13618o.Ltr;
            }
            return EnumC13618o.Rtl;
        }
        return EnumC13618o.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m39482g(float[] fArr, float[] fArr2) {
        float m39486c = m39486c(fArr2, 0, fArr, 0);
        float m39486c2 = m39486c(fArr2, 0, fArr, 1);
        float m39486c3 = m39486c(fArr2, 0, fArr, 2);
        float m39486c4 = m39486c(fArr2, 0, fArr, 3);
        float m39486c5 = m39486c(fArr2, 1, fArr, 0);
        float m39486c6 = m39486c(fArr2, 1, fArr, 1);
        float m39486c7 = m39486c(fArr2, 1, fArr, 2);
        float m39486c8 = m39486c(fArr2, 1, fArr, 3);
        float m39486c9 = m39486c(fArr2, 2, fArr, 0);
        float m39486c10 = m39486c(fArr2, 2, fArr, 1);
        float m39486c11 = m39486c(fArr2, 2, fArr, 2);
        float m39486c12 = m39486c(fArr2, 2, fArr, 3);
        float m39486c13 = m39486c(fArr2, 3, fArr, 0);
        float m39486c14 = m39486c(fArr2, 3, fArr, 1);
        float m39486c15 = m39486c(fArr2, 3, fArr, 2);
        float m39486c16 = m39486c(fArr2, 3, fArr, 3);
        fArr[0] = m39486c;
        fArr[1] = m39486c2;
        fArr[2] = m39486c3;
        fArr[3] = m39486c4;
        fArr[4] = m39486c5;
        fArr[5] = m39486c6;
        fArr[6] = m39486c7;
        fArr[7] = m39486c8;
        fArr[8] = m39486c9;
        fArr[9] = m39486c10;
        fArr[10] = m39486c11;
        fArr[11] = m39486c12;
        fArr[12] = m39486c13;
        fArr[13] = m39486c14;
        fArr[14] = m39486c15;
        fArr[15] = m39486c16;
    }
}
