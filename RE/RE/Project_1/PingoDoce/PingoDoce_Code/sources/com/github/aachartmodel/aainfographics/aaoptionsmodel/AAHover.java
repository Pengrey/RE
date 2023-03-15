package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AAStates.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\tR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "borderColor", BuildConfig.VERSION_NAME, "brightness", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", "color", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "halo", "Ljava/lang/String;", "getBorderColor", "()Ljava/lang/String;", "setBorderColor", "(Ljava/lang/String;)V", "getColor", "setColor", "Ljava/lang/Float;", "getBrightness", "()Ljava/lang/Float;", "setBrightness", "(Ljava/lang/Float;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "getHalo", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "setHalo", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAHover {
    private String borderColor;
    private Float brightness;
    private String color;
    private AAHalo halo;

    public final AAHover borderColor(String str) {
        this.borderColor = str;
        return this;
    }

    public final AAHover brightness(Float f) {
        this.brightness = f;
        return this;
    }

    public final AAHover color(String str) {
        this.color = str;
        return this;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Float getBrightness() {
        return this.brightness;
    }

    public final String getColor() {
        return this.color;
    }

    public final AAHalo getHalo() {
        return this.halo;
    }

    public final AAHover halo(AAHalo aAHalo) {
        this.halo = aAHalo;
        return this;
    }

    public final void setBorderColor(String str) {
        this.borderColor = str;
    }

    public final void setBrightness(Float f) {
        this.brightness = f;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setHalo(AAHalo aAHalo) {
        this.halo = aAHalo;
    }
}
