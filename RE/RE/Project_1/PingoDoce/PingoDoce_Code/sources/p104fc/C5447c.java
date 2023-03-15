package p104fc;

import com.google.zxing.C4411o;
import com.google.zxing.EnumC4399d;
import com.google.zxing.FormatException;
import com.google.zxing.InterfaceC4412p;
import com.google.zxing.NotFoundException;
import com.google.zxing.qrcode.decoder.C4432j;
import java.util.Map;
import p239mb.AbstractC7162i;
import p239mb.C7155b;
import p239mb.C7160g;
import p239mb.C7164k;
import p254nb.C7693a;

/* renamed from: fc.c */
/* loaded from: classes2.dex */
public class C5447c {

    /* renamed from: a */
    private final C7155b f15347a;

    /* renamed from: b */
    private InterfaceC4412p f15348b;

    public C5447c(C7155b c7155b) {
        this.f15347a = c7155b;
    }

    /* renamed from: b */
    private float m24335b(C4411o c4411o, C4411o c4411o2) {
        float m24327j = m24327j((int) c4411o.m27640c(), (int) c4411o.m27639d(), (int) c4411o2.m27640c(), (int) c4411o2.m27639d());
        float m24327j2 = m24327j((int) c4411o2.m27640c(), (int) c4411o2.m27639d(), (int) c4411o.m27640c(), (int) c4411o.m27639d());
        return Float.isNaN(m24327j) ? m24327j2 / 7.0f : Float.isNaN(m24327j2) ? m24327j / 7.0f : (m24327j + m24327j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m24334c(C4411o c4411o, C4411o c4411o2, C4411o c4411o3, float f) throws NotFoundException {
        int m17703c = ((C7693a.m17703c(C4411o.m27641b(c4411o, c4411o2) / f) + C7693a.m17703c(C4411o.m27641b(c4411o, c4411o3) / f)) / 2) + 7;
        int i = m17703c & 3;
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    return m17703c;
                }
                throw NotFoundException.m27700a();
            }
            return m17703c - 1;
        }
        return m17703c + 1;
    }

    /* renamed from: d */
    private static C7164k m24333d(C4411o c4411o, C4411o c4411o2, C4411o c4411o3, C4411o c4411o4, int i) {
        float m27640c;
        float m27639d;
        float f;
        float f2 = i - 3.5f;
        if (c4411o4 != null) {
            m27640c = c4411o4.m27640c();
            m27639d = c4411o4.m27639d();
            f = f2 - 3.0f;
        } else {
            m27640c = (c4411o2.m27640c() - c4411o.m27640c()) + c4411o3.m27640c();
            m27639d = (c4411o2.m27639d() - c4411o.m27639d()) + c4411o3.m27639d();
            f = f2;
        }
        return C7164k.m19014b(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, c4411o.m27640c(), c4411o.m27639d(), c4411o2.m27640c(), c4411o2.m27639d(), m27640c, m27639d, c4411o3.m27640c(), c4411o3.m27639d());
    }

    /* renamed from: h */
    private static C7155b m24329h(C7155b c7155b, C7164k c7164k, int i) throws NotFoundException {
        return AbstractC7162i.m19024b().mo19022d(c7155b, i, i, c7164k);
    }

    /* renamed from: i */
    private float m24328i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C5447c c5447c;
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z4) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int abs2 = Math.abs(i8 - i6);
        int i11 = 2;
        int i12 = (-abs) / 2;
        int i13 = i5 < i7 ? 1 : -1;
        int i14 = i6 < i8 ? 1 : -1;
        int i15 = i7 + i13;
        int i16 = i5;
        int i17 = i6;
        int i18 = 0;
        while (true) {
            if (i16 == i15) {
                i9 = i15;
                i10 = i11;
                break;
            }
            int i19 = z4 ? i17 : i16;
            int i20 = z4 ? i16 : i17;
            if (i18 == z3) {
                z = z4;
                z2 = z3;
                i9 = i15;
                c5447c = this;
            } else {
                c5447c = this;
                z = z4;
                i9 = i15;
                z2 = false;
            }
            if (z2 == c5447c.f15347a.m19059e(i19, i20)) {
                if (i18 == 2) {
                    return C7693a.m17704b(i16, i17, i5, i6);
                }
                i18++;
            }
            i12 += abs2;
            if (i12 > 0) {
                if (i17 == i8) {
                    i10 = 2;
                    break;
                }
                i17 += i14;
                i12 -= abs;
            }
            i16 += i13;
            i15 = i9;
            z4 = z;
            z3 = true;
            i11 = 2;
        }
        if (i18 == i10) {
            return C7693a.m17704b(i9, i8, i5, i6);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m24327j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float m24328i = m24328i(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else if (i5 >= this.f15347a.m19053l()) {
            f = ((this.f15347a.m19053l() - 1) - i) / (i5 - i);
            i5 = this.f15347a.m19053l() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i7 = (int) (f3 - ((i4 - i2) * f));
        if (i7 < 0) {
            f2 = f3 / (i2 - i7);
        } else if (i7 >= this.f15347a.m19056i()) {
            f2 = ((this.f15347a.m19056i() - 1) - i2) / (i7 - i2);
            i6 = this.f15347a.m19056i() - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (m24328i + m24328i(i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }

    /* renamed from: a */
    protected final float m24336a(C4411o c4411o, C4411o c4411o2, C4411o c4411o3) {
        return (m24335b(c4411o, c4411o2) + m24335b(c4411o, c4411o3)) / 2.0f;
    }

    /* renamed from: e */
    public final C7160g m24332e(Map<EnumC4399d, ?> map) throws NotFoundException, FormatException {
        this.f15348b = map == null ? null : (InterfaceC4412p) map.get(EnumC4399d.NEED_RESULT_POINT_CALLBACK);
        return m24330g(new C5449e(this.f15347a, this.f15348b).m24317f(map));
    }

    /* renamed from: f */
    protected final C5445a m24331f(float f, int i, int i2, float f2) throws NotFoundException {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f15347a.m19053l() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f15347a.m19056i() - 1, i2 + i3) - max2;
            if (min2 >= f3) {
                return new C5446b(this.f15347a, max, max2, min, min2, f, this.f15348b).m24339c();
            }
            throw NotFoundException.m27700a();
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: g */
    protected final C7160g m24330g(C5452f c5452f) throws NotFoundException, FormatException {
        C5448d m24305b = c5452f.m24305b();
        C5448d m24304c = c5452f.m24304c();
        C5448d m24306a = c5452f.m24306a();
        float m24336a = m24336a(m24305b, m24304c, m24306a);
        if (m24336a >= 1.0f) {
            int m24334c = m24334c(m24305b, m24304c, m24306a, m24336a);
            C4432j m27604g = C4432j.m27604g(m24334c);
            int m27606e = m27604g.m27606e() - 7;
            C5445a c5445a = null;
            if (m27604g.m27607d().length > 0) {
                float m27640c = (m24304c.m27640c() - m24305b.m27640c()) + m24306a.m27640c();
                float m27639d = (m24304c.m27639d() - m24305b.m27639d()) + m24306a.m27639d();
                float f = 1.0f - (3.0f / m27606e);
                int m27640c2 = (int) (m24305b.m27640c() + ((m27640c - m24305b.m27640c()) * f));
                int m27639d2 = (int) (m24305b.m27639d() + (f * (m27639d - m24305b.m27639d())));
                for (int i = 4; i <= 16; i <<= 1) {
                    try {
                        c5445a = m24331f(m24336a, m27640c2, m27639d2, i);
                        break;
                    } catch (NotFoundException unused) {
                    }
                }
            }
            return new C7160g(m24329h(this.f15347a, m24333d(m24305b, m24304c, m24306a, c5445a, m24334c), m24334c), c5445a == null ? new C4411o[]{m24306a, m24305b, m24304c} : new C4411o[]{m24306a, m24305b, m24304c, c5445a});
        }
        throw NotFoundException.m27700a();
    }
}
