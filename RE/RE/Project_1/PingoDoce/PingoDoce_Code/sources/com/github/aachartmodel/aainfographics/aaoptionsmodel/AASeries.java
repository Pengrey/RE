package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType;
import java.util.Map;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AASeries.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bB\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b^\u0010_J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0011J\u001b\u0010\u0014\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001b\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001aJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001eR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R,\u0010\u001b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00104\u001a\u0004\b>\u00106\"\u0004\b?\u00108R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010/\u001a\u0004\b@\u00101\"\u0004\bA\u00103R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00109\u001a\u0004\bG\u0010;\"\u0004\bH\u0010=R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010*\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R$\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00109\u001a\u0004\bK\u0010;\"\u0004\bL\u0010=R$\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00109\u001a\u0004\bM\u0010;\"\u0004\bN\u0010=R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006`"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "borderColor", BuildConfig.VERSION_NAME, "borderWidth", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "borderRadius", "borderRadiusTopLeft", "borderRadiusTopRight", "borderRadiusBottomLeft", "borderRadiusBottomRight", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "marker", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartStackingType;", "stacking", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "animation", BuildConfig.VERSION_NAME, "keys", "([Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", BuildConfig.VERSION_NAME, "colorByPoint", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASeries;", "connectNulls", BuildConfig.VERSION_NAME, "events", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "shadow", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "dataLabels", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "getMarker", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "setMarker", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;)V", "Ljava/util/Map;", "getEvents", "()Ljava/util/Map;", "setEvents", "(Ljava/util/Map;)V", "Ljava/lang/String;", "getBorderColor", "()Ljava/lang/String;", "setBorderColor", "(Ljava/lang/String;)V", "Ljava/lang/Float;", "getBorderRadius", "()Ljava/lang/Float;", "setBorderRadius", "(Ljava/lang/Float;)V", "Ljava/lang/Boolean;", "getConnectNulls", "()Ljava/lang/Boolean;", "setConnectNulls", "(Ljava/lang/Boolean;)V", "Ljava/lang/Object;", "getBorderRadiusTopRight", "()Ljava/lang/Object;", "setBorderRadiusTopRight", "(Ljava/lang/Object;)V", "getColorByPoint", "setColorByPoint", "getBorderWidth", "setBorderWidth", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "getShadow", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;", "setShadow", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAShadow;)V", "getBorderRadiusTopLeft", "setBorderRadiusTopLeft", "getStacking", "setStacking", "getBorderRadiusBottomLeft", "setBorderRadiusBottomLeft", "getBorderRadiusBottomRight", "setBorderRadiusBottomRight", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "getAnimation", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;", "setAnimation", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAAnimation;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "getDataLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "setDataLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;)V", "[Ljava/lang/String;", "getKeys", "()[Ljava/lang/String;", "setKeys", "([Ljava/lang/String;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AASeries {
    private AAAnimation animation;
    private String borderColor;
    private Float borderRadius;
    private Object borderRadiusBottomLeft;
    private Object borderRadiusBottomRight;
    private Object borderRadiusTopLeft;
    private Object borderRadiusTopRight;
    private Float borderWidth;
    private Boolean colorByPoint;
    private Boolean connectNulls;
    private AADataLabels dataLabels;
    private Map events;
    private String[] keys;
    private AAMarker marker;
    private com.github.aachartmodel.aainfographics.aachartcreator.AAShadow shadow;
    private String stacking;

    public final AASeries animation(AAAnimation aAAnimation) {
        Intrinsics.isThisObjectNull(aAAnimation, "prop");
        this.animation = aAAnimation;
        return this;
    }

    public final AASeries borderColor(String str) {
        this.borderColor = str;
        return this;
    }

    public final AASeries borderRadius(Float f) {
        this.borderRadius = f;
        return this;
    }

    public final AASeries borderRadiusBottomLeft(Object obj) {
        this.borderRadiusBottomLeft = obj;
        return this;
    }

    public final AASeries borderRadiusBottomRight(Object obj) {
        this.borderRadiusBottomRight = obj;
        return this;
    }

    public final AASeries borderRadiusTopLeft(Object obj) {
        this.borderRadiusTopLeft = obj;
        return this;
    }

    public final AASeries borderRadiusTopRight(Object obj) {
        this.borderRadiusTopRight = obj;
        return this;
    }

    public final AASeries borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AASeries colorByPoint(Boolean bool) {
        this.colorByPoint = bool;
        return this;
    }

    public final AASeries connectNulls(Boolean bool) {
        this.connectNulls = bool;
        return this;
    }

    public final AASeries dataLabels(AADataLabels aADataLabels) {
        Intrinsics.isThisObjectNull(aADataLabels, "prop");
        this.dataLabels = aADataLabels;
        return this;
    }

    public final AASeries events(Map map) {
        Intrinsics.isThisObjectNull(map, "prop");
        this.events = map;
        return this;
    }

    public final AAAnimation getAnimation() {
        return this.animation;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Float getBorderRadius() {
        return this.borderRadius;
    }

    public final Object getBorderRadiusBottomLeft() {
        return this.borderRadiusBottomLeft;
    }

    public final Object getBorderRadiusBottomRight() {
        return this.borderRadiusBottomRight;
    }

    public final Object getBorderRadiusTopLeft() {
        return this.borderRadiusTopLeft;
    }

    public final Object getBorderRadiusTopRight() {
        return this.borderRadiusTopRight;
    }

    public final Float getBorderWidth() {
        return this.borderWidth;
    }

    public final Boolean getColorByPoint() {
        return this.colorByPoint;
    }

    public final Boolean getConnectNulls() {
        return this.connectNulls;
    }

    public final AADataLabels getDataLabels() {
        return this.dataLabels;
    }

    public final Map getEvents() {
        return this.events;
    }

    public final String[] getKeys() {
        return this.keys;
    }

    public final AAMarker getMarker() {
        return this.marker;
    }

    public final com.github.aachartmodel.aainfographics.aachartcreator.AAShadow getShadow() {
        return this.shadow;
    }

    public final String getStacking() {
        return this.stacking;
    }

    public final AASeries keys(String[] strArr) {
        Intrinsics.isThisObjectNull(strArr, "prop");
        this.keys = strArr;
        return this;
    }

    public final AASeries marker(AAMarker aAMarker) {
        Intrinsics.isThisObjectNull(aAMarker, "prop");
        this.marker = aAMarker;
        return this;
    }

    public final void setAnimation(AAAnimation aAAnimation) {
        this.animation = aAAnimation;
    }

    public final void setBorderColor(String str) {
        this.borderColor = str;
    }

    public final void setBorderRadius(Float f) {
        this.borderRadius = f;
    }

    public final void setBorderRadiusBottomLeft(Object obj) {
        this.borderRadiusBottomLeft = obj;
    }

    public final void setBorderRadiusBottomRight(Object obj) {
        this.borderRadiusBottomRight = obj;
    }

    public final void setBorderRadiusTopLeft(Object obj) {
        this.borderRadiusTopLeft = obj;
    }

    public final void setBorderRadiusTopRight(Object obj) {
        this.borderRadiusTopRight = obj;
    }

    public final void setBorderWidth(Float f) {
        this.borderWidth = f;
    }

    public final void setColorByPoint(Boolean bool) {
        this.colorByPoint = bool;
    }

    public final void setConnectNulls(Boolean bool) {
        this.connectNulls = bool;
    }

    public final void setDataLabels(AADataLabels aADataLabels) {
        this.dataLabels = aADataLabels;
    }

    public final void setEvents(Map map) {
        this.events = map;
    }

    public final void setKeys(String[] strArr) {
        this.keys = strArr;
    }

    public final void setMarker(AAMarker aAMarker) {
        this.marker = aAMarker;
    }

    public final void setShadow(com.github.aachartmodel.aainfographics.aachartcreator.AAShadow aAShadow) {
        this.shadow = aAShadow;
    }

    public final void setStacking(String str) {
        this.stacking = str;
    }

    public final AASeries shadow(com.github.aachartmodel.aainfographics.aachartcreator.AAShadow aAShadow) {
        Intrinsics.isThisObjectNull(aAShadow, "prop");
        this.shadow = aAShadow;
        return this;
    }

    public final AASeries stacking(AAChartStackingType aAChartStackingType) {
        this.stacking = aAChartStackingType != null ? aAChartStackingType.getValue() : null;
        return this;
    }
}
