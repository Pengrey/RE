package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAPlotOptions.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\r¨\u0006\u0017"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumnrange;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "borderRadius", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAColumnrange;", "borderWidth", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "dataLabels", "Ljava/lang/Float;", "getBorderWidth", "()Ljava/lang/Float;", "setBorderWidth", "(Ljava/lang/Float;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "getDataLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "setDataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)V", "getBorderRadius", "setBorderRadius", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAColumnrange {
    private Float borderRadius;
    private Float borderWidth;
    private AADataLabels dataLabels;

    public final AAColumnrange borderRadius(Float f) {
        this.borderRadius = f;
        return this;
    }

    public final AAColumnrange borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AAColumnrange dataLabels(AADataLabels aADataLabels) {
        Intrinsics.isThisObjectNull(aADataLabels, "prop");
        this.dataLabels = aADataLabels;
        return this;
    }

    public final Float getBorderRadius() {
        return this.borderRadius;
    }

    public final Float getBorderWidth() {
        return this.borderWidth;
    }

    public final AADataLabels getDataLabels() {
        return this.dataLabels;
    }

    public final void setBorderRadius(Float f) {
        this.borderRadius = f;
    }

    public final void setBorderWidth(Float f) {
        this.borderWidth = f;
    }

    public final void setDataLabels(AADataLabels aADataLabels) {
        this.dataLabels = aADataLabels;
    }
}
