package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAPlotOptions.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b-\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\tJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u0015\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010&\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010!\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u0004\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00104\u001a\u0004\b9\u00106\"\u0004\b:\u00108R$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010!\u001a\u0004\b;\u0010#\"\u0004\b<\u0010%R$\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010!\u001a\u0004\b=\u0010#\"\u0004\b>\u0010%¨\u0006A"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartType;", "prop", "type", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "dataLabels", BuildConfig.VERSION_NAME, "size", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", BuildConfig.VERSION_NAME, "allowPointSelect", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", BuildConfig.VERSION_NAME, "cursor", "showInLegend", "startAngle", "endAngle", "depth", "center", BuildConfig.VERSION_NAME, "data", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPie;", "Ljava/lang/Object;", "getCenter", "()Ljava/lang/Object;", "setCenter", "(Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getData", "()[Ljava/lang/Object;", "setData", "([Ljava/lang/Object;)V", "Ljava/lang/Float;", "getDepth", "()Ljava/lang/Float;", "setDepth", "(Ljava/lang/Float;)V", "Ljava/lang/Boolean;", "getAllowPointSelect", "()Ljava/lang/Boolean;", "setAllowPointSelect", "(Ljava/lang/Boolean;)V", "getShowInLegend", "setShowInLegend", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "getDataLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "setDataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)V", "getSize", "setSize", "Ljava/lang/String;", "getCursor", "()Ljava/lang/String;", "setCursor", "(Ljava/lang/String;)V", "getType", "setType", "getEndAngle", "setEndAngle", "getStartAngle", "setStartAngle", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAPie {
    private Boolean allowPointSelect;
    private Object center;
    private String cursor;
    private Object[] data;
    private AADataLabels dataLabels;
    private Float depth;
    private Float endAngle;
    private Boolean showInLegend;
    private Float size;
    private Float startAngle;
    private String type;

    public final AAPie allowPointSelect(Boolean bool) {
        this.allowPointSelect = bool;
        return this;
    }

    public final AAPie center(Object obj) {
        this.center = obj;
        return this;
    }

    public final AAPie cursor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.cursor = str;
        return this;
    }

    public final AAPie data(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "prop");
        this.data = objArr;
        return this;
    }

    public final AAPie dataLabels(AADataLabels aADataLabels) {
        Intrinsics.isThisObjectNull(aADataLabels, "prop");
        this.dataLabels = aADataLabels;
        return this;
    }

    public final AAPie depth(Float f) {
        this.depth = f;
        return this;
    }

    public final AAPie endAngle(Float f) {
        this.endAngle = f;
        return this;
    }

    public final Boolean getAllowPointSelect() {
        return this.allowPointSelect;
    }

    public final Object getCenter() {
        return this.center;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Object[] getData() {
        return this.data;
    }

    public final AADataLabels getDataLabels() {
        return this.dataLabels;
    }

    public final Float getDepth() {
        return this.depth;
    }

    public final Float getEndAngle() {
        return this.endAngle;
    }

    public final Boolean getShowInLegend() {
        return this.showInLegend;
    }

    public final Float getSize() {
        return this.size;
    }

    public final Float getStartAngle() {
        return this.startAngle;
    }

    public final String getType() {
        return this.type;
    }

    public final void setAllowPointSelect(Boolean bool) {
        this.allowPointSelect = bool;
    }

    public final void setCenter(Object obj) {
        this.center = obj;
    }

    public final void setCursor(String str) {
        this.cursor = str;
    }

    public final void setData(Object[] objArr) {
        this.data = objArr;
    }

    public final void setDataLabels(AADataLabels aADataLabels) {
        this.dataLabels = aADataLabels;
    }

    public final void setDepth(Float f) {
        this.depth = f;
    }

    public final void setEndAngle(Float f) {
        this.endAngle = f;
    }

    public final void setShowInLegend(Boolean bool) {
        this.showInLegend = bool;
    }

    public final void setSize(Float f) {
        this.size = f;
    }

    public final void setStartAngle(Float f) {
        this.startAngle = f;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final AAPie showInLegend(Boolean bool) {
        this.showInLegend = bool;
        return this;
    }

    public final AAPie size(Float f) {
        this.size = f;
        return this;
    }

    public final AAPie startAngle(Float f) {
        this.startAngle = f;
        return this;
    }

    public final AAPie type(AAChartType aAChartType) {
        this.type = aAChartType != null ? aAChartType.getValue() : null;
        return this;
    }
}
