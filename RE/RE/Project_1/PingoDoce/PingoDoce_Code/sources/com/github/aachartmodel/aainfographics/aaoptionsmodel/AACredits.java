package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AACredits.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "enabled", BuildConfig.VERSION_NAME, "href", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "position", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "style", "text", "Ljava/lang/String;", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "getPosition", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;", "setPosition", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPosition;)V", "getText", "setText", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "getStyle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "setStyle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;)V", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AACredits {
    private Boolean enabled;
    private String href;
    private AAPosition position;
    private AAStyle style;
    private String text;

    public final AACredits enabled(boolean z) {
        this.enabled = Boolean.valueOf(z);
        return this;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getHref() {
        return this.href;
    }

    public final AAPosition getPosition() {
        return this.position;
    }

    public final AAStyle getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final AACredits href(String str) {
        this.href = str;
        return this;
    }

    public final AACredits position(AAPosition aAPosition) {
        this.position = aAPosition;
        return this;
    }

    public final void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public final void setHref(String str) {
        this.href = str;
    }

    public final void setPosition(AAPosition aAPosition) {
        this.position = aAPosition;
    }

    public final void setStyle(AAStyle aAStyle) {
        this.style = aAStyle;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final AACredits style(AAStyle aAStyle) {
        this.style = aAStyle;
        return this;
    }

    public final AACredits text(String str) {
        this.text = str;
        return this;
    }
}
