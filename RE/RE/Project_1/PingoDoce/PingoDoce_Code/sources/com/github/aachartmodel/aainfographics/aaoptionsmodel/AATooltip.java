package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AATooltip.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b5\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bG\u0010HJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R$\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b-\u0010!\"\u0004\b.\u0010#R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R$\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010$\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b3\u0010!\"\u0004\b4\u0010#R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b<\u0010\u001c\"\u0004\b=\u0010\u001eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\bC\u0010!\"\u0004\bD\u0010#R$\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010$\u001a\u0004\bE\u0010&\"\u0004\bF\u0010(¨\u0006I"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "backgroundColor", "borderColor", BuildConfig.VERSION_NAME, "borderRadius", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "borderWidth", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "style", BuildConfig.VERSION_NAME, "enabled", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "useHTML", "formatter", "headerFormat", "pointFormat", "footerFormat", BuildConfig.VERSION_NAME, "valueDecimals", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "shared", "shadow", "valueSuffix", "Ljava/lang/Float;", "getBorderRadius", "()Ljava/lang/Float;", "setBorderRadius", "(Ljava/lang/Float;)V", "Ljava/lang/String;", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "getValueSuffix", "setValueSuffix", "getShadow", "setShadow", "getFormatter", "setFormatter", "getFooterFormat", "setFooterFormat", "getShared", "setShared", "getPointFormat", "setPointFormat", "getHeaderFormat", "setHeaderFormat", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "getStyle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "setStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)V", "getBorderWidth", "setBorderWidth", "Ljava/lang/Integer;", "getValueDecimals", "()Ljava/lang/Integer;", "setValueDecimals", "(Ljava/lang/Integer;)V", "getBorderColor", "setBorderColor", "getUseHTML", "setUseHTML", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AATooltip {
    private String backgroundColor;
    private String borderColor;
    private Float borderRadius;
    private Float borderWidth;
    private Boolean enabled;
    private String footerFormat;
    private String formatter;
    private String headerFormat;
    private String pointFormat;
    private Boolean shadow;
    private Boolean shared;
    private AAStyle style;
    private Boolean useHTML;
    private Integer valueDecimals;
    private String valueSuffix;

    public AATooltip() {
        Boolean bool = Boolean.TRUE;
        this.shared = bool;
        this.enabled = bool;
        this.shadow = bool;
    }

    public final AATooltip backgroundColor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.backgroundColor = str;
        return this;
    }

    public final AATooltip borderColor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.borderColor = str;
        return this;
    }

    public final AATooltip borderRadius(Float f) {
        this.borderRadius = f;
        return this;
    }

    public final AATooltip borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AATooltip enabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }

    public final AATooltip footerFormat(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.footerFormat = str;
        return this;
    }

    public final AATooltip formatter(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.formatter = AAJSStringPurer.INSTANCE.pureJavaScriptFunctionString('(' + str + ')');
        return this;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Float getBorderRadius() {
        return this.borderRadius;
    }

    public final Float getBorderWidth() {
        return this.borderWidth;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getFooterFormat() {
        return this.footerFormat;
    }

    public final String getFormatter() {
        return this.formatter;
    }

    public final String getHeaderFormat() {
        return this.headerFormat;
    }

    public final String getPointFormat() {
        return this.pointFormat;
    }

    public final Boolean getShadow() {
        return this.shadow;
    }

    public final Boolean getShared() {
        return this.shared;
    }

    public final AAStyle getStyle() {
        return this.style;
    }

    public final Boolean getUseHTML() {
        return this.useHTML;
    }

    public final Integer getValueDecimals() {
        return this.valueDecimals;
    }

    public final String getValueSuffix() {
        return this.valueSuffix;
    }

    public final AATooltip headerFormat(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.headerFormat = str;
        return this;
    }

    public final AATooltip pointFormat(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.pointFormat = str;
        return this;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setBorderColor(String str) {
        this.borderColor = str;
    }

    public final void setBorderRadius(Float f) {
        this.borderRadius = f;
    }

    public final void setBorderWidth(Float f) {
        this.borderWidth = f;
    }

    public final void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public final void setFooterFormat(String str) {
        this.footerFormat = str;
    }

    public final void setFormatter(String str) {
        this.formatter = str;
    }

    public final void setHeaderFormat(String str) {
        this.headerFormat = str;
    }

    public final void setPointFormat(String str) {
        this.pointFormat = str;
    }

    public final void setShadow(Boolean bool) {
        this.shadow = bool;
    }

    public final void setShared(Boolean bool) {
        this.shared = bool;
    }

    public final void setStyle(AAStyle aAStyle) {
        this.style = aAStyle;
    }

    public final void setUseHTML(Boolean bool) {
        this.useHTML = bool;
    }

    public final void setValueDecimals(Integer num) {
        this.valueDecimals = num;
    }

    public final void setValueSuffix(String str) {
        this.valueSuffix = str;
    }

    public final AATooltip shadow(Boolean bool) {
        this.shadow = bool;
        return this;
    }

    public final AATooltip shared(Boolean bool) {
        this.shared = bool;
        return this;
    }

    public final AATooltip style(AAStyle aAStyle) {
        Intrinsics.isThisObjectNull(aAStyle, "prop");
        this.style = aAStyle;
        return this;
    }

    public final AATooltip useHTML(Boolean bool) {
        this.useHTML = bool;
        return this;
    }

    public final AATooltip valueDecimals(Integer num) {
        this.valueDecimals = num;
        return this;
    }

    public final AATooltip valueSuffix(String str) {
        this.valueSuffix = str;
        return this;
    }
}
