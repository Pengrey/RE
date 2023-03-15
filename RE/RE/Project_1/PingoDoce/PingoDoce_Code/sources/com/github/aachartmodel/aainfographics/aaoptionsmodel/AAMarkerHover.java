package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AAMarker.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R$\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013¨\u0006("}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerHover;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "enabled", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerHover;", BuildConfig.VERSION_NAME, "fillColor", "lineColor", BuildConfig.VERSION_NAME, "lineWidth", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerHover;", "lineWidthPlus", "radius", "radiusPlus", "Ljava/lang/Float;", "getLineWidthPlus", "()Ljava/lang/Float;", "setLineWidthPlus", "(Ljava/lang/Float;)V", "Ljava/lang/String;", "getLineColor", "()Ljava/lang/String;", "setLineColor", "(Ljava/lang/String;)V", "getRadiusPlus", "setRadiusPlus", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "getLineWidth", "setLineWidth", "getFillColor", "setFillColor", "getRadius", "setRadius", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAMarkerHover {
    private Boolean enabled;
    private String fillColor;
    private String lineColor;
    private Float lineWidth;
    private Float lineWidthPlus;
    private Float radius;
    private Float radiusPlus;

    public final AAMarkerHover enabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }

    public final AAMarkerHover fillColor(String str) {
        this.fillColor = str;
        return this;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getFillColor() {
        return this.fillColor;
    }

    public final String getLineColor() {
        return this.lineColor;
    }

    public final Float getLineWidth() {
        return this.lineWidth;
    }

    public final Float getLineWidthPlus() {
        return this.lineWidthPlus;
    }

    public final Float getRadius() {
        return this.radius;
    }

    public final Float getRadiusPlus() {
        return this.radiusPlus;
    }

    public final AAMarkerHover lineColor(String str) {
        this.lineColor = str;
        return this;
    }

    public final AAMarkerHover lineWidth(Float f) {
        this.lineWidth = f;
        return this;
    }

    public final AAMarkerHover lineWidthPlus(Float f) {
        this.lineWidthPlus = f;
        return this;
    }

    public final AAMarkerHover radius(Float f) {
        this.radius = f;
        return this;
    }

    public final AAMarkerHover radiusPlus(Float f) {
        this.radiusPlus = f;
        return this;
    }

    public final void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public final void setFillColor(String str) {
        this.fillColor = str;
    }

    public final void setLineColor(String str) {
        this.lineColor = str;
    }

    public final void setLineWidth(Float f) {
        this.lineWidth = f;
    }

    public final void setLineWidthPlus(Float f) {
        this.lineWidthPlus = f;
    }

    public final void setRadius(Float f) {
        this.radius = f;
    }

    public final void setRadiusPlus(Float f) {
        this.radiusPlus = f;
    }
}
