package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AAStates.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0004\u001a\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u0007R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR,\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "attributes", BuildConfig.VERSION_NAME, "opacity", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAHalo;", "size", "Ljava/lang/Float;", "getSize", "()Ljava/lang/Float;", "setSize", "(Ljava/lang/Float;)V", "getOpacity", "setOpacity", "Ljava/util/Map;", "getAttributes", "()Ljava/util/Map;", "setAttributes", "(Ljava/util/Map;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAHalo {
    private Map<?, ?> attributes;
    private Float opacity;
    private Float size;

    public final AAHalo attributes(Map<?, ?> map) {
        this.attributes = map;
        return this;
    }

    public final Map<?, ?> getAttributes() {
        return this.attributes;
    }

    public final Float getOpacity() {
        return this.opacity;
    }

    public final Float getSize() {
        return this.size;
    }

    public final AAHalo opacity(Float f) {
        this.opacity = f;
        return this;
    }

    public final void setAttributes(Map<?, ?> map) {
        this.attributes = map;
    }

    public final void setOpacity(Float f) {
        this.opacity = f;
    }

    public final void setSize(Float f) {
        this.size = f;
    }

    public final AAHalo size(Float f) {
        this.size = f;
        return this;
    }
}
