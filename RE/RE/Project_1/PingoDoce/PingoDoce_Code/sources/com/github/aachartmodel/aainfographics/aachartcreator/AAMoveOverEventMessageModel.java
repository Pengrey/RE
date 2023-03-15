package com.github.aachartmodel.aainfographics.aachartcreator;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import sa.C10124h;

/* compiled from: AAChartView.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012¨\u0006&"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAMoveOverEventMessageModel;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "category", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "name", "getName", "setName", BuildConfig.VERSION_NAME, "y", "Ljava/lang/Double;", "getY", "()Ljava/lang/Double;", "setY", "(Ljava/lang/Double;)V", BuildConfig.VERSION_NAME, "index", "Ljava/lang/Integer;", "getIndex", "()Ljava/lang/Integer;", "setIndex", "(Ljava/lang/Integer;)V", "Lsa/h;", "offset", "Lsa/h;", "getOffset", "()Lsa/h;", "setOffset", "(Lsa/h;)V", "x", "getX", "setX", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAMoveOverEventMessageModel {
    private String category;
    private Integer index;
    private String name;
    private C10124h<String, Object> offset;

    /* renamed from: x */
    private Double f6805x;

    /* renamed from: y */
    private Double f6806y;

    public final String getCategory() {
        return this.category;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    public final C10124h<String, Object> getOffset() {
        return this.offset;
    }

    public final Double getX() {
        return this.f6805x;
    }

    public final Double getY() {
        return this.f6806y;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setIndex(Integer num) {
        this.index = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOffset(C10124h<String, Object> c10124h) {
        this.offset = c10124h;
    }

    public final void setX(Double d) {
        this.f6805x = d;
    }

    public final void setY(Double d) {
        this.f6806y = d;
    }
}
