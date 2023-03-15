package com.github.aachartmodel.aainfographics.aachartcreator;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AAChartModel.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartSymbolType;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Circle", "Square", "Diamond", "Triangle", "TriangleDown", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public enum AAChartSymbolType {
    Circle("circle"),
    Square("square"),
    Diamond("diamond"),
    Triangle("triangle"),
    TriangleDown("triangle-down");
    
    private final String value;

    AAChartSymbolType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
