package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAPlotBandsElement.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0018"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "from", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "to", "color", BuildConfig.VERSION_NAME, "borderColor", "borderWidth", "className", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabel;", "label", BuildConfig.VERSION_NAME, "index", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "Ljava/lang/Integer;", "Ljava/lang/Float;", "Ljava/lang/Object;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabel;", "Ljava/lang/String;", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAPlotBandsElement {
    private String borderColor;
    private Float borderWidth;
    private String className;
    private Object color;
    private Float from;
    private Integer index;
    private AALabel label;

    /* renamed from: to */
    private Float f6815to;

    public final AAPlotBandsElement borderColor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.borderColor = str;
        return this;
    }

    public final AAPlotBandsElement borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AAPlotBandsElement className(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.className = str;
        return this;
    }

    public final AAPlotBandsElement color(Object obj) {
        Intrinsics.isThisObjectNull(obj, "prop");
        this.color = obj;
        return this;
    }

    public final AAPlotBandsElement from(Float f) {
        this.from = f;
        return this;
    }

    public final AAPlotBandsElement index(Integer num) {
        this.index = num;
        return this;
    }

    public final AAPlotBandsElement label(AALabel aALabel) {
        Intrinsics.isThisObjectNull(aALabel, "prop");
        this.label = aALabel;
        return this;
    }

    /* renamed from: to */
    public final AAPlotBandsElement m33878to(Float f) {
        this.f6815to = f;
        return this;
    }
}
