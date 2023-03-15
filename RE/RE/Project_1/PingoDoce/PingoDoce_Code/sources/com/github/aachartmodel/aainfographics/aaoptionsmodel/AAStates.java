package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AAStates.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStates;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", "prop", "hover", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASelect;", "select", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASelect;", "getSelect", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASelect;", "setSelect", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASelect;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", "getHover", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;", "setHover", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHover;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAStates {
    private AAHover hover;
    private AASelect select;

    public final AAHover getHover() {
        return this.hover;
    }

    public final AASelect getSelect() {
        return this.select;
    }

    public final AAStates hover(AAHover aAHover) {
        this.hover = aAHover;
        return this;
    }

    public final AAStates select(AASelect aASelect) {
        this.select = aASelect;
        return this;
    }

    public final void setHover(AAHover aAHover) {
        this.hover = aAHover;
    }

    public final void setSelect(AASelect aASelect) {
        this.select = aASelect;
    }
}
