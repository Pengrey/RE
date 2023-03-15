package mg;

import android.text.TextUtils;

/* renamed from: mg.f */
/* loaded from: classes2.dex */
public final class C7254f {
    /* renamed from: a */
    public static final /* synthetic */ boolean m18863a(String str) {
        return m18862b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m18862b(String str) {
        return (str.length() > 0) && str.length() == 6 && TextUtils.isDigitsOnly(str);
    }
}
