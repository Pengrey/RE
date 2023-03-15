package p345s;

import p181jd.Intrinsics;
import p345s.AbstractC9976o;

/* compiled from: DecayAnimationSpec.kt */
/* renamed from: s.z0 */
/* loaded from: classes.dex */
final class C10021z0<V extends AbstractC9976o> implements InterfaceC10010v0 {

    /* renamed from: a */
    private final InterfaceC9941c0 f26205a;

    /* renamed from: b */
    private AbstractC9976o f26206b;

    /* renamed from: c */
    private AbstractC9976o f26207c;

    /* renamed from: d */
    private AbstractC9976o f26208d;

    /* renamed from: e */
    private final float f26209e;

    public C10021z0(InterfaceC9941c0 interfaceC9941c0) {
        Intrinsics.isThisObjectNull(interfaceC9941c0, "floatDecaySpec");
        this.f26205a = interfaceC9941c0;
        this.f26209e = interfaceC9941c0.mo9609a();
    }

    /* renamed from: a */
    public float mo9408a() {
        return this.f26209e;
    }

    /* renamed from: b */
    public long mo9407b(AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2) {
        Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
        Intrinsics.isThisObjectNull(abstractC9976o2, "initialVelocity");
        if (this.f26207c == null) {
            this.f26207c = AnimationVectors.m9471d(abstractC9976o);
        }
        AbstractC9976o abstractC9976o3 = this.f26207c;
        if (abstractC9976o3 == null) {
            Intrinsics.throwUninitPropException("velocityVector");
            abstractC9976o3 = null;
        }
        int mo9485b = abstractC9976o3.mo9485b();
        long j = 0;
        for (int i = 0; i < mo9485b; i++) {
            j = Math.max(j, this.f26205a.mo9607c(abstractC9976o.mo9486a(i), abstractC9976o2.mo9486a(i)));
        }
        return j;
    }

    /* renamed from: c */
    public AbstractC9976o mo9406c(long j, AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2) {
        Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
        Intrinsics.isThisObjectNull(abstractC9976o2, "initialVelocity");
        if (this.f26207c == null) {
            this.f26207c = AnimationVectors.m9471d(abstractC9976o);
        }
        int i = 0;
        AbstractC9976o abstractC9976o3 = this.f26207c;
        if (abstractC9976o3 == null) {
            Intrinsics.throwUninitPropException("velocityVector");
            abstractC9976o3 = null;
        }
        int mo9485b = abstractC9976o3.mo9485b();
        while (i < mo9485b) {
            int i2 = i + 1;
            AbstractC9976o abstractC9976o4 = this.f26207c;
            if (abstractC9976o4 == null) {
                Intrinsics.throwUninitPropException("velocityVector");
                abstractC9976o4 = null;
            }
            abstractC9976o4.mo9482e(i, this.f26205a.mo9608b(j, abstractC9976o.mo9486a(i), abstractC9976o2.mo9486a(i)));
            i = i2;
        }
        AbstractC9976o abstractC9976o5 = this.f26207c;
        if (abstractC9976o5 == null) {
            Intrinsics.throwUninitPropException("velocityVector");
            return null;
        }
        return abstractC9976o5;
    }

    /* renamed from: d */
    public AbstractC9976o mo9405d(AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2) {
        Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
        Intrinsics.isThisObjectNull(abstractC9976o2, "initialVelocity");
        if (this.f26208d == null) {
            this.f26208d = AnimationVectors.m9471d(abstractC9976o);
        }
        int i = 0;
        AbstractC9976o abstractC9976o3 = this.f26208d;
        if (abstractC9976o3 == null) {
            Intrinsics.throwUninitPropException("targetVector");
            abstractC9976o3 = null;
        }
        int mo9485b = abstractC9976o3.mo9485b();
        while (i < mo9485b) {
            int i2 = i + 1;
            AbstractC9976o abstractC9976o4 = this.f26208d;
            if (abstractC9976o4 == null) {
                Intrinsics.throwUninitPropException("targetVector");
                abstractC9976o4 = null;
            }
            abstractC9976o4.mo9482e(i, this.f26205a.mo9606d(abstractC9976o.mo9486a(i), abstractC9976o2.mo9486a(i)));
            i = i2;
        }
        AbstractC9976o abstractC9976o5 = this.f26208d;
        if (abstractC9976o5 == null) {
            Intrinsics.throwUninitPropException("targetVector");
            return null;
        }
        return abstractC9976o5;
    }

    /* renamed from: e */
    public AbstractC9976o mo9404e(long j, AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2) {
        Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
        Intrinsics.isThisObjectNull(abstractC9976o2, "initialVelocity");
        if (this.f26206b == null) {
            this.f26206b = AnimationVectors.m9471d(abstractC9976o);
        }
        int i = 0;
        AbstractC9976o abstractC9976o3 = this.f26206b;
        if (abstractC9976o3 == null) {
            Intrinsics.throwUninitPropException("valueVector");
            abstractC9976o3 = null;
        }
        int mo9485b = abstractC9976o3.mo9485b();
        while (i < mo9485b) {
            int i2 = i + 1;
            AbstractC9976o abstractC9976o4 = this.f26206b;
            if (abstractC9976o4 == null) {
                Intrinsics.throwUninitPropException("valueVector");
                abstractC9976o4 = null;
            }
            abstractC9976o4.mo9482e(i, this.f26205a.mo9605e(j, abstractC9976o.mo9486a(i), abstractC9976o2.mo9486a(i)));
            i = i2;
        }
        AbstractC9976o abstractC9976o5 = this.f26206b;
        if (abstractC9976o5 == null) {
            Intrinsics.throwUninitPropException("valueVector");
            return null;
        }
        return abstractC9976o5;
    }
}
