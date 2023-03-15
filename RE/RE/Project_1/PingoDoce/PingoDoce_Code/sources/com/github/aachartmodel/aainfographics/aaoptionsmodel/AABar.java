package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAPlotOptions.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b0\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bA\u0010BJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR$\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u0010\u001cR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!R$\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R$\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u0010\u001cR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010!¨\u0006C"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABar;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "name", BuildConfig.VERSION_NAME, "data", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABar;", "color", BuildConfig.VERSION_NAME, "grouping", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABar;", BuildConfig.VERSION_NAME, "pointPadding", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABar;", "pointPlacement", "groupPadding", "borderWidth", "colorByPoint", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "dataLabels", "stacking", "borderRadius", "yAxis", "Ljava/lang/Float;", "getGroupPadding", "()Ljava/lang/Float;", "setGroupPadding", "(Ljava/lang/Float;)V", "Ljava/lang/String;", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "getDataLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "setDataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)V", "[Ljava/lang/Object;", "getData", "()[Ljava/lang/Object;", "setData", "([Ljava/lang/Object;)V", "Ljava/lang/Boolean;", "getGrouping", "()Ljava/lang/Boolean;", "setGrouping", "(Ljava/lang/Boolean;)V", "getPointPlacement", "setPointPlacement", "getPointPadding", "setPointPadding", "getBorderWidth", "setBorderWidth", "getBorderRadius", "setBorderRadius", "getStacking", "setStacking", "getColorByPoint", "setColorByPoint", "getYAxis", "setYAxis", "getName", "setName", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AABar {
    private Float borderRadius;
    private Float borderWidth;
    private String color;
    private Boolean colorByPoint;
    private Object[] data;
    private AADataLabels dataLabels;
    private Float groupPadding;
    private Boolean grouping;
    private String name;
    private Float pointPadding;
    private Float pointPlacement;
    private String stacking;
    private Float yAxis;

    public final AABar borderRadius(Float f) {
        this.borderRadius = f;
        return this;
    }

    public final AABar borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AABar color(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.color = str;
        return this;
    }

    public final AABar colorByPoint(Boolean bool) {
        this.colorByPoint = bool;
        return this;
    }

    public final AABar data(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "prop");
        this.data = objArr;
        return this;
    }

    public final AABar dataLabels(AADataLabels aADataLabels) {
        Intrinsics.isThisObjectNull(aADataLabels, "prop");
        this.dataLabels = aADataLabels;
        return this;
    }

    public final Float getBorderRadius() {
        return this.borderRadius;
    }

    public final Float getBorderWidth() {
        return this.borderWidth;
    }

    public final String getColor() {
        return this.color;
    }

    public final Boolean getColorByPoint() {
        return this.colorByPoint;
    }

    public final Object[] getData() {
        return this.data;
    }

    public final AADataLabels getDataLabels() {
        return this.dataLabels;
    }

    public final Float getGroupPadding() {
        return this.groupPadding;
    }

    public final Boolean getGrouping() {
        return this.grouping;
    }

    public final String getName() {
        return this.name;
    }

    public final Float getPointPadding() {
        return this.pointPadding;
    }

    public final Float getPointPlacement() {
        return this.pointPlacement;
    }

    public final String getStacking() {
        return this.stacking;
    }

    public final Float getYAxis() {
        return this.yAxis;
    }

    public final AABar groupPadding(Float f) {
        this.groupPadding = f;
        return this;
    }

    public final AABar grouping(Boolean bool) {
        this.grouping = bool;
        return this;
    }

    public final AABar name(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.name = str;
        return this;
    }

    public final AABar pointPadding(Float f) {
        this.pointPadding = f;
        return this;
    }

    public final AABar pointPlacement(Float f) {
        this.pointPlacement = f;
        return this;
    }

    public final void setBorderRadius(Float f) {
        this.borderRadius = f;
    }

    public final void setBorderWidth(Float f) {
        this.borderWidth = f;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setColorByPoint(Boolean bool) {
        this.colorByPoint = bool;
    }

    public final void setData(Object[] objArr) {
        this.data = objArr;
    }

    public final void setDataLabels(AADataLabels aADataLabels) {
        this.dataLabels = aADataLabels;
    }

    public final void setGroupPadding(Float f) {
        this.groupPadding = f;
    }

    public final void setGrouping(Boolean bool) {
        this.grouping = bool;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPointPadding(Float f) {
        this.pointPadding = f;
    }

    public final void setPointPlacement(Float f) {
        this.pointPlacement = f;
    }

    public final void setStacking(String str) {
        this.stacking = str;
    }

    public final void setYAxis(Float f) {
        this.yAxis = f;
    }

    public final AABar stacking(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.stacking = str;
        return this;
    }

    public final AABar yAxis(Float f) {
        this.yAxis = f;
        return this;
    }
}
