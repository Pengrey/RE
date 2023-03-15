package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType;
import kotlin.Metadata;

/* compiled from: AADataLabels.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bN\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b_\u0010`J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001a\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001b\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010)\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R$\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00100\u001a\u0004\b>\u00102\"\u0004\b?\u00104R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00100\u001a\u0004\b@\u00102\"\u0004\bA\u00104R$\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\bB\u0010+\"\u0004\bC\u0010-R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00100\u001a\u0004\bD\u00102\"\u0004\bE\u00104R$\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\"\u001a\u0004\bF\u0010$\"\u0004\bG\u0010&R$\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010)\u001a\u0004\bH\u0010+\"\u0004\bI\u0010-R$\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010)\u001a\u0004\bJ\u0010+\"\u0004\bK\u0010-R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00100\u001a\u0004\bL\u00102\"\u0004\bM\u00104R$\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\"\u001a\u0004\bN\u0010$\"\u0004\bO\u0010&R$\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\"\u001a\u0004\bP\u0010$\"\u0004\bQ\u0010&R$\u0010!\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010)\u001a\u0004\bW\u0010+\"\u0004\bX\u0010-R$\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010)\u001a\u0004\bY\u0010+\"\u0004\bZ\u0010-R$\u0010 \u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010R\u001a\u0004\b[\u0010T\"\u0004\b\\\u0010VR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00100\u001a\u0004\b]\u00102\"\u0004\b^\u00104¨\u0006a"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "enabled", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartAlignType;", "align", "inside", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "style", BuildConfig.VERSION_NAME, "format", BuildConfig.VERSION_NAME, "rotation", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "allowOverlap", "useHTML", "distance", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartVerticalAlignType;", "verticalAlign", "x", "y", "color", "backgroundColor", "borderColor", "borderRadius", "borderWidth", "shape", "crop", "overflow", "softConnector", "textPath", "filter", "Ljava/lang/Float;", "getRotation", "()Ljava/lang/Float;", "setRotation", "(Ljava/lang/Float;)V", "getY", "setY", "Ljava/lang/String;", "getAlign", "()Ljava/lang/String;", "setAlign", "(Ljava/lang/String;)V", "getFormat", "setFormat", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "getBorderColor", "setBorderColor", "getX", "setX", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "getStyle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "setStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)V", "getCrop", "setCrop", "getInside", "setInside", "getBackgroundColor", "setBackgroundColor", "getUseHTML", "setUseHTML", "getBorderWidth", "setBorderWidth", "getVerticalAlign", "setVerticalAlign", "getShape", "setShape", "getSoftConnector", "setSoftConnector", "getBorderRadius", "setBorderRadius", "getDistance", "setDistance", "Ljava/lang/Object;", "getFilter", "()Ljava/lang/Object;", "setFilter", "(Ljava/lang/Object;)V", "getColor", "setColor", "getOverflow", "setOverflow", "getTextPath", "setTextPath", "getAllowOverlap", "setAllowOverlap", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AADataLabels {
    private String align;
    private Boolean allowOverlap;
    private String backgroundColor;
    private String borderColor;
    private Float borderRadius;
    private Float borderWidth;
    private String color;
    private Boolean crop;
    private Float distance;
    private Boolean enabled;
    private Object filter;
    private String format;
    private Boolean inside;
    private String overflow;
    private Float rotation;
    private String shape;
    private Boolean softConnector;
    private AAStyle style;
    private Object textPath;
    private Boolean useHTML;
    private String verticalAlign;

    /* renamed from: x */
    private Float f6807x;

    /* renamed from: y */
    private Float f6808y;

    public final AADataLabels align(AAChartAlignType aAChartAlignType) {
        this.align = aAChartAlignType != null ? aAChartAlignType.getValue() : null;
        return this;
    }

    public final AADataLabels allowOverlap(Boolean bool) {
        this.allowOverlap = bool;
        return this;
    }

    public final AADataLabels backgroundColor(String str) {
        this.backgroundColor = str;
        return this;
    }

    public final AADataLabels borderColor(String str) {
        this.borderColor = str;
        return this;
    }

    public final AADataLabels borderRadius(Float f) {
        this.borderRadius = f;
        return this;
    }

    public final AADataLabels borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AADataLabels color(String str) {
        this.color = str;
        return this;
    }

    public final AADataLabels crop(Boolean bool) {
        this.crop = bool;
        return this;
    }

    public final AADataLabels distance(Float f) {
        this.distance = f;
        return this;
    }

    public final AADataLabels enabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }

    public final AADataLabels filter(Object obj) {
        this.filter = obj;
        return this;
    }

    public final AADataLabels format(String str) {
        this.format = str;
        return this;
    }

    public final String getAlign() {
        return this.align;
    }

    public final Boolean getAllowOverlap() {
        return this.allowOverlap;
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

    public final String getColor() {
        return this.color;
    }

    public final Boolean getCrop() {
        return this.crop;
    }

    public final Float getDistance() {
        return this.distance;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Object getFilter() {
        return this.filter;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Boolean getInside() {
        return this.inside;
    }

    public final String getOverflow() {
        return this.overflow;
    }

    public final Float getRotation() {
        return this.rotation;
    }

    public final String getShape() {
        return this.shape;
    }

    public final Boolean getSoftConnector() {
        return this.softConnector;
    }

    public final AAStyle getStyle() {
        return this.style;
    }

    public final Object getTextPath() {
        return this.textPath;
    }

    public final Boolean getUseHTML() {
        return this.useHTML;
    }

    public final String getVerticalAlign() {
        return this.verticalAlign;
    }

    public final Float getX() {
        return this.f6807x;
    }

    public final Float getY() {
        return this.f6808y;
    }

    public final AADataLabels inside(Boolean bool) {
        this.inside = bool;
        return this;
    }

    public final AADataLabels overflow(String str) {
        this.overflow = str;
        return this;
    }

    public final AADataLabels rotation(Float f) {
        this.rotation = f;
        return this;
    }

    public final void setAlign(String str) {
        this.align = str;
    }

    public final void setAllowOverlap(Boolean bool) {
        this.allowOverlap = bool;
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

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setCrop(Boolean bool) {
        this.crop = bool;
    }

    public final void setDistance(Float f) {
        this.distance = f;
    }

    public final void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public final void setFilter(Object obj) {
        this.filter = obj;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setInside(Boolean bool) {
        this.inside = bool;
    }

    public final void setOverflow(String str) {
        this.overflow = str;
    }

    public final void setRotation(Float f) {
        this.rotation = f;
    }

    public final void setShape(String str) {
        this.shape = str;
    }

    public final void setSoftConnector(Boolean bool) {
        this.softConnector = bool;
    }

    public final void setStyle(AAStyle aAStyle) {
        this.style = aAStyle;
    }

    public final void setTextPath(Object obj) {
        this.textPath = obj;
    }

    public final void setUseHTML(Boolean bool) {
        this.useHTML = bool;
    }

    public final void setVerticalAlign(String str) {
        this.verticalAlign = str;
    }

    public final void setX(Float f) {
        this.f6807x = f;
    }

    public final void setY(Float f) {
        this.f6808y = f;
    }

    public final AADataLabels shape(String str) {
        this.shape = str;
        return this;
    }

    public final AADataLabels softConnector(Boolean bool) {
        this.softConnector = bool;
        return this;
    }

    public final AADataLabels style(AAStyle aAStyle) {
        this.style = aAStyle;
        return this;
    }

    public final AADataLabels textPath(Object obj) {
        this.textPath = obj;
        return this;
    }

    public final AADataLabels useHTML(Boolean bool) {
        this.useHTML = bool;
        return this;
    }

    public final AADataLabels verticalAlign(AAChartVerticalAlignType aAChartVerticalAlignType) {
        this.verticalAlign = aAChartVerticalAlignType != null ? aAChartVerticalAlignType.getValue() : null;
        return this;
    }

    /* renamed from: x */
    public final AADataLabels m33886x(Float f) {
        this.f6807x = f;
        return this;
    }

    /* renamed from: y */
    public final AADataLabels m33885y(Float f) {
        this.f6808y = f;
        return this;
    }
}
