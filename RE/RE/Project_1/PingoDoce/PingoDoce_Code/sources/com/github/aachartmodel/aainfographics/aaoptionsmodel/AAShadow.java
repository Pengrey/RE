package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAShadow.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAShadow;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "color", BuildConfig.VERSION_NAME, "offsetX", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAShadow;", "offsetY", "opacity", "width", "Ljava/lang/Float;", "Ljava/lang/String;", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAShadow {
    private String color;
    private Float offsetX;
    private Float offsetY;
    private Float opacity;
    private Float width;

    public final AAShadow color(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.color = str;
        return this;
    }

    public final AAShadow offsetX(Float f) {
        this.offsetX = f;
        return this;
    }

    public final AAShadow offsetY(Float f) {
        this.offsetY = f;
        return this;
    }

    public final AAShadow opacity(Float f) {
        this.opacity = f;
        return this;
    }

    public final AAShadow width(Float f) {
        this.width = f;
        return this;
    }
}
