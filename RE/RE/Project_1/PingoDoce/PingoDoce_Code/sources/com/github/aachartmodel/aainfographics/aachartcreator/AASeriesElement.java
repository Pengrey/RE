package com.github.aachartmodel.aainfographics.aachartcreator;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AASeriesElement.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\bJ\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010$J\u0010\u0010'\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010&J\u0010\u0010(\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0017\u0010*\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b*\u0010\u0007J\u0017\u0010+\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010!¢\u0006\u0004\b+\u0010#J\u001b\u0010,\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b,\u0010\fJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010-J\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\bJ\u0010\u00101\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u000100J\u0017\u00102\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b2\u0010\u0007J\u0017\u00103\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b3\u0010\u0007J\u0017\u00104\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b4\u0010\u0007R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00106R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00106R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00107R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00108R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00109R\u0018\u0010(\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00106R\u0018\u00104\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010:R\u0018\u0010+\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00109R\u0018\u00103\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010:R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00105R\u0018\u0010*\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010:R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010;R\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00105R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00105R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00106R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00106R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00106R\u0018\u00102\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010:R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010<R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u00105R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00107R\u0018\u0010/\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00105R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010=R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010:R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00106R\u0018\u0010)\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00106R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00107R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010>R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00106R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00106R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00106¨\u0006A"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "prop", "type", BuildConfig.VERSION_NAME, "allowPointSelect", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", BuildConfig.VERSION_NAME, "name", BuildConfig.VERSION_NAME, "data", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", BuildConfig.VERSION_NAME, "lineWidth", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "borderColor", "borderWidth", "borderRadius", "borderRadiusTopLeft", "borderRadiusTopRight", "borderRadiusBottomLeft", "borderRadiusBottomRight", "color", "fillColor", "fillOpacity", "threshold", "negativeColor", "negativeFillColor", "size", "innerSize", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartLineDashStyleType;", "dashStyle", BuildConfig.VERSION_NAME, "yAxis", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "dataLabels", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "marker", "step", "states", "colorByPoint", "zIndex", "zones", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "shadow", "stack", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "tooltip", "showInLegend", "enableMouseTracking", "reversed", "Ljava/lang/String;", "Ljava/lang/Object;", "Ljava/lang/Float;", "[Ljava/lang/Object;", "Ljava/lang/Integer;", "Ljava/lang/Boolean;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AASeriesElement {
    private Boolean allowPointSelect;
    private String borderColor;
    private Float borderRadius;
    private Object borderRadiusBottomLeft;
    private Object borderRadiusBottomRight;
    private Object borderRadiusTopLeft;
    private Object borderRadiusTopRight;
    private Float borderWidth;
    private Object color;
    private Boolean colorByPoint;
    private String dashStyle;
    private Object[] data;
    private AADataLabels dataLabels;
    private Boolean enableMouseTracking;
    private Object fillColor;
    private Float fillOpacity;
    private Object innerSize;
    private Float lineWidth;
    private AAMarker marker;
    private String name;
    private String negativeColor;
    private Object negativeFillColor;
    private Boolean reversed;
    private AAShadow shadow;
    private Boolean showInLegend;
    private Object size;
    private String stack;
    private Object states;
    private Object step;
    private Float threshold;
    private AATooltip tooltip;
    private String type;
    private Integer yAxis;
    private Integer zIndex;
    private Object[] zones;

    public final AASeriesElement allowPointSelect(Boolean bool) {
        this.allowPointSelect = bool;
        return this;
    }

    public final AASeriesElement borderColor(String str) {
        this.borderColor = str;
        return this;
    }

    public final AASeriesElement borderRadius(Float f) {
        this.borderRadius = f;
        return this;
    }

    public final AASeriesElement borderRadiusBottomLeft(Object obj) {
        this.borderRadiusBottomLeft = obj;
        return this;
    }

    public final AASeriesElement borderRadiusBottomRight(Object obj) {
        this.borderRadiusBottomRight = obj;
        return this;
    }

    public final AASeriesElement borderRadiusTopLeft(Object obj) {
        this.borderRadiusTopLeft = obj;
        return this;
    }

    public final AASeriesElement borderRadiusTopRight(Object obj) {
        this.borderRadiusTopRight = obj;
        return this;
    }

    public final AASeriesElement borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AASeriesElement color(Object obj) {
        this.color = obj;
        return this;
    }

    public final AASeriesElement colorByPoint(Boolean bool) {
        this.colorByPoint = bool;
        return this;
    }

    public final AASeriesElement dashStyle(AAChartLineDashStyleType aAChartLineDashStyleType) {
        this.dashStyle = aAChartLineDashStyleType != null ? aAChartLineDashStyleType.getValue() : null;
        return this;
    }

    public final AASeriesElement data(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "prop");
        this.data = objArr;
        return this;
    }

    public final AASeriesElement dataLabels(AADataLabels aADataLabels) {
        this.dataLabels = aADataLabels;
        return this;
    }

    public final AASeriesElement enableMouseTracking(Boolean bool) {
        this.enableMouseTracking = bool;
        return this;
    }

    public final AASeriesElement fillColor(Object obj) {
        this.fillColor = obj;
        return this;
    }

    public final AASeriesElement fillOpacity(Float f) {
        this.fillOpacity = f;
        return this;
    }

    public final AASeriesElement innerSize(Object obj) {
        this.innerSize = obj;
        return this;
    }

    public final AASeriesElement lineWidth(Float f) {
        this.lineWidth = f;
        return this;
    }

    public final AASeriesElement marker(AAMarker aAMarker) {
        this.marker = aAMarker;
        return this;
    }

    public final AASeriesElement name(String str) {
        this.name = str;
        return this;
    }

    public final AASeriesElement negativeColor(String str) {
        this.negativeColor = str;
        return this;
    }

    public final AASeriesElement negativeFillColor(Object obj) {
        this.negativeFillColor = obj;
        return this;
    }

    public final AASeriesElement reversed(Boolean bool) {
        this.reversed = bool;
        return this;
    }

    public final AASeriesElement shadow(AAShadow aAShadow) {
        this.shadow = aAShadow;
        return this;
    }

    public final AASeriesElement showInLegend(Boolean bool) {
        this.showInLegend = bool;
        return this;
    }

    public final AASeriesElement size(Object obj) {
        this.size = obj;
        return this;
    }

    public final AASeriesElement stack(String str) {
        this.stack = str;
        return this;
    }

    public final AASeriesElement states(Object obj) {
        this.states = obj;
        return this;
    }

    public final AASeriesElement step(Object obj) {
        this.step = obj;
        return this;
    }

    public final AASeriesElement threshold(Float f) {
        this.threshold = f;
        return this;
    }

    public final AASeriesElement tooltip(AATooltip aATooltip) {
        this.tooltip = aATooltip;
        return this;
    }

    public final AASeriesElement type(AAChartType aAChartType) {
        this.type = aAChartType != null ? aAChartType.getValue() : null;
        return this;
    }

    public final AASeriesElement yAxis(Integer num) {
        this.yAxis = num;
        return this;
    }

    public final AASeriesElement zIndex(Integer num) {
        this.zIndex = num;
        return this;
    }

    public final AASeriesElement zones(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "prop");
        this.zones = objArr;
        return this;
    }
}
