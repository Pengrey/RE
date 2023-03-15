package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType;
import kotlin.Metadata;

/* compiled from: AAAnimation.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0007\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "duration", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAnimationType;", "easing", "Ljava/lang/Integer;", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", BuildConfig.VERSION_NAME, "Ljava/lang/String;", "getEasing", "()Ljava/lang/String;", "setEasing", "(Ljava/lang/String;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAAnimation {
    private Integer duration;
    private String easing;

    public final AAAnimation duration(Integer num) {
        this.duration = num;
        return this;
    }

    public final AAAnimation easing(AAChartAnimationType aAChartAnimationType) {
        this.easing = aAChartAnimationType != null ? aAChartAnimationType.getValue() : null;
        return this;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getEasing() {
        return this.easing;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setEasing(String str) {
        this.easing = str;
    }
}
