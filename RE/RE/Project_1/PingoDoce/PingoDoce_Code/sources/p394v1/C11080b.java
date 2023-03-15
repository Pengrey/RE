package p394v1;

import java.util.List;
import java.util.Locale;
import p181jd.Intrinsics;
import p489zc.CollectionsJVM;

/* compiled from: AndroidLocaleDelegate.android.kt */
/* renamed from: v1.b */
/* loaded from: classes.dex */
public final class C11080b implements InterfaceC11086h {
    /* renamed from: a */
    public List mo6179a() {
        List m202b;
        Locale locale = Locale.getDefault();
        Intrinsics.checkIfNull(locale, "getDefault()");
        m202b = CollectionsJVM.m202b(new C11079a(locale));
        return m202b;
    }

    /* renamed from: b */
    public InterfaceC11085g mo6178b(String str) {
        Intrinsics.isThisObjectNull(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        Intrinsics.checkIfNull(forLanguageTag, "forLanguageTag(languageTag)");
        return new C11079a(forLanguageTag);
    }
}
