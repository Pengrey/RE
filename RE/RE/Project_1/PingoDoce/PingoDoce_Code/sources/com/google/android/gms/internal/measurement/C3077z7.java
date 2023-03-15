package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.z7 */
/* loaded from: classes.dex */
final class C3077z7 {

    /* renamed from: a */
    private final AbstractC3062y7 f8147a;

    private C3077z7(AbstractC3062y7 abstractC3062y7) {
        C3048x8.m31824f(abstractC3062y7, "output");
        this.f8147a = abstractC3062y7;
        abstractC3062y7.f8103a = this;
    }

    /* renamed from: l */
    public static C3077z7 m31667l(AbstractC3062y7 abstractC3062y7) {
        C3077z7 c3077z7 = abstractC3062y7.f8103a;
        return c3077z7 != null ? c3077z7 : new C3077z7(abstractC3062y7);
    }

    /* renamed from: A */
    public final void m31689A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31787l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31788k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void m31688B(int i, Object obj, InterfaceC2734da interfaceC2734da) throws IOException {
        AbstractC3062y7 abstractC3062y7 = this.f8147a;
        abstractC3062y7.mo31780s(i, 3);
        interfaceC2734da.mo31898h((InterfaceC2973s9) obj, abstractC3062y7.f8103a);
        abstractC3062y7.mo31780s(i, 4);
    }

    /* renamed from: C */
    public final void m31687C(int i, int i2) throws IOException {
        this.f8147a.mo31784o(i, i2);
    }

    /* renamed from: D */
    public final void m31686D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC3062y7.m31773z(((Integer) list.get(i4)).intValue());
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31783p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31784o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void m31685E(int i, long j) throws IOException {
        this.f8147a.mo31777v(i, j);
    }

    /* renamed from: F */
    public final void m31684F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC3062y7.m31797b(((Long) list.get(i4)).longValue());
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31776w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31777v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void m31683G(int i, Object obj, InterfaceC2734da interfaceC2734da) throws IOException {
        Object obj2 = (InterfaceC2973s9) obj;
        C3047x7 c3047x7 = (C3047x7) this.f8147a;
        c3047x7.mo31778u((i << 3) | 2);
        AbstractC2699b7 abstractC2699b7 = (AbstractC2699b7) obj2;
        int mo32191g = abstractC2699b7.mo32191g();
        if (mo32191g == -1) {
            mo32191g = interfaceC2734da.mo31901e(abstractC2699b7);
            abstractC2699b7.mo32190j(mo32191g);
        }
        c3047x7.mo31778u(mo32191g);
        interfaceC2734da.mo31898h(obj2, c3047x7.f8103a);
    }

    /* renamed from: H */
    public final void m31682H(int i, int i2) throws IOException {
        this.f8147a.mo31788k(i, i2);
    }

    /* renamed from: I */
    public final void m31681I(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31787l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31788k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void m31680J(int i, long j) throws IOException {
        this.f8147a.mo31786m(i, j);
    }

    /* renamed from: K */
    public final void m31679K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31785n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31786m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void m31678a(int i, int i2) throws IOException {
        this.f8147a.mo31779t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void m31677b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += AbstractC3062y7.m31798a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                AbstractC3062y7 abstractC3062y7 = this.f8147a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                abstractC3062y7.mo31778u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC3062y7 abstractC3062y72 = this.f8147a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            abstractC3062y72.mo31779t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void m31676c(int i, long j) throws IOException {
        this.f8147a.mo31777v(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void m31675d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += AbstractC3062y7.m31797b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                AbstractC3062y7 abstractC3062y7 = this.f8147a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                abstractC3062y7.mo31776w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC3062y7 abstractC3062y72 = this.f8147a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            abstractC3062y72.mo31777v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void m31674e(int i) throws IOException {
        this.f8147a.mo31780s(i, 3);
    }

    /* renamed from: f */
    public final void m31673f(int i, String str) throws IOException {
        this.f8147a.mo31781r(i, str);
    }

    /* renamed from: g */
    public final void m31672g(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC2701b9) {
            InterfaceC2701b9 interfaceC2701b9 = (InterfaceC2701b9) list;
            while (i2 < list.size()) {
                Object mo31891s = interfaceC2701b9.mo31891s(i2);
                if (mo31891s instanceof String) {
                    this.f8147a.mo31781r(i, (String) mo31891s);
                } else {
                    this.f8147a.mo31789j(i, (AbstractC2955r7) mo31891s);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31781r(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void m31671h(int i, int i2) throws IOException {
        this.f8147a.mo31779t(i, i2);
    }

    /* renamed from: i */
    public final void m31670i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC3062y7.m31798a(((Integer) list.get(i4)).intValue());
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31778u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31779t(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void m31669j(int i, long j) throws IOException {
        this.f8147a.mo31777v(i, j);
    }

    /* renamed from: k */
    public final void m31668k(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC3062y7.m31797b(((Long) list.get(i4)).longValue());
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31776w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31777v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void m31666m(int i, boolean z) throws IOException {
        this.f8147a.mo31790i(i, z);
    }

    /* renamed from: n */
    public final void m31665n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31791h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31790i(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void m31664o(int i, AbstractC2955r7 abstractC2955r7) throws IOException {
        this.f8147a.mo31789j(i, abstractC2955r7);
    }

    /* renamed from: p */
    public final void m31663p(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f8147a.mo31789j(i, (AbstractC2955r7) list.get(i2));
        }
    }

    /* renamed from: q */
    public final void m31662q(int i, double d) throws IOException {
        this.f8147a.mo31786m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void m31661r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31785n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31786m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: s */
    public final void m31660s(int i) throws IOException {
        this.f8147a.mo31780s(i, 4);
    }

    /* renamed from: t */
    public final void m31659t(int i, int i2) throws IOException {
        this.f8147a.mo31784o(i, i2);
    }

    /* renamed from: u */
    public final void m31658u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC3062y7.m31773z(((Integer) list.get(i4)).intValue());
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31783p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31784o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void m31657v(int i, int i2) throws IOException {
        this.f8147a.mo31788k(i, i2);
    }

    /* renamed from: w */
    public final void m31656w(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31787l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31788k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void m31655x(int i, long j) throws IOException {
        this.f8147a.mo31786m(i, j);
    }

    /* renamed from: y */
    public final void m31654y(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8147a.mo31780s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f8147a.mo31778u(i3);
            while (i2 < list.size()) {
                this.f8147a.mo31785n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8147a.mo31786m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void m31653z(int i, float f) throws IOException {
        this.f8147a.mo31788k(i, Float.floatToRawIntBits(f));
    }
}
