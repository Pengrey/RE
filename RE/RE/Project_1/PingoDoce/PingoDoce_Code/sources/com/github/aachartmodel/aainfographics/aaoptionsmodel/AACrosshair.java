package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AACrosshair.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "width", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", BuildConfig.VERSION_NAME, "color", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;", "dashStyle", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;", "getDashStyle", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;", "setDashStyle", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;)V", "Ljava/lang/String;", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "Ljava/lang/Float;", "getWidth", "()Ljava/lang/Float;", "setWidth", "(Ljava/lang/Float;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AACrosshair {
    private String color;
    private AAChartLineDashStyleType dashStyle;
    private Float width;

    public final AACrosshair color(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.color = str;
        return this;
    }

    public final AACrosshair dashStyle(AAChartLineDashStyleType aAChartLineDashStyleType) {
        Intrinsics.isThisObjectNull(aAChartLineDashStyleType, "prop");
        this.dashStyle = aAChartLineDashStyleType;
        return this;
    }

    public final String getColor() {
        return this.color;
    }

    public final AAChartLineDashStyleType getDashStyle() {
        return this.dashStyle;
    }

    public final Float getWidth() {
        return this.width;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setDashStyle(AAChartLineDashStyleType aAChartLineDashStyleType) {
        this.dashStyle = aAChartLineDashStyleType;
    }

    public final void setWidth(Float f) {
        this.width = f;
    }

    public final AACrosshair width(Float f) {
        this.width = f;
        return this;
    }
}
