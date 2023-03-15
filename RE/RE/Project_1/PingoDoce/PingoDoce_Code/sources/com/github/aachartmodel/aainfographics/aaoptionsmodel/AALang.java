package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;

/* compiled from: AALang.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u000f"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "resetZoom", "thousandsSep", "Ljava/lang/String;", "getResetZoom", "()Ljava/lang/String;", "setResetZoom", "(Ljava/lang/String;)V", "getThousandsSep", "setThousandsSep", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AALang {
    private String resetZoom;
    private String thousandsSep;

    public final String getResetZoom() {
        return this.resetZoom;
    }

    public final String getThousandsSep() {
        return this.thousandsSep;
    }

    public final AALang resetZoom(String str) {
        this.resetZoom = str;
        return this;
    }

    public final void setResetZoom(String str) {
        this.resetZoom = str;
    }

    public final void setThousandsSep(String str) {
        this.thousandsSep = str;
    }

    public final AALang thousandsSep(String str) {
        this.thousandsSep = str;
        return this;
    }
}
