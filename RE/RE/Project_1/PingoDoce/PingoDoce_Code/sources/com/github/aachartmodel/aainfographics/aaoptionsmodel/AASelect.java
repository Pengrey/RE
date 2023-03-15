package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AAStates.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006\u0016"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASelect;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "borderColor", "color", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "halo", "Ljava/lang/String;", "getBorderColor", "()Ljava/lang/String;", "setBorderColor", "(Ljava/lang/String;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "getHalo", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "setHalo", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;)V", "getColor", "setColor", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AASelect {
    private String borderColor;
    private String color;
    private AAHalo halo;

    public final AASelect borderColor(String str) {
        this.borderColor = str;
        return this;
    }

    public final AASelect color(String str) {
        this.color = str;
        return this;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final String getColor() {
        return this.color;
    }

    public final AAHalo getHalo() {
        return this.halo;
    }

    public final AASelect halo(AAHalo aAHalo) {
        this.halo = aAHalo;
        return this;
    }

    public final void setBorderColor(String str) {
        this.borderColor = str;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setHalo(AAHalo aAHalo) {
        this.halo = aAHalo;
    }
}
