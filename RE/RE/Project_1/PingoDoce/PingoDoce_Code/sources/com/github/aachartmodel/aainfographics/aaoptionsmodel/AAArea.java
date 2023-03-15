package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAPlotOptions.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAArea;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "prop", "dataLabels", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "getDataLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "setDataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAArea {
    private AADataLabels dataLabels;

    public final AAArea dataLabels(AADataLabels aADataLabels) {
        Intrinsics.isThisObjectNull(aADataLabels, "prop");
        this.dataLabels = aADataLabels;
        return this;
    }

    public final AADataLabels getDataLabels() {
        return this.dataLabels;
    }

    public final void setDataLabels(AADataLabels aADataLabels) {
        this.dataLabels = aADataLabels;
    }
}
