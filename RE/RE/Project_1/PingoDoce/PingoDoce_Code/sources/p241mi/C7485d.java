package p241mi;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.LiveData;
import me.C7185b;

/* renamed from: mi.d */
/* loaded from: classes2.dex */
public final class C7485d {

    /* renamed from: a */
    public static final C7485d f19794a = new C7485d();

    /* renamed from: b */
    private static final C1436e0<C7185b<Integer>> f19795b;

    /* renamed from: c */
    private static final LiveData<C7185b<Integer>> f19796c;

    static {
        C1436e0<C7185b<Integer>> c1436e0 = new C1436e0<>();
        f19795b = c1436e0;
        f19796c = c1436e0;
    }

    private C7485d() {
    }

    /* renamed from: a */
    public final LiveData<C7185b<Integer>> m18383a() {
        return f19796c;
    }

    /* renamed from: b */
    public final void m18382b(int i) {
        f19795b.mo169m(new C7185b<>(Integer.valueOf(i)));
    }
}
