package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AAChart.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\b\u001a\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAResetZoomButton;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "prop", "position", BuildConfig.VERSION_NAME, "relativeTo", BuildConfig.VERSION_NAME, "theme", "Ljava/lang/String;", "getRelativeTo", "()Ljava/lang/String;", "setRelativeTo", "(Ljava/lang/String;)V", "Ljava/util/Map;", "getTheme", "()Ljava/util/Map;", "setTheme", "(Ljava/util/Map;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "getPosition", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "setPosition", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAResetZoomButton {
    private AAPosition position;
    private String relativeTo;
    private Map<String, ? extends Object> theme;

    public final AAPosition getPosition() {
        return this.position;
    }

    public final String getRelativeTo() {
        return this.relativeTo;
    }

    public final Map<String, Object> getTheme() {
        return this.theme;
    }

    public final AAResetZoomButton position(AAPosition aAPosition) {
        this.position = aAPosition;
        return this;
    }

    public final AAResetZoomButton relativeTo(String str) {
        this.relativeTo = str;
        return this;
    }

    public final void setPosition(AAPosition aAPosition) {
        this.position = aAPosition;
    }

    public final void setRelativeTo(String str) {
        this.relativeTo = str;
    }

    public final void setTheme(Map<String, ? extends Object> map) {
        this.theme = map;
    }

    public final AAResetZoomButton theme(Map<String, ? extends Object> map) {
        this.theme = map;
        return this;
    }
}
