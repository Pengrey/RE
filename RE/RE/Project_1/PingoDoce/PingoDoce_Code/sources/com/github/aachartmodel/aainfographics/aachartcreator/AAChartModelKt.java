package com.github.aachartmodel.aainfographics.aachartcreator;

import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAChartModel.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "aa_toAAOptions", "charts_release"}, m20206k = 2, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAChartModelKt {
    public static final AAOptions aa_toAAOptions(AAChartModel aAChartModel) {
        Intrinsics.isThisObjectNull(aAChartModel, "$this$aa_toAAOptions");
        return AAOptionsConstructor.INSTANCE.configureChartOptions(aAChartModel);
    }
}
