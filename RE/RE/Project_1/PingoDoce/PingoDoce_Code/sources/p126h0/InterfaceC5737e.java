package p126h0;

import id.InterfaceC6108l;
import java.util.Collection;
import java.util.List;
import p126h0.ImmutableList;
import p181jd.Intrinsics;
import p203kd.InterfaceC6651b;
import p203kd.InterfaceC6652c;

/* compiled from: ImmutableList.kt */
/* renamed from: h0.e */
/* loaded from: classes.dex */
public interface InterfaceC5737e<E> extends ImmutableList, InterfaceC5733b {

    /* compiled from: ImmutableList.kt */
    /* renamed from: h0.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC5738a<E> extends List, Collection, InterfaceC6651b, InterfaceC6652c {
        InterfaceC5737e build();
    }

    /* compiled from: ImmutableList.kt */
    /* renamed from: h0.e$b */
    /* loaded from: classes.dex */
    public static final class C5739b {
        /* renamed from: a */
        public static ImmutableList m23202a(InterfaceC5737e interfaceC5737e, int i, int i2) {
            Intrinsics.isThisObjectNull(interfaceC5737e, "this");
            return ImmutableList.C5734a.m23208a(interfaceC5737e, i, i2);
        }
    }

    InterfaceC5737e add(int i, Object obj);

    InterfaceC5737e add(Object obj);

    InterfaceC5737e addAll(Collection collection);

    /* renamed from: i */
    InterfaceC5738a m23205i();

    InterfaceC5737e remove(Object obj);

    InterfaceC5737e removeAll(Collection collection);

    InterfaceC5737e set(int i, Object obj);

    /* renamed from: w */
    InterfaceC5737e m23204w(InterfaceC6108l interfaceC6108l);

    /* renamed from: z */
    InterfaceC5737e m23203z(int i);
}
