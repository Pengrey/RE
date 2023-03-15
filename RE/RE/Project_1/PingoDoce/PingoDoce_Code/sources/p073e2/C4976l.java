package p073e2;

import java.util.ArrayList;
import p053d2.C4710c;

/* renamed from: e2.l */
/* loaded from: classes.dex */
public class C4976l extends C4966e {

    /* renamed from: p0 */
    public ArrayList<C4966e> f13905p0 = new ArrayList<>();

    /* renamed from: a1 */
    public ArrayList<C4966e> m25992a1() {
        return this.f13905p0;
    }

    /* renamed from: b */
    public void m25991b(C4966e c4966e) {
        this.f13905p0.add(c4966e);
        if (c4966e.m26124I() != null) {
            ((C4976l) c4966e.m26124I()).m25989c1(c4966e);
        }
        c4966e.m26115M0(this);
    }

    /* renamed from: b1 */
    public void mo25990b1() {
        ArrayList<C4966e> arrayList = this.f13905p0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4966e c4966e = this.f13905p0.get(i);
            if (c4966e instanceof C4976l) {
                ((C4976l) c4966e).mo25990b1();
            }
        }
    }

    /* renamed from: c1 */
    public void m25989c1(C4966e c4966e) {
        this.f13905p0.remove(c4966e);
        c4966e.mo25987h0();
    }

    /* renamed from: d1 */
    public void m25988d1() {
        this.f13905p0.clear();
    }

    @Override // p073e2.C4966e
    /* renamed from: h0 */
    public void mo25987h0() {
        this.f13905p0.clear();
        super.mo25987h0();
    }

    @Override // p073e2.C4966e
    /* renamed from: j0 */
    public void mo25986j0(C4710c c4710c) {
        super.mo25986j0(c4710c);
        int size = this.f13905p0.size();
        for (int i = 0; i < size; i++) {
            this.f13905p0.get(i).mo25986j0(c4710c);
        }
    }
}
