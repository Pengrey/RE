package p374u1;

import p181jd.Intrinsics;
import p286p1.AnnotatedString;
import p286p1.C8393w;

/* compiled from: TextFieldValue.kt */
/* renamed from: u1.t */
/* loaded from: classes.dex */
public final class C10808t {
    /* renamed from: a */
    public static final AnnotatedString m6997a(TextFieldValue textFieldValue) {
        Intrinsics.isThisObjectNull(textFieldValue, "<this>");
        return textFieldValue.m7003a().m15768i(textFieldValue.m7001c());
    }

    /* renamed from: b */
    public static final AnnotatedString m6996b(TextFieldValue textFieldValue, int i) {
        Intrinsics.isThisObjectNull(textFieldValue, "<this>");
        return textFieldValue.m7003a().m15769h(C8393w.m15537h(textFieldValue.m7001c()), Math.min(C8393w.m15537h(textFieldValue.m7001c()) + i, textFieldValue.m7000d().length()));
    }

    /* renamed from: c */
    public static final AnnotatedString m6995c(TextFieldValue textFieldValue, int i) {
        Intrinsics.isThisObjectNull(textFieldValue, "<this>");
        return textFieldValue.m7003a().m15769h(Math.max(0, C8393w.m15536i(textFieldValue.m7001c()) - i), C8393w.m15536i(textFieldValue.m7001c()));
    }
}
