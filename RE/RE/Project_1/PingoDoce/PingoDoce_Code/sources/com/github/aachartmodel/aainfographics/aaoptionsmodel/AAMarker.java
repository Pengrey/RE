package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAMarker.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u000bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001b¨\u0006'"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "radius", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", BuildConfig.VERSION_NAME, "symbol", "fillColor", "lineWidth", "lineColor", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerStates;", "states", "Ljava/lang/Float;", "getRadius", "()Ljava/lang/Float;", "setRadius", "(Ljava/lang/Float;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerStates;", "getStates", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerStates;", "setStates", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarkerStates;)V", "Ljava/lang/String;", "getFillColor", "()Ljava/lang/String;", "setFillColor", "(Ljava/lang/String;)V", "getLineWidth", "setLineWidth", "Ljava/lang/Object;", "getLineColor", "()Ljava/lang/Object;", "setLineColor", "(Ljava/lang/Object;)V", "getSymbol", "setSymbol", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAMarker {
    private String fillColor;
    private Object lineColor;
    private Float lineWidth;
    private Float radius;
    private AAMarkerStates states;
    private String symbol;

    public final AAMarker fillColor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.fillColor = str;
        return this;
    }

    public final String getFillColor() {
        return this.fillColor;
    }

    public final Object getLineColor() {
        return this.lineColor;
    }

    public final Float getLineWidth() {
        return this.lineWidth;
    }

    public final Float getRadius() {
        return this.radius;
    }

    public final AAMarkerStates getStates() {
        return this.states;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final AAMarker lineColor(Object obj) {
        this.lineColor = obj;
        return this;
    }

    public final AAMarker lineWidth(Float f) {
        this.lineWidth = f;
        return this;
    }

    public final AAMarker radius(Float f) {
        this.radius = f;
        return this;
    }

    public final void setFillColor(String str) {
        this.fillColor = str;
    }

    public final void setLineColor(Object obj) {
        this.lineColor = obj;
    }

    public final void setLineWidth(Float f) {
        this.lineWidth = f;
    }

    public final void setRadius(Float f) {
        this.radius = f;
    }

    public final void setStates(AAMarkerStates aAMarkerStates) {
        this.states = aAMarkerStates;
    }

    public final void setSymbol(String str) {
        this.symbol = str;
    }

    public final AAMarker states(AAMarkerStates aAMarkerStates) {
        Intrinsics.isThisObjectNull(aAMarkerStates, "prop");
        this.states = aAMarkerStates;
        return this;
    }

    public final AAMarker symbol(String str) {
        this.symbol = str;
        return this;
    }
}
