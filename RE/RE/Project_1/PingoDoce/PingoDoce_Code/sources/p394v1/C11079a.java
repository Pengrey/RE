package p394v1;

import java.util.Locale;
import p181jd.Intrinsics;

/* compiled from: AndroidLocaleDelegate.android.kt */
/* renamed from: v1.a */
/* loaded from: classes.dex */
public final class C11079a implements InterfaceC11085g {

    /* renamed from: a */
    private final Locale f28475a;

    public C11079a(Locale locale) {
        Intrinsics.isThisObjectNull(locale, "javaLocale");
        this.f28475a = locale;
    }

    /* renamed from: a */
    public String mo6180a() {
        String languageTag = this.f28475a.toLanguageTag();
        Intrinsics.checkIfNull(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    /* renamed from: b */
    public final Locale m6191b() {
        return this.f28475a;
    }
}
