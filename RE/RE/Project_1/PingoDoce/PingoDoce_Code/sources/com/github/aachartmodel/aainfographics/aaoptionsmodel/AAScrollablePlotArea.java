package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AAScrollablePlotArea.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\tR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R$\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "minHeight", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "minWidth", BuildConfig.VERSION_NAME, "opacity", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAScrollablePlotArea;", "scrollPositionX", "scrollPositionY", "Ljava/lang/Float;", "getOpacity", "()Ljava/lang/Float;", "setOpacity", "(Ljava/lang/Float;)V", "Ljava/lang/Integer;", "getMinHeight", "()Ljava/lang/Integer;", "setMinHeight", "(Ljava/lang/Integer;)V", "getScrollPositionX", "setScrollPositionX", "getScrollPositionY", "setScrollPositionY", "getMinWidth", "setMinWidth", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAScrollablePlotArea {
    private Integer minHeight;
    private Integer minWidth;
    private Float opacity;
    private Float scrollPositionX;
    private Float scrollPositionY;

    public final Integer getMinHeight() {
        return this.minHeight;
    }

    public final Integer getMinWidth() {
        return this.minWidth;
    }

    public final Float getOpacity() {
        return this.opacity;
    }

    public final Float getScrollPositionX() {
        return this.scrollPositionX;
    }

    public final Float getScrollPositionY() {
        return this.scrollPositionY;
    }

    public final AAScrollablePlotArea minHeight(Integer num) {
        this.minHeight = num;
        return this;
    }

    public final AAScrollablePlotArea minWidth(Integer num) {
        this.minWidth = num;
        return this;
    }

    public final AAScrollablePlotArea opacity(Float f) {
        this.opacity = f;
        return this;
    }

    public final AAScrollablePlotArea scrollPositionX(Float f) {
        this.scrollPositionX = f;
        return this;
    }

    public final AAScrollablePlotArea scrollPositionY(Float f) {
        this.scrollPositionY = f;
        return this;
    }

    public final void setMinHeight(Integer num) {
        this.minHeight = num;
    }

    public final void setMinWidth(Integer num) {
        this.minWidth = num;
    }

    public final void setOpacity(Float f) {
        this.opacity = f;
    }

    public final void setScrollPositionX(Float f) {
        this.scrollPositionX = f;
    }

    public final void setScrollPositionY(Float f) {
        this.scrollPositionY = f;
    }
}
