package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAPane.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\nR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011¨\u0006\""}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABackground;", "prop", "background", BuildConfig.VERSION_NAME, "center", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", BuildConfig.VERSION_NAME, "endAngle", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", "size", "startAngle", "Ljava/lang/Float;", "getEndAngle", "()Ljava/lang/Float;", "setEndAngle", "(Ljava/lang/Float;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABackground;", "getBackground", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABackground;", "setBackground", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AABackground;)V", "[Ljava/lang/Object;", "getCenter", "()[Ljava/lang/Object;", "setCenter", "([Ljava/lang/Object;)V", "getSize", "setSize", "getStartAngle", "setStartAngle", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAPane {
    private AABackground background;
    private Object[] center;
    private Float endAngle;
    private Float size;
    private Float startAngle;

    public final AAPane background(AABackground aABackground) {
        this.background = aABackground;
        return this;
    }

    public final AAPane center(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "prop");
        this.center = objArr;
        return this;
    }

    public final AAPane endAngle(Float f) {
        this.endAngle = f;
        return this;
    }

    public final AABackground getBackground() {
        return this.background;
    }

    public final Object[] getCenter() {
        return this.center;
    }

    public final Float getEndAngle() {
        return this.endAngle;
    }

    public final Float getSize() {
        return this.size;
    }

    public final Float getStartAngle() {
        return this.startAngle;
    }

    public final void setBackground(AABackground aABackground) {
        this.background = aABackground;
    }

    public final void setCenter(Object[] objArr) {
        this.center = objArr;
    }

    public final void setEndAngle(Float f) {
        this.endAngle = f;
    }

    public final void setSize(Float f) {
        this.size = f;
    }

    public final void setStartAngle(Float f) {
        this.startAngle = f;
    }

    public final AAPane size(Float f) {
        this.size = f;
        return this;
    }

    public final AAPane startAngle(Float f) {
        this.startAngle = f;
        return this;
    }
}
