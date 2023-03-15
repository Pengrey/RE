package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AALegend.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\u001a"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "color", "cursor", "pointer", BuildConfig.VERSION_NAME, "fontSize", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;", "fontWeight", "Ljava/lang/String;", "getPointer", "()Ljava/lang/String;", "setPointer", "(Ljava/lang/String;)V", "getFontSize", "setFontSize", "getCursor", "setCursor", "getFontWeight", "setFontWeight", "getColor", "setColor", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAItemStyle {
    private String color;
    private String cursor;
    private String fontSize;
    private String fontWeight;
    private String pointer;

    public final AAItemStyle color(String str) {
        this.color = str;
        return this;
    }

    public final AAItemStyle cursor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.cursor = str;
        return this;
    }

    public final AAItemStyle fontSize(Float f) {
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.ifNullDoSomething(f);
        sb2.append(String.valueOf(f.floatValue()));
        sb2.append("px");
        this.fontSize = sb2.toString();
        return this;
    }

    public final AAItemStyle fontWeight(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.fontWeight = str;
        return this;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getFontSize() {
        return this.fontSize;
    }

    public final String getFontWeight() {
        return this.fontWeight;
    }

    public final String getPointer() {
        return this.pointer;
    }

    public final AAItemStyle pointer(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.pointer = str;
        return this;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setCursor(String str) {
        this.cursor = str;
    }

    public final void setFontSize(String str) {
        this.fontSize = str;
    }

    public final void setFontWeight(String str) {
        this.fontWeight = str;
    }

    public final void setPointer(String str) {
        this.pointer = str;
    }
}
