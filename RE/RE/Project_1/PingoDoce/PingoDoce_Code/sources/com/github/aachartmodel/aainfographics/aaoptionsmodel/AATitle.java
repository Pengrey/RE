package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AATitle.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0018"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "text", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "style", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "align", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartVerticalAlignType;", "verticalAlign", BuildConfig.VERSION_NAME, "x", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "y", BuildConfig.VERSION_NAME, "userHTML", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "Ljava/lang/Float;", "Ljava/lang/String;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "Ljava/lang/Boolean;", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AATitle {
    private String align;
    private AAStyle style;
    private String text;
    private Boolean userHTML;
    private String verticalAlign;

    /* renamed from: x */
    private Float f6820x;

    /* renamed from: y */
    private Float f6821y;

    public final AATitle align(AAChartAlignType aAChartAlignType) {
        Intrinsics.isThisObjectNull(aAChartAlignType, "prop");
        this.align = aAChartAlignType.toString();
        return this;
    }

    public final AATitle style(AAStyle aAStyle) {
        this.style = aAStyle;
        return this;
    }

    public final AATitle text(String str) {
        this.text = str;
        return this;
    }

    public final AATitle userHTML(Boolean bool) {
        this.userHTML = bool;
        return this;
    }

    public final AATitle verticalAlign(AAChartVerticalAlignType aAChartVerticalAlignType) {
        Intrinsics.isThisObjectNull(aAChartVerticalAlignType, "prop");
        this.verticalAlign = aAChartVerticalAlignType.toString();
        return this;
    }

    /* renamed from: x */
    public final AATitle m33874x(Float f) {
        this.f6820x = f;
        return this;
    }

    /* renamed from: y */
    public final AATitle m33873y(Float f) {
        this.f6821y = f;
        return this;
    }
}
