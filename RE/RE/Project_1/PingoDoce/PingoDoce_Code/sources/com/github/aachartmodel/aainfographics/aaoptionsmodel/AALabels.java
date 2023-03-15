package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType;
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AALabels.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b7\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bK\u0010LJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\rJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\fR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010 \u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R$\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0004\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R$\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010'\u001a\u0004\b7\u0010)\"\u0004\b8\u0010+R$\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010'\u001a\u0004\b9\u0010)\"\u0004\b:\u0010+R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R$\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b=\u0010\u001d\"\u0004\b>\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010'\u001a\u0004\b?\u0010)\"\u0004\b@\u0010+R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006M"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "prop", "align", "autoRotation", BuildConfig.VERSION_NAME, "autoRotationLimit", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "distance", BuildConfig.VERSION_NAME, "enabled", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", BuildConfig.VERSION_NAME, "format", "formatter", "padding", "rotation", BuildConfig.VERSION_NAME, "staggerLines", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "step", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "style", "x", "y", "useHTML", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getFormat", "()Ljava/lang/String;", "setFormat", "(Ljava/lang/String;)V", "getFormatter", "setFormatter", "Ljava/lang/Float;", "getX", "()Ljava/lang/Float;", "setX", "(Ljava/lang/Float;)V", "getAlign", "setAlign", "getPadding", "setPadding", "getAutoRotationLimit", "setAutoRotationLimit", "Ljava/lang/Integer;", "getStep", "()Ljava/lang/Integer;", "setStep", "(Ljava/lang/Integer;)V", "getRotation", "setRotation", "getY", "setY", "getStaggerLines", "setStaggerLines", "getUseHTML", "setUseHTML", "getDistance", "setDistance", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "getStyle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "setStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)V", "Ljava/lang/Object;", "getAutoRotation", "()Ljava/lang/Object;", "setAutoRotation", "(Ljava/lang/Object;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AALabels {
    private String align;
    private Object autoRotation;
    private Float autoRotationLimit;
    private Float distance;
    private Boolean enabled;
    private String format;
    private String formatter;
    private Float padding;
    private Float rotation;
    private Integer staggerLines;
    private Integer step;
    private AAStyle style;
    private Boolean useHTML;

    /* renamed from: x */
    private Float f6811x;

    /* renamed from: y */
    private Float f6812y;

    public final AALabels align(AAChartAlignType aAChartAlignType) {
        Intrinsics.isThisObjectNull(aAChartAlignType, "prop");
        this.align = aAChartAlignType.getValue();
        return this;
    }

    public final AALabels autoRotation(Object obj) {
        Intrinsics.isThisObjectNull(obj, "prop");
        this.autoRotation = obj;
        return this;
    }

    public final AALabels autoRotationLimit(Float f) {
        this.autoRotationLimit = f;
        return this;
    }

    public final AALabels distance(Float f) {
        this.distance = f;
        return this;
    }

    public final AALabels enabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }

    public final AALabels format(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.format = str;
        return this;
    }

    public final AALabels formatter(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.formatter = AAJSStringPurer.INSTANCE.pureJavaScriptFunctionString('(' + str + ')');
        return this;
    }

    public final String getAlign() {
        return this.align;
    }

    public final Object getAutoRotation() {
        return this.autoRotation;
    }

    public final Float getAutoRotationLimit() {
        return this.autoRotationLimit;
    }

    public final Float getDistance() {
        return this.distance;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getFormatter() {
        return this.formatter;
    }

    public final Float getPadding() {
        return this.padding;
    }

    public final Float getRotation() {
        return this.rotation;
    }

    public final Integer getStaggerLines() {
        return this.staggerLines;
    }

    public final Integer getStep() {
        return this.step;
    }

    public final AAStyle getStyle() {
        return this.style;
    }

    public final Boolean getUseHTML() {
        return this.useHTML;
    }

    public final Float getX() {
        return this.f6811x;
    }

    public final Float getY() {
        return this.f6812y;
    }

    public final AALabels padding(Float f) {
        this.padding = f;
        return this;
    }

    public final AALabels rotation(Float f) {
        this.rotation = f;
        return this;
    }

    public final void setAlign(String str) {
        this.align = str;
    }

    public final void setAutoRotation(Object obj) {
        this.autoRotation = obj;
    }

    public final void setAutoRotationLimit(Float f) {
        this.autoRotationLimit = f;
    }

    public final void setDistance(Float f) {
        this.distance = f;
    }

    public final void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setFormatter(String str) {
        this.formatter = str;
    }

    public final void setPadding(Float f) {
        this.padding = f;
    }

    public final void setRotation(Float f) {
        this.rotation = f;
    }

    public final void setStaggerLines(Integer num) {
        this.staggerLines = num;
    }

    public final void setStep(Integer num) {
        this.step = num;
    }

    public final void setStyle(AAStyle aAStyle) {
        this.style = aAStyle;
    }

    public final void setUseHTML(Boolean bool) {
        this.useHTML = bool;
    }

    public final void setX(Float f) {
        this.f6811x = f;
    }

    public final void setY(Float f) {
        this.f6812y = f;
    }

    public final AALabels staggerLines(Integer num) {
        this.staggerLines = num;
        return this;
    }

    public final AALabels step(Integer num) {
        this.step = num;
        return this;
    }

    public final AALabels style(AAStyle aAStyle) {
        Intrinsics.isThisObjectNull(aAStyle, "prop");
        this.style = aAStyle;
        return this;
    }

    public final AALabels useHTML(Boolean bool) {
        this.useHTML = bool;
        return this;
    }

    /* renamed from: x */
    public final AALabels m33882x(Float f) {
        this.f6811x = f;
        return this;
    }

    /* renamed from: y */
    public final AALabels m33881y(Float f) {
        this.f6812y = f;
        return this;
    }
}
