package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AAMarker.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerStates;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerHover;", "prop", "hover", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerHover;", "getHover", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerHover;", "setHover", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerHover;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAMarkerStates {
    private AAMarkerHover hover;

    public final AAMarkerHover getHover() {
        return this.hover;
    }

    public final AAMarkerStates hover(AAMarkerHover aAMarkerHover) {
        this.hover = aAMarkerHover;
        return this;
    }

    public final void setHover(AAMarkerHover aAMarkerHover) {
        this.hover = aAMarkerHover;
    }
}
