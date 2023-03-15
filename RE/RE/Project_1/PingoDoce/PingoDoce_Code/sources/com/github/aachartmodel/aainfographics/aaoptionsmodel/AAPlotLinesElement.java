package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAPlotLinesElement.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0017"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", BuildConfig.VERSION_NAME, "prop", "color", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;", "dashStyle", BuildConfig.VERSION_NAME, "width", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "value", BuildConfig.VERSION_NAME, "zIndex", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabel;", "label", BuildConfig.VERSION_NAME, "Ljava/lang/String;", "Ljava/lang/Float;", "Ljava/lang/Object;", "Ljava/lang/Integer;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabel;", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAPlotLinesElement {
    private Object color;
    private String dashStyle;
    private AALabel label;
    private Float value;
    private Float width;
    private Integer zIndex;

    public final AAPlotLinesElement color(Object obj) {
        Intrinsics.isThisObjectNull(obj, "prop");
        this.color = obj;
        return this;
    }

    public final AAPlotLinesElement dashStyle(AAChartLineDashStyleType aAChartLineDashStyleType) {
        Intrinsics.isThisObjectNull(aAChartLineDashStyleType, "prop");
        this.dashStyle = aAChartLineDashStyleType.getValue();
        return this;
    }

    public final AAPlotLinesElement label(AALabel aALabel) {
        Intrinsics.isThisObjectNull(aALabel, "prop");
        this.label = aALabel;
        return this;
    }

    public final AAPlotLinesElement value(Float f) {
        this.value = f;
        return this;
    }

    public final AAPlotLinesElement width(Float f) {
        this.width = f;
        return this;
    }

    public final AAPlotLinesElement zIndex(Integer num) {
        this.zIndex = num;
        return this;
    }
}
