package gm;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.LiveData;
import me.C7185b;

/* renamed from: gm.a */
/* loaded from: classes2.dex */
public final class C5715a {

    /* renamed from: a */
    public static final C5715a f15980a = new C5715a();

    /* renamed from: b */
    private static final C1436e0<C7185b<Boolean>> f15981b;

    /* renamed from: c */
    private static final LiveData<C7185b<Boolean>> f15982c;

    static {
        C1436e0<C7185b<Boolean>> c1436e0 = new C1436e0<>();
        f15981b = c1436e0;
        f15982c = c1436e0;
    }

    private C5715a() {
    }

    /* renamed from: a */
    public final LiveData<C7185b<Boolean>> m23281a() {
        return f15982c;
    }

    /* renamed from: b */
    public final void m23280b(boolean z) {
        f15981b.mo169m(new C7185b<>(Boolean.valueOf(z)));
    }
}
