package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AACredits.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "align", "verticalAlign", BuildConfig.VERSION_NAME, "y", "x", "Ljava/lang/Number;", "getX", "()Ljava/lang/Number;", "setX", "(Ljava/lang/Number;)V", "getY", "setY", "Ljava/lang/String;", "getVerticalAlign", "()Ljava/lang/String;", "setVerticalAlign", "(Ljava/lang/String;)V", "getAlign", "setAlign", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAPosition {
    private String align;
    private String verticalAlign;

    /* renamed from: x */
    private Number f6816x;

    /* renamed from: y */
    private Number f6817y;

    public final AAPosition align(String str) {
        this.align = str;
        return this;
    }

    public final String getAlign() {
        return this.align;
    }

    public final String getVerticalAlign() {
        return this.verticalAlign;
    }

    public final Number getX() {
        return this.f6816x;
    }

    public final Number getY() {
        return this.f6817y;
    }

    public final void setAlign(String str) {
        this.align = str;
    }

    public final void setVerticalAlign(String str) {
        this.verticalAlign = str;
    }

    public final void setX(Number number) {
        this.f6816x = number;
    }

    public final void setY(Number number) {
        this.f6817y = number;
    }

    public final AAPosition verticalAlign(String str) {
        this.verticalAlign = str;
        return this;
    }

    /* renamed from: y */
    public final AAPosition m33877y(Number number) {
        this.f6817y = number;
        return this;
    }

    public final AAPosition align(Number number) {
        this.f6816x = number;
        return this;
    }
}
