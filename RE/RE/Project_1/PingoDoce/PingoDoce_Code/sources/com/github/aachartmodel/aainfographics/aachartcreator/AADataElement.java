package com.github.aachartmodel.aainfographics.aachartcreator;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AASeriesElement.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0014"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aachartcreator/AADataElement;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "name", BuildConfig.VERSION_NAME, "y", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AADataElement;", "color", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "dataLabels", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "marker", "Ljava/lang/Float;", "Ljava/lang/Object;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAMarker;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AADataLabels;", "Ljava/lang/String;", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AADataElement {
    private Object color;
    private AADataLabels dataLabels;
    private AAMarker marker;
    private String name;

    /* renamed from: y */
    private Float f6804y;

    public final AADataElement color(Object obj) {
        Intrinsics.isThisObjectNull(obj, "prop");
        this.color = obj;
        return this;
    }

    public final AADataElement dataLabels(AADataLabels aADataLabels) {
        Intrinsics.isThisObjectNull(aADataLabels, "prop");
        this.dataLabels = aADataLabels;
        return this;
    }

    public final AADataElement marker(AAMarker aAMarker) {
        Intrinsics.isThisObjectNull(aAMarker, "prop");
        this.marker = aAMarker;
        return this;
    }

    public final AADataElement name(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.name = str;
        return this;
    }

    /* renamed from: y */
    public final AADataElement m33887y(Float f) {
        this.f6804y = f;
        return this;
    }
}
