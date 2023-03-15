package com.google.android.gms.common.util;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.util.d */
/* loaded from: classes.dex */
public class C2633d {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = BuildConfig.DEBUG)
    /* renamed from: a */
    public static boolean m32992a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
