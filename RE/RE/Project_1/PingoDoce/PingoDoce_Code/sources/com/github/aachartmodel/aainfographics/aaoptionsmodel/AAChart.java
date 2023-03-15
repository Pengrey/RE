package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAChart.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bS\u0010TJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006J\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001J\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0011J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u001cR$\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R$\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R$\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0004\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b1\u0010%\"\u0004\b2\u0010'R$\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010,\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010,\u001a\u0004\b:\u0010.\"\u0004\b;\u00100R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00103\u001a\u0004\b<\u00105\"\u0004\b=\u00107R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00103\u001a\u0004\bH\u00105\"\u0004\bI\u00107R$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010#\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010'R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00103\u001a\u0004\bL\u00105\"\u0004\bM\u00107R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006U"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "prop", "type", "backgroundColor", BuildConfig.VERSION_NAME, "plotBackgroundImage", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartZoomType;", "pinchType", BuildConfig.VERSION_NAME, "panning", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "panKey", "polar", "animation", "inverted", BuildConfig.VERSION_NAME, "marginLeft", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "marginRight", BuildConfig.VERSION_NAME, "margin", "([Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "marginTop", "marginBottom", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "scrollablePlotArea", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAResetZoomButton;", "resetZoomButton", "Ljava/lang/Object;", "getAnimation", "()Ljava/lang/Object;", "setAnimation", "(Ljava/lang/Object;)V", "Ljava/lang/String;", "getPlotBackgroundImage", "()Ljava/lang/String;", "setPlotBackgroundImage", "(Ljava/lang/String;)V", "getPanKey", "setPanKey", "getBackgroundColor", "setBackgroundColor", "Ljava/lang/Boolean;", "getPolar", "()Ljava/lang/Boolean;", "setPolar", "(Ljava/lang/Boolean;)V", "getType", "setType", "Ljava/lang/Float;", "getMarginRight", "()Ljava/lang/Float;", "setMarginRight", "(Ljava/lang/Float;)V", "getInverted", "setInverted", "getPanning", "setPanning", "getMarginTop", "setMarginTop", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "getScrollablePlotArea", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "setScrollablePlotArea", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;)V", "[Ljava/lang/Float;", "getMargin", "()[Ljava/lang/Float;", "setMargin", "([Ljava/lang/Float;)V", "getMarginBottom", "setMarginBottom", "getPinchType", "setPinchType", "getMarginLeft", "setMarginLeft", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAResetZoomButton;", "getResetZoomButton", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAResetZoomButton;", "setResetZoomButton", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAResetZoomButton;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAChart {
    private Object animation;
    private Object backgroundColor;
    private Boolean inverted;
    private Float[] margin;
    private Float marginBottom;
    private Float marginLeft;
    private Float marginRight;
    private Float marginTop;
    private String panKey;
    private Boolean panning;
    private String pinchType;
    private String plotBackgroundImage;
    private Boolean polar;
    private AAResetZoomButton resetZoomButton;
    private AAScrollablePlotArea scrollablePlotArea;
    private String type;

    public final AAChart animation(Object obj) {
        Intrinsics.isThisObjectNull(obj, "prop");
        this.animation = obj;
        return this;
    }

    public final AAChart backgroundColor(Object obj) {
        this.backgroundColor = obj;
        return this;
    }

    public final Object getAnimation() {
        return this.animation;
    }

    public final Object getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Boolean getInverted() {
        return this.inverted;
    }

    public final Float[] getMargin() {
        return this.margin;
    }

    public final Float getMarginBottom() {
        return this.marginBottom;
    }

    public final Float getMarginLeft() {
        return this.marginLeft;
    }

    public final Float getMarginRight() {
        return this.marginRight;
    }

    public final Float getMarginTop() {
        return this.marginTop;
    }

    public final String getPanKey() {
        return this.panKey;
    }

    public final Boolean getPanning() {
        return this.panning;
    }

    public final String getPinchType() {
        return this.pinchType;
    }

    public final String getPlotBackgroundImage() {
        return this.plotBackgroundImage;
    }

    public final Boolean getPolar() {
        return this.polar;
    }

    public final AAResetZoomButton getResetZoomButton() {
        return this.resetZoomButton;
    }

    public final AAScrollablePlotArea getScrollablePlotArea() {
        return this.scrollablePlotArea;
    }

    public final String getType() {
        return this.type;
    }

    public final AAChart inverted(Boolean bool) {
        this.inverted = bool;
        return this;
    }

    public final AAChart margin(Float[] fArr) {
        this.margin = fArr;
        return this;
    }

    public final AAChart marginBottom(float f) {
        this.marginBottom = Float.valueOf(f);
        return this;
    }

    public final AAChart marginLeft(Float f) {
        this.marginLeft = f;
        return this;
    }

    public final AAChart marginRight(Float f) {
        this.marginRight = f;
        return this;
    }

    public final AAChart marginTop(float f) {
        this.marginTop = Float.valueOf(f);
        return this;
    }

    public final AAChart panKey(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.panKey = str;
        return this;
    }

    public final AAChart panning(Boolean bool) {
        this.panning = bool;
        return this;
    }

    public final AAChart pinchType(AAChartZoomType aAChartZoomType) {
        this.pinchType = aAChartZoomType != null ? aAChartZoomType.getValue() : null;
        return this;
    }

    public final AAChart plotBackgroundImage(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.plotBackgroundImage = str;
        return this;
    }

    public final AAChart polar(Boolean bool) {
        this.polar = bool;
        return this;
    }

    public final AAChart resetZoomButton(AAResetZoomButton aAResetZoomButton) {
        Intrinsics.isThisObjectNull(aAResetZoomButton, "prop");
        this.resetZoomButton = aAResetZoomButton;
        return this;
    }

    public final AAChart scrollablePlotArea(AAScrollablePlotArea aAScrollablePlotArea) {
        this.scrollablePlotArea = aAScrollablePlotArea;
        return this;
    }

    public final void setAnimation(Object obj) {
        this.animation = obj;
    }

    public final void setBackgroundColor(Object obj) {
        this.backgroundColor = obj;
    }

    public final void setInverted(Boolean bool) {
        this.inverted = bool;
    }

    public final void setMargin(Float[] fArr) {
        this.margin = fArr;
    }

    public final void setMarginBottom(Float f) {
        this.marginBottom = f;
    }

    public final void setMarginLeft(Float f) {
        this.marginLeft = f;
    }

    public final void setMarginRight(Float f) {
        this.marginRight = f;
    }

    public final void setMarginTop(Float f) {
        this.marginTop = f;
    }

    public final void setPanKey(String str) {
        this.panKey = str;
    }

    public final void setPanning(Boolean bool) {
        this.panning = bool;
    }

    public final void setPinchType(String str) {
        this.pinchType = str;
    }

    public final void setPlotBackgroundImage(String str) {
        this.plotBackgroundImage = str;
    }

    public final void setPolar(Boolean bool) {
        this.polar = bool;
    }

    public final void setResetZoomButton(AAResetZoomButton aAResetZoomButton) {
        this.resetZoomButton = aAResetZoomButton;
    }

    public final void setScrollablePlotArea(AAScrollablePlotArea aAScrollablePlotArea) {
        this.scrollablePlotArea = aAScrollablePlotArea;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final AAChart type(AAChartType aAChartType) {
        this.type = aAChartType != null ? aAChartType.getValue() : null;
        return this;
    }

    public final AAChart marginLeft(float f) {
        this.marginLeft = Float.valueOf(f);
        return this;
    }

    public final AAChart marginRight(float f) {
        this.marginRight = Float.valueOf(f);
        return this;
    }
}
