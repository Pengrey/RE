package p073e2;

import java.util.ArrayList;
import java.util.Arrays;
import p094f2.C5335i;
import p094f2.C5343o;

/* renamed from: e2.i */
/* loaded from: classes.dex */
public class C4973i extends C4966e implements InterfaceC4972h {

    /* renamed from: p0 */
    public C4966e[] f13901p0 = new C4966e[4];

    /* renamed from: q0 */
    public int f13902q0 = 0;

    @Override // p073e2.InterfaceC4972h
    /* renamed from: a */
    public void mo25995a(C4969f c4969f) {
    }

    /* renamed from: a1 */
    public void m26001a1(ArrayList<C5343o> arrayList, int i, C5343o c5343o) {
        for (int i2 = 0; i2 < this.f13902q0; i2++) {
            c5343o.m24575a(this.f13901p0[i2]);
        }
        for (int i3 = 0; i3 < this.f13902q0; i3++) {
            C5335i.m24588a(this.f13901p0[i3], i, arrayList, c5343o);
        }
    }

    @Override // p073e2.InterfaceC4972h
    /* renamed from: b */
    public void mo26000b(C4966e c4966e) {
        if (c4966e == this || c4966e == null) {
            return;
        }
        int i = this.f13902q0 + 1;
        C4966e[] c4966eArr = this.f13901p0;
        if (i > c4966eArr.length) {
            this.f13901p0 = (C4966e[]) Arrays.copyOf(c4966eArr, c4966eArr.length * 2);
        }
        C4966e[] c4966eArr2 = this.f13901p0;
        int i2 = this.f13902q0;
        c4966eArr2[i2] = c4966e;
        this.f13902q0 = i2 + 1;
    }

    /* renamed from: b1 */
    public int m25999b1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f13902q0; i4++) {
            C4966e c4966e = this.f13901p0[i4];
            if (i == 0 && (i3 = c4966e.f13858m0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = c4966e.f13860n0) != -1) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p073e2.InterfaceC4972h
    /* renamed from: c */
    public void mo25998c() {
        this.f13902q0 = 0;
        Arrays.fill(this.f13901p0, (Object) null);
    }
}
