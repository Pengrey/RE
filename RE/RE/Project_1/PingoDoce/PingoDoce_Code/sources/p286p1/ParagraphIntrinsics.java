package p286p1;

import java.util.List;
import p181jd.Intrinsics;
import p359t1.InterfaceC10362d;
import p412w1.C11540e;
import p479z1.Density;

/* renamed from: p1.l */
/* loaded from: classes.dex */
public final class ParagraphIntrinsics {
    /* renamed from: a */
    public static final InterfaceC8348k m15682a(String str, TextStyle textStyle, List list, List list2, Density density, InterfaceC10362d.InterfaceC10363a interfaceC10363a) {
        Intrinsics.isThisObjectNull(str, "text");
        Intrinsics.isThisObjectNull(textStyle, "style");
        Intrinsics.isThisObjectNull(list, "spanStyles");
        Intrinsics.isThisObjectNull(list2, "placeholders");
        Intrinsics.isThisObjectNull(density, "density");
        Intrinsics.isThisObjectNull(interfaceC10363a, "resourceLoader");
        return C11540e.m4767a(str, textStyle, list, list2, density, interfaceC10363a);
    }
}
