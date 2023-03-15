package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AAPane.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0004J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0004R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016¨\u0006&"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABackground;", BuildConfig.VERSION_NAME, "prop", "backgroundColor", BuildConfig.VERSION_NAME, "borderColor", BuildConfig.VERSION_NAME, "borderWidth", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABackground;", "className", "innerRadius", "outerRadius", "shape", "Ljava/lang/String;", "getShape", "()Ljava/lang/String;", "setShape", "(Ljava/lang/String;)V", "Ljava/lang/Float;", "getInnerRadius", "()Ljava/lang/Float;", "setInnerRadius", "(Ljava/lang/Float;)V", "getClassName", "setClassName", "getBorderColor", "setBorderColor", "Ljava/lang/Object;", "getBackgroundColor", "()Ljava/lang/Object;", "setBackgroundColor", "(Ljava/lang/Object;)V", "getBorderWidth", "setBorderWidth", "getOuterRadius", "setOuterRadius", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AABackground {
    private Object backgroundColor;
    private String borderColor;
    private Float borderWidth;
    private String className;
    private Float innerRadius;
    private Float outerRadius;
    private String shape;

    public final AABackground backgroundColor(Object obj) {
        this.backgroundColor = obj;
        return this;
    }

    public final AABackground borderColor(String str) {
        this.borderColor = str;
        return this;
    }

    public final AABackground borderWidth(Float f) {
        this.borderWidth = f;
        return this;
    }

    public final AABackground className(String str) {
        this.className = str;
        return this;
    }

    public final Object getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Float getBorderWidth() {
        return this.borderWidth;
    }

    public final String getClassName() {
        return this.className;
    }

    public final Float getInnerRadius() {
        return this.innerRadius;
    }

    public final Float getOuterRadius() {
        return this.outerRadius;
    }

    public final String getShape() {
        return this.shape;
    }

    public final AABackground innerRadius(Float f) {
        this.innerRadius = f;
        return this;
    }

    public final AABackground outerRadius(Float f) {
        this.outerRadius = f;
        return this;
    }

    public final void setBackgroundColor(Object obj) {
        this.backgroundColor = obj;
    }

    public final void setBorderColor(String str) {
        this.borderColor = str;
    }

    public final void setBorderWidth(Float f) {
        this.borderWidth = f;
    }

    public final void setClassName(String str) {
        this.className = str;
    }

    public final void setInnerRadius(Float f) {
        this.innerRadius = f;
    }

    public final void setOuterRadius(Float f) {
        this.outerRadius = f;
    }

    public final void setShape(String str) {
        this.shape = str;
    }

    public final AABackground shape(String str) {
        this.shape = str;
        return this;
    }
}
