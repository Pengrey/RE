package p345s;

import p181jd.Intrinsics;
import p345s.AbstractC9976o;
import p345s.InterfaceC10014x0;

/* compiled from: VectorizedAnimationSpec.kt */
/* renamed from: s.w0 */
/* loaded from: classes.dex */
public interface InterfaceC10011w0<V extends AbstractC9976o> extends InterfaceC10014x0 {

    /* compiled from: VectorizedAnimationSpec.kt */
    /* renamed from: s.w0$a */
    /* loaded from: classes.dex */
    public static final class C10012a {
        /* renamed from: a */
        public static long m9400a(InterfaceC10011w0 interfaceC10011w0, AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2, AbstractC9976o abstractC9976o3) {
            Intrinsics.isThisObjectNull(interfaceC10011w0, "this");
            Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
            Intrinsics.isThisObjectNull(abstractC9976o2, "targetValue");
            Intrinsics.isThisObjectNull(abstractC9976o3, "initialVelocity");
            return (interfaceC10011w0.m9402d() + interfaceC10011w0.m9401e()) * 1000000;
        }

        /* renamed from: b */
        public static AbstractC9976o m9399b(InterfaceC10011w0 interfaceC10011w0, AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2, AbstractC9976o abstractC9976o3) {
            Intrinsics.isThisObjectNull(interfaceC10011w0, "this");
            Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
            Intrinsics.isThisObjectNull(abstractC9976o2, "targetValue");
            Intrinsics.isThisObjectNull(abstractC9976o3, "initialVelocity");
            return InterfaceC10014x0.C10015a.m9396a(interfaceC10011w0, abstractC9976o, abstractC9976o2, abstractC9976o3);
        }

        /* renamed from: c */
        public static boolean m9398c(InterfaceC10011w0 interfaceC10011w0) {
            Intrinsics.isThisObjectNull(interfaceC10011w0, "this");
            return InterfaceC10014x0.C10015a.m9395b(interfaceC10011w0);
        }
    }

    /* renamed from: d */
    int m9402d();

    /* renamed from: e */
    int m9401e();
}
