package p345s;

import p181jd.Intrinsics;

/* renamed from: s.p */
/* loaded from: classes.dex */
public final class AnimationVectors {
    /* renamed from: a */
    public static final C9962l m9474a(float f) {
        return new C9962l(f);
    }

    /* renamed from: b */
    public static final AbstractC9976o m9473b(AbstractC9976o abstractC9976o) {
        Intrinsics.isThisObjectNull(abstractC9976o, "<this>");
        AbstractC9976o m9471d = m9471d(abstractC9976o);
        int mo9485b = m9471d.mo9485b();
        for (int i = 0; i < mo9485b; i++) {
            m9471d.mo9482e(i, abstractC9976o.mo9486a(i));
        }
        return m9471d;
    }

    /* renamed from: c */
    public static final void m9472c(AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2) {
        Intrinsics.isThisObjectNull(abstractC9976o, "<this>");
        Intrinsics.isThisObjectNull(abstractC9976o2, "source");
        int mo9485b = abstractC9976o.mo9485b();
        for (int i = 0; i < mo9485b; i++) {
            abstractC9976o.mo9482e(i, abstractC9976o2.mo9486a(i));
        }
    }

    /* renamed from: d */
    public static final AbstractC9976o m9471d(AbstractC9976o abstractC9976o) {
        Intrinsics.isThisObjectNull(abstractC9976o, "<this>");
        return abstractC9976o.mo9513h();
    }
}
