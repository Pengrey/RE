package p356sf;

import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Okio.kt */
/* renamed from: sf.v */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10202v {
    /* renamed from: a */
    public static final InterfaceC10189f0 m8547a() {
        return new Okio();
    }

    /* renamed from: b */
    public static final InterfaceC10186d m8546b(InterfaceC10189f0 interfaceC10189f0) {
        Intrinsics.isThisObjectNull(interfaceC10189f0, "<this>");
        return new RealBufferedSink(interfaceC10189f0);
    }

    /* renamed from: c */
    public static final InterfaceC10187e m8545c(InterfaceC10191h0 interfaceC10191h0) {
        Intrinsics.isThisObjectNull(interfaceC10191h0, "<this>");
        return new RealBufferedSource(interfaceC10191h0);
    }
}
