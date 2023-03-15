package com.github.aachartmodel.aainfographics.aatools;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AAColor.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a(\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\t"}, m20207d2 = {BuildConfig.VERSION_NAME, "red", "green", "blue", BuildConfig.VERSION_NAME, "alpha", BuildConfig.VERSION_NAME, "AARgba", "AARgb", "charts_release"}, m20206k = 2, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAColorKt {
    public static final String AARgb(int i, int i2, int i3, float f) {
        return AARgba(i, i2, i3, 1.0f);
    }

    public static /* synthetic */ String AARgb$default(int i, int i2, int i3, float f, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            f = 1.0f;
        }
        return AARgb(i, i2, i3, f);
    }

    public static final String AARgba(int i, int i2, int i3, float f) {
        return "rgba(" + i + ',' + i2 + ',' + i3 + ',' + f + ')';
    }

    public static /* synthetic */ String AARgba$default(int i, int i2, int i3, float f, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            f = 1.0f;
        }
        return AARgba(i, i2, i3, f);
    }
}
