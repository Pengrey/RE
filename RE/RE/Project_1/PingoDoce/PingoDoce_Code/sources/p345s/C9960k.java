package p345s;

import p181jd.C6432f;
import p181jd.Intrinsics;

/* compiled from: AnimationState.kt */
/* renamed from: s.k */
/* loaded from: classes.dex */
public final class C9960k {
    /* renamed from: a */
    public static final C9954j m9531a(float f, float f2, long j, long j2, boolean z) {
        return new C9954j(C9983s0.m9455b(C6432f.f17524a), Float.valueOf(f), AnimationVectors.m9474a(f2), j, j2, z);
    }

    /* renamed from: b */
    public static /* synthetic */ C9954j m9530b(float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        long j3 = (i & 4) != 0 ? Long.MIN_VALUE : j;
        long j4 = (i & 8) == 0 ? j2 : Long.MIN_VALUE;
        if ((i & 16) != 0) {
            z = false;
        }
        return m9531a(f, f2, j3, j4, z);
    }

    /* renamed from: c */
    public static final C9954j m9529c(C9954j c9954j, Object obj, AbstractC9976o abstractC9976o, long j, long j2, boolean z) {
        Intrinsics.isThisObjectNull(c9954j, "<this>");
        return new C9954j(c9954j.m9552f(), obj, abstractC9976o, j, j2, z);
    }

    /* renamed from: d */
    public static /* synthetic */ C9954j m9528d(C9954j c9954j, Object obj, AbstractC9976o abstractC9976o, long j, long j2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = c9954j.getValue();
        }
        if ((i & 2) != 0) {
            abstractC9976o = AnimationVectors.m9473b(c9954j.m9551g());
        }
        AbstractC9976o abstractC9976o2 = abstractC9976o;
        if ((i & 4) != 0) {
            j = c9954j.m9553e();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = c9954j.m9554b();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = c9954j.m9550h();
        }
        return m9529c(c9954j, obj, abstractC9976o2, j3, j4, z);
    }

    /* renamed from: e */
    public static final AbstractC9976o m9527e(InterfaceC9980q0 interfaceC9980q0, Object obj) {
        Intrinsics.isThisObjectNull(interfaceC9980q0, "<this>");
        return AnimationVectors.m9471d((AbstractC9976o) interfaceC9980q0.mo9468a().mo9587d(obj));
    }
}
