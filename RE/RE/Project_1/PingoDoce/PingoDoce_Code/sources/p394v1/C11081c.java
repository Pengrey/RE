package p394v1;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p181jd.Intrinsics;

/* compiled from: AndroidLocaleDelegate.android.kt */
/* renamed from: v1.c */
/* loaded from: classes.dex */
public final class C11081c implements InterfaceC11086h {
    /* renamed from: a */
    public List mo6179a() {
        LocaleList localeList = LocaleList.getDefault();
        Intrinsics.checkIfNull(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Locale locale = localeList.get(i);
            Intrinsics.checkIfNull(locale, "localeList[i]");
            arrayList.add(new C11079a(locale));
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: b */
    public InterfaceC11085g mo6178b(String str) {
        Intrinsics.isThisObjectNull(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        Intrinsics.checkIfNull(forLanguageTag, "forLanguageTag(languageTag)");
        return new C11079a(forLanguageTag);
    }
}
