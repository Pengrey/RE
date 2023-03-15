package p345s;

import java.util.Iterator;
import p181jd.Intrinsics;
import p297pd.C8611f;
import p297pd._Ranges;
import p345s.AbstractC9976o;
import p345s.InterfaceC10014x0;
import p489zc.AbstractC13762g0;

/* compiled from: VectorizedAnimationSpec.kt */
/* renamed from: s.y0 */
/* loaded from: classes.dex */
public final class C10017y0<V extends AbstractC9976o> implements InterfaceC10014x0 {

    /* renamed from: a */
    private final InterfaceC9979q f26197a;

    /* renamed from: b */
    private AbstractC9976o f26198b;

    /* renamed from: c */
    private AbstractC9976o f26199c;

    /* renamed from: d */
    private AbstractC9976o f26200d;

    /* compiled from: VectorizedAnimationSpec.kt */
    /* renamed from: s.y0$a */
    /* loaded from: classes.dex */
    public static final class C10018a implements InterfaceC9979q {

        /* renamed from: a */
        final /* synthetic */ FloatAnimationSpec f26201a;

        C10018a(FloatAnimationSpec floatAnimationSpec) {
            this.f26201a = floatAnimationSpec;
        }

        /* renamed from: get */
        public FloatAnimationSpec mo42224get(int i) {
            return this.f26201a;
        }
    }

    public C10017y0(InterfaceC9979q interfaceC9979q) {
        Intrinsics.isThisObjectNull(interfaceC9979q, "anims");
        this.f26197a = interfaceC9979q;
    }

    /* renamed from: a */
    public boolean m9394a() {
        return InterfaceC10014x0.C10015a.m9395b(this);
    }

    /* renamed from: b */
    public long m9393b(AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2, AbstractC9976o abstractC9976o3) {
        C8611f m14992q;
        Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
        Intrinsics.isThisObjectNull(abstractC9976o2, "targetValue");
        Intrinsics.isThisObjectNull(abstractC9976o3, "initialVelocity");
        m14992q = _Ranges.m14992q(0, abstractC9976o.mo9485b());
        Iterator<Integer> it = m14992q.iterator();
        long j = 0;
        while (it.hasNext()) {
            int mo404a = ((AbstractC13762g0) it).mo404a();
            j = Math.max(j, this.f26197a.mo42224get(mo404a).mo9601d(abstractC9976o.mo9486a(mo404a), abstractC9976o2.mo9486a(mo404a), abstractC9976o3.mo9486a(mo404a)));
        }
        return j;
    }

    /* renamed from: c */
    public AbstractC9976o m9392c(long j, AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2, AbstractC9976o abstractC9976o3) {
        Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
        Intrinsics.isThisObjectNull(abstractC9976o2, "targetValue");
        Intrinsics.isThisObjectNull(abstractC9976o3, "initialVelocity");
        if (this.f26198b == null) {
            this.f26198b = AnimationVectors.m9471d(abstractC9976o);
        }
        int i = 0;
        AbstractC9976o abstractC9976o4 = this.f26198b;
        if (abstractC9976o4 == null) {
            Intrinsics.throwUninitPropException("valueVector");
            abstractC9976o4 = null;
        }
        int mo9485b = abstractC9976o4.mo9485b();
        while (i < mo9485b) {
            int i2 = i + 1;
            AbstractC9976o abstractC9976o5 = this.f26198b;
            if (abstractC9976o5 == null) {
                Intrinsics.throwUninitPropException("valueVector");
                abstractC9976o5 = null;
            }
            abstractC9976o5.mo9482e(i, this.f26197a.mo42224get(i).mo9603b(j, abstractC9976o.mo9486a(i), abstractC9976o2.mo9486a(i), abstractC9976o3.mo9486a(i)));
            i = i2;
        }
        AbstractC9976o abstractC9976o6 = this.f26198b;
        if (abstractC9976o6 == null) {
            Intrinsics.throwUninitPropException("valueVector");
            return null;
        }
        return abstractC9976o6;
    }

    /* renamed from: f */
    public AbstractC9976o m9391f(long j, AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2, AbstractC9976o abstractC9976o3) {
        Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
        Intrinsics.isThisObjectNull(abstractC9976o2, "targetValue");
        Intrinsics.isThisObjectNull(abstractC9976o3, "initialVelocity");
        if (this.f26199c == null) {
            this.f26199c = AnimationVectors.m9471d(abstractC9976o3);
        }
        int i = 0;
        AbstractC9976o abstractC9976o4 = this.f26199c;
        if (abstractC9976o4 == null) {
            Intrinsics.throwUninitPropException("velocityVector");
            abstractC9976o4 = null;
        }
        int mo9485b = abstractC9976o4.mo9485b();
        while (i < mo9485b) {
            int i2 = i + 1;
            AbstractC9976o abstractC9976o5 = this.f26199c;
            if (abstractC9976o5 == null) {
                Intrinsics.throwUninitPropException("velocityVector");
                abstractC9976o5 = null;
            }
            abstractC9976o5.mo9482e(i, this.f26197a.mo42224get(i).mo9602c(j, abstractC9976o.mo9486a(i), abstractC9976o2.mo9486a(i), abstractC9976o3.mo9486a(i)));
            i = i2;
        }
        AbstractC9976o abstractC9976o6 = this.f26199c;
        if (abstractC9976o6 == null) {
            Intrinsics.throwUninitPropException("velocityVector");
            return null;
        }
        return abstractC9976o6;
    }

    /* renamed from: g */
    public AbstractC9976o m9390g(AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2, AbstractC9976o abstractC9976o3) {
        Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
        Intrinsics.isThisObjectNull(abstractC9976o2, "targetValue");
        Intrinsics.isThisObjectNull(abstractC9976o3, "initialVelocity");
        if (this.f26200d == null) {
            this.f26200d = AnimationVectors.m9471d(abstractC9976o3);
        }
        int i = 0;
        AbstractC9976o abstractC9976o4 = this.f26200d;
        if (abstractC9976o4 == null) {
            Intrinsics.throwUninitPropException("endVelocityVector");
            abstractC9976o4 = null;
        }
        int mo9485b = abstractC9976o4.mo9485b();
        while (i < mo9485b) {
            int i2 = i + 1;
            AbstractC9976o abstractC9976o5 = this.f26200d;
            if (abstractC9976o5 == null) {
                Intrinsics.throwUninitPropException("endVelocityVector");
                abstractC9976o5 = null;
            }
            abstractC9976o5.mo9482e(i, this.f26197a.mo42224get(i).mo9600e(abstractC9976o.mo9486a(i), abstractC9976o2.mo9486a(i), abstractC9976o3.mo9486a(i)));
            i = i2;
        }
        AbstractC9976o abstractC9976o6 = this.f26200d;
        if (abstractC9976o6 == null) {
            Intrinsics.throwUninitPropException("endVelocityVector");
            return null;
        }
        return abstractC9976o6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10017y0(FloatAnimationSpec floatAnimationSpec) {
        this(new C10018a(floatAnimationSpec));
        Intrinsics.isThisObjectNull(floatAnimationSpec, "anim");
    }
}
