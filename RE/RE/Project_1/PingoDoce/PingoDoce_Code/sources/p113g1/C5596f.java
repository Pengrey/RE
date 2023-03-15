package p113g1;

import java.util.ArrayList;
import org.joda.time.DateTimeConstants;
import p373u0.C10774f;
import p373u0.C10776g;
import p479z1.C13626t;

/* renamed from: g1.f */
/* loaded from: classes.dex */
public final class C5596f {

    /* renamed from: a */
    private final C5592b[] f15815a;

    /* renamed from: b */
    private int f15816b;

    public C5596f() {
        C5592b[] c5592bArr = new C5592b[20];
        for (int i = 0; i < 20; i++) {
            c5592bArr[i] = null;
        }
        this.f15815a = c5592bArr;
    }

    /* renamed from: c */
    private final C5594e m23618c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = this.f15816b;
        C5592b c5592b = this.f15815a[i];
        if (c5592b == null) {
            return C5594e.f15809e.m23621a();
        }
        int i2 = 0;
        C5592b c5592b2 = c5592b;
        while (true) {
            C5592b c5592b3 = this.f15815a[i];
            if (c5592b3 != null) {
                float m23630b = (float) (c5592b.m23630b() - c5592b3.m23630b());
                float abs = (float) Math.abs(c5592b3.m23630b() - c5592b2.m23630b());
                if (m23630b > 100.0f || abs > 40.0f) {
                    break;
                }
                long m23631a = c5592b3.m23631a();
                arrayList.add(Float.valueOf(C10774f.m7145k(m23631a)));
                arrayList2.add(Float.valueOf(C10774f.m7144l(m23631a)));
                arrayList3.add(Float.valueOf(-m23630b));
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    c5592b2 = c5592b3;
                    break;
                }
                c5592b2 = c5592b3;
            } else {
                break;
            }
        }
        if (i2 >= 3) {
            try {
                VelocityTracker m23616b = C5597g.m23616b(arrayList3, arrayList, 2);
                VelocityTracker m23616b2 = C5597g.m23616b(arrayList3, arrayList2, 2);
                float floatValue = ((Number) m23616b.m23629a().get(1)).floatValue();
                float floatValue2 = ((Number) m23616b2.m23629a().get(1)).floatValue();
                float f = (float) DateTimeConstants.MILLIS_PER_SECOND;
                return new C5594e(C10776g.m7133a(floatValue * f, floatValue2 * f), m23616b.m23628b() * m23616b2.m23628b(), c5592b.m23630b() - c5592b2.m23630b(), C10774f.m7141o(c5592b.m23631a(), c5592b2.m23631a()), null);
            } catch (IllegalArgumentException unused) {
                return C5594e.f15809e.m23621a();
            }
        }
        return new C5594e(C10774f.f27866b.m7134c(), 1.0f, c5592b.m23630b() - c5592b2.m23630b(), C10774f.m7141o(c5592b.m23631a(), c5592b2.m23631a()), null);
    }

    /* renamed from: a */
    public final void m23620a(long j, long j2) {
        int i = (this.f15816b + 1) % 20;
        this.f15816b = i;
        this.f15815a[i] = new C5592b(j2, j, null);
    }

    /* renamed from: b */
    public final long m23619b() {
        long m23622b = m23618c().m23622b();
        return C13626t.m772a(C10774f.m7145k(m23622b), C10774f.m7144l(m23622b));
    }
}
