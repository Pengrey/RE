package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AALegend.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0006\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010#\u001a\u0004\b-\u0010%\"\u0004\b.\u0010'R$\u0010/\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R$\u0010\u0004\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010(\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R$\u0010\b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010(\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,¨\u0006<"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLayoutType;", "prop", "layout", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "align", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartVerticalAlignType;", "verticalAlign", BuildConfig.VERSION_NAME, "enabled", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", BuildConfig.VERSION_NAME, "borderColor", BuildConfig.VERSION_NAME, "BorderWidth", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "itemMarginTop", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;", "itemStyle", "x", "y", "floating", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;", "getItemStyle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;", "setItemStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAItemStyle;)V", "Ljava/lang/Boolean;", "getFloating", "()Ljava/lang/Boolean;", "setFloating", "(Ljava/lang/Boolean;)V", "getEnabled", "setEnabled", "Ljava/lang/Float;", "getY", "()Ljava/lang/Float;", "setY", "(Ljava/lang/Float;)V", "Ljava/lang/String;", "getAlign", "()Ljava/lang/String;", "setAlign", "(Ljava/lang/String;)V", "getItemMarginTop", "setItemMarginTop", "borderWidth", "getBorderWidth", "setBorderWidth", "getX", "setX", "getLayout", "setLayout", "getVerticalAlign", "setVerticalAlign", "getBorderColor", "setBorderColor", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AALegend {
    private String align;
    private String borderColor;
    private Float borderWidth;
    private Boolean enabled;
    private Boolean floating;
    private Float itemMarginTop;
    private AAItemStyle itemStyle;
    private String layout;
    private String verticalAlign;

    /* renamed from: x */
    private Float f6813x;

    /* renamed from: y */
    private Float f6814y;

    public final AALegend BorderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AALegend align(AAChartAlignType aAChartAlignType) {
        Intrinsics.isThisObjectNull(aAChartAlignType, "prop");
        this.align = aAChartAlignType.getValue();
        return this;
    }

    public final AALegend borderColor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.borderColor = str;
        return this;
    }

    public final AALegend enabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }

    public final AALegend floating(boolean z) {
        this.floating = Boolean.valueOf(z);
        return this;
    }

    public final String getAlign() {
        return this.align;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Float getBorderWidth() {
        return this.borderWidth;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Boolean getFloating() {
        return this.floating;
    }

    public final Float getItemMarginTop() {
        return this.itemMarginTop;
    }

    public final AAItemStyle getItemStyle() {
        return this.itemStyle;
    }

    public final String getLayout() {
        return this.layout;
    }

    public final String getVerticalAlign() {
        return this.verticalAlign;
    }

    public final Float getX() {
        return this.f6813x;
    }

    public final Float getY() {
        return this.f6814y;
    }

    public final AALegend itemMarginTop(Float f) {
        this.itemMarginTop = f;
        return this;
    }

    public final AALegend itemStyle(AAItemStyle aAItemStyle) {
        Intrinsics.isThisObjectNull(aAItemStyle, "prop");
        this.itemStyle = aAItemStyle;
        return this;
    }

    public final AALegend layout(AAChartLayoutType aAChartLayoutType) {
        Intrinsics.isThisObjectNull(aAChartLayoutType, "prop");
        this.layout = aAChartLayoutType.getValue();
        return this;
    }

    public final void setAlign(String str) {
        this.align = str;
    }

    public final void setBorderColor(String str) {
        this.borderColor = str;
    }

    public final void setBorderWidth(Float f) {
        this.borderWidth = f;
    }

    public final void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public final void setFloating(Boolean bool) {
        this.floating = bool;
    }

    public final void setItemMarginTop(Float f) {
        this.itemMarginTop = f;
    }

    public final void setItemStyle(AAItemStyle aAItemStyle) {
        this.itemStyle = aAItemStyle;
    }

    public final void setLayout(String str) {
        this.layout = str;
    }

    public final void setVerticalAlign(String str) {
        this.verticalAlign = str;
    }

    public final void setX(Float f) {
        this.f6813x = f;
    }

    public final void setY(Float f) {
        this.f6814y = f;
    }

    public final AALegend verticalAlign(AAChartVerticalAlignType aAChartVerticalAlignType) {
        Intrinsics.isThisObjectNull(aAChartVerticalAlignType, "prop");
        this.verticalAlign = aAChartVerticalAlignType.getValue();
        return this;
    }

    /* renamed from: x */
    public final AALegend m33880x(Float f) {
        this.f6813x = f;
        return this;
    }

    /* renamed from: y */
    public final AALegend m33879y(Float f) {
        this.f6814y = f;
        return this;
    }
}
