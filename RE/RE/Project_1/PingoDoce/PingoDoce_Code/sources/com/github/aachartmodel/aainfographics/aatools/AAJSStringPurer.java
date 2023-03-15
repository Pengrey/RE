package com.github.aachartmodel.aainfographics.aatools;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import p181jd.Intrinsics;
import sd.StringsJVM;

/* compiled from: AAJSStringPurer.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aatools/AAJSStringPurer;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "JSStr", "pureJavaScriptFunctionString", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAJSStringPurer {
    public static final AAJSStringPurer INSTANCE = new AAJSStringPurer();

    private AAJSStringPurer() {
    }

    public final String pureJavaScriptFunctionString(String str) {
        String m8935y;
        String m8935y2;
        String m8935y3;
        String m8935y4;
        String m8935y5;
        String m8935y6;
        String m8935y7;
        String m8935y8;
        String m8935y9;
        String m8935y10;
        Intrinsics.isThisObjectNull(str, "JSStr");
        m8935y = StringsJVM.m8935y(str, "'", "\"", false, 4, null);
        m8935y2 = StringsJVM.m8935y(m8935y, "\u0000", BuildConfig.VERSION_NAME, false, 4, null);
        m8935y3 = StringsJVM.m8935y(m8935y2, "\n", BuildConfig.VERSION_NAME, false, 4, null);
        m8935y4 = StringsJVM.m8935y(m8935y3, "\\", "\\\\", false, 4, null);
        m8935y5 = StringsJVM.m8935y(m8935y4, "\"", "\\\"", false, 4, null);
        m8935y6 = StringsJVM.m8935y(m8935y5, "'", "\\'", false, 4, null);
        m8935y7 = StringsJVM.m8935y(m8935y6, "\n", "\\n", false, 4, null);
        m8935y8 = StringsJVM.m8935y(m8935y7, "\r", "\\r", false, 4, null);
        m8935y9 = StringsJVM.m8935y(m8935y8, "\u2028", "\\u2028", false, 4, null);
        m8935y10 = StringsJVM.m8935y(m8935y9, "\u2029", "\\u2029", false, 4, null);
        return m8935y10;
    }
}
