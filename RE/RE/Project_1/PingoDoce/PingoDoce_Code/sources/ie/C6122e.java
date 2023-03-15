package ie;

import androidx.recyclerview.widget.C1601h;
import androidx.recyclerview.widget.RecyclerView;
import id.InterfaceC6112p;
import java.util.List;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: DiffUtilAsyncBindableAdapter.kt */
/* renamed from: ie.e */
/* loaded from: classes2.dex */
public final class C6122e {

    /* compiled from: DiffUtilAsyncBindableAdapter.kt */
    /* renamed from: ie.e$a */
    /* loaded from: classes2.dex */
    public static final class C6123a extends C1601h.AbstractC1603b {

        /* renamed from: a */
        final /* synthetic */ List f16808a;

        /* renamed from: b */
        final /* synthetic */ List f16809b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC6112p f16810c;

        C6123a(List list, List list2, InterfaceC6112p interfaceC6112p) {
            this.f16808a = list;
            this.f16809b = list2;
            this.f16810c = interfaceC6112p;
        }

        /* renamed from: a */
        public boolean mo36050a(int i, int i2) {
            try {
                return Intrinsics.equals(this.f16808a.get(i), this.f16809b.get(i2));
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: b */
        public boolean mo36049b(int i, int i2) {
            try {
                return ((Boolean) this.f16810c.mo39856d(this.f16808a.get(i), this.f16809b.get(i2))).booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: c */
        public Object mo36048c(int i, int i2) {
            try {
                return new C6120c(this.f16808a.get(i), this.f16809b.get(i2));
            } catch (Exception unused) {
                return C13195u.f34156a;
            }
        }

        /* renamed from: d */
        public int mo36047d() {
            return this.f16809b.size();
        }

        /* renamed from: e */
        public int mo36046e() {
            return this.f16808a.size();
        }
    }

    /* renamed from: a */
    public static final C1601h.C1604c m22146a(RecyclerView.AbstractC1535g abstractC1535g, List list, List list2, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(abstractC1535g, "<this>");
        Intrinsics.isThisObjectNull(list, "old");
        Intrinsics.isThisObjectNull(list2, "new");
        Intrinsics.isThisObjectNull(interfaceC6112p, "compare");
        C1601h.C1604c m36054a = C1601h.m36054a(new C6123a(list, list2, interfaceC6112p));
        Intrinsics.checkIfNull(m36054a, "old: List<T>,\n    new: L…ption) {\n        }\n    })");
        return m36054a;
    }
}
