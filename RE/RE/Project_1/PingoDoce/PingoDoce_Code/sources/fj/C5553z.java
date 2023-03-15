package fj;

import androidx.lifecycle.C1459l0;
import ke.InterfaceC6657b;
import p423wc.C11615d;
import p445xc.InterfaceC12341a;
import pt.pingodoce.app.presentation.common.search.SearchViewModel;

/* renamed from: fj.z */
/* loaded from: classes2.dex */
public final class C5553z implements InterfaceC6657b {

    /* renamed from: a */
    private final C5552y f15724a;

    C5553z(C5552y c5552y) {
        this.f15724a = c5552y;
    }

    /* renamed from: c */
    public static InterfaceC12341a<Object> m23740c(C5552y c5552y) {
        return C11615d.m4594a(new C5553z(c5552y));
    }

    @Override // ke.InterfaceC6657b
    /* renamed from: b */
    public SearchViewModel mo14a(C1459l0 c1459l0) {
        return this.f15724a.m23743b(c1459l0);
    }
}
