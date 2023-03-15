package com.github.aachartmodel.aainfographics.aachartcreator;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AACredits;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALang;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPane;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotOptions;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAOptions.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bR\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bq\u0010rJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bJ\u001b\u0010\u000e\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014J\u001d\u0010\u0016\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0018J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0004\b\u001c\u0010\u0017J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001fJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010=\u001a\u0004\bo\u0010?\"\u0004\bp\u0010A¨\u0006s"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "prop", "chart", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "title", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASubtitle;", "subtitle", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "xAxis", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "yAxis", BuildConfig.VERSION_NAME, "xAxisArray", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "yAxisArray", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "tooltip", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "plotOptions", "series", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "legend", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", "pane", "colors", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", "credits", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;", "defaultOptions", BuildConfig.VERSION_NAME, "touchEventEnabled", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "getTitle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "setTitle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "getChart", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;", "setChart", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAChart;)V", "Ljava/lang/Boolean;", "getTouchEventEnabled", "()Ljava/lang/Boolean;", "setTouchEventEnabled", "(Ljava/lang/Boolean;)V", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "getYAxisArray", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "setYAxisArray", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "getTooltip", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;", "setTooltip", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATooltip;)V", "[Ljava/lang/Object;", "getSeries", "()[Ljava/lang/Object;", "setSeries", "([Ljava/lang/Object;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", "getPane", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;", "setPane", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPane;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", "getCredits", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;", "setCredits", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACredits;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASubtitle;", "getSubtitle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASubtitle;", "setSubtitle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AASubtitle;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "getXAxis", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "setXAxis", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "getLegend", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;", "setLegend", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALegend;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "getYAxis", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "setYAxis", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;", "getDefaultOptions", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;", "setDefaultOptions", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALang;)V", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "getXAxisArray", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "setXAxisArray", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "getPlotOptions", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "setPlotOptions", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;)V", "getColors", "setColors", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAOptions {
    private AAChart chart;
    private Object[] colors;
    private AACredits credits;
    private AALang defaultOptions;
    private AALegend legend;
    private AAPane pane;
    private AAPlotOptions plotOptions;
    private Object[] series;
    private AASubtitle subtitle;
    private AATitle title;
    private AATooltip tooltip;
    private Boolean touchEventEnabled;
    private AAXAxis xAxis;
    private AAXAxis[] xAxisArray;
    private AAYAxis yAxis;
    private AAYAxis[] yAxisArray;

    public AAOptions() {
        AACredits aACredits = new AACredits();
        aACredits.setEnabled(Boolean.FALSE);
        this.credits = aACredits;
    }

    public final AAOptions chart(AAChart aAChart) {
        Intrinsics.isThisObjectNull(aAChart, "prop");
        this.chart = aAChart;
        return this;
    }

    public final AAOptions colors(Object[] objArr) {
        this.colors = objArr;
        return this;
    }

    public final AAOptions credits(AACredits aACredits) {
        Intrinsics.isThisObjectNull(aACredits, "prop");
        this.credits = aACredits;
        return this;
    }

    public final AAOptions defaultOptions(AALang aALang) {
        Intrinsics.isThisObjectNull(aALang, "prop");
        this.defaultOptions = aALang;
        return this;
    }

    public final AAChart getChart() {
        return this.chart;
    }

    public final Object[] getColors() {
        return this.colors;
    }

    public final AACredits getCredits() {
        return this.credits;
    }

    public final AALang getDefaultOptions() {
        return this.defaultOptions;
    }

    public final AALegend getLegend() {
        return this.legend;
    }

    public final AAPane getPane() {
        return this.pane;
    }

    public final AAPlotOptions getPlotOptions() {
        return this.plotOptions;
    }

    public final Object[] getSeries() {
        return this.series;
    }

    public final AASubtitle getSubtitle() {
        return this.subtitle;
    }

    public final AATitle getTitle() {
        return this.title;
    }

    public final AATooltip getTooltip() {
        return this.tooltip;
    }

    public final Boolean getTouchEventEnabled() {
        return this.touchEventEnabled;
    }

    public final AAXAxis getXAxis() {
        return this.xAxis;
    }

    public final AAXAxis[] getXAxisArray() {
        return this.xAxisArray;
    }

    public final AAYAxis getYAxis() {
        return this.yAxis;
    }

    public final AAYAxis[] getYAxisArray() {
        return this.yAxisArray;
    }

    public final AAOptions legend(AALegend aALegend) {
        Intrinsics.isThisObjectNull(aALegend, "prop");
        this.legend = aALegend;
        return this;
    }

    public final AAOptions pane(AAPane aAPane) {
        this.pane = aAPane;
        return this;
    }

    public final AAOptions plotOptions(AAPlotOptions aAPlotOptions) {
        Intrinsics.isThisObjectNull(aAPlotOptions, "prop");
        this.plotOptions = aAPlotOptions;
        return this;
    }

    public final AAOptions series(Object[] objArr) {
        this.series = objArr;
        return this;
    }

    public final void setChart(AAChart aAChart) {
        this.chart = aAChart;
    }

    public final void setColors(Object[] objArr) {
        this.colors = objArr;
    }

    public final void setCredits(AACredits aACredits) {
        this.credits = aACredits;
    }

    public final void setDefaultOptions(AALang aALang) {
        this.defaultOptions = aALang;
    }

    public final void setLegend(AALegend aALegend) {
        this.legend = aALegend;
    }

    public final void setPane(AAPane aAPane) {
        this.pane = aAPane;
    }

    public final void setPlotOptions(AAPlotOptions aAPlotOptions) {
        this.plotOptions = aAPlotOptions;
    }

    public final void setSeries(Object[] objArr) {
        this.series = objArr;
    }

    public final void setSubtitle(AASubtitle aASubtitle) {
        this.subtitle = aASubtitle;
    }

    public final void setTitle(AATitle aATitle) {
        this.title = aATitle;
    }

    public final void setTooltip(AATooltip aATooltip) {
        this.tooltip = aATooltip;
    }

    public final void setTouchEventEnabled(Boolean bool) {
        this.touchEventEnabled = bool;
    }

    public final void setXAxis(AAXAxis aAXAxis) {
        this.xAxis = aAXAxis;
    }

    public final void setXAxisArray(AAXAxis[] aAXAxisArr) {
        this.xAxisArray = aAXAxisArr;
    }

    public final void setYAxis(AAYAxis aAYAxis) {
        this.yAxis = aAYAxis;
    }

    public final void setYAxisArray(AAYAxis[] aAYAxisArr) {
        this.yAxisArray = aAYAxisArr;
    }

    public final AAOptions subtitle(AASubtitle aASubtitle) {
        Intrinsics.isThisObjectNull(aASubtitle, "prop");
        this.subtitle = aASubtitle;
        return this;
    }

    public final AAOptions title(AATitle aATitle) {
        Intrinsics.isThisObjectNull(aATitle, "prop");
        this.title = aATitle;
        return this;
    }

    public final AAOptions tooltip(AATooltip aATooltip) {
        Intrinsics.isThisObjectNull(aATooltip, "prop");
        this.tooltip = aATooltip;
        return this;
    }

    public final AAOptions touchEventEnabled(Boolean bool) {
        this.touchEventEnabled = bool;
        return this;
    }

    public final AAOptions xAxis(AAXAxis aAXAxis) {
        Intrinsics.isThisObjectNull(aAXAxis, "prop");
        this.xAxis = aAXAxis;
        return this;
    }

    public final AAOptions xAxisArray(AAXAxis[] aAXAxisArr) {
        Intrinsics.isThisObjectNull(aAXAxisArr, "prop");
        this.xAxisArray = aAXAxisArr;
        return this;
    }

    public final AAOptions yAxis(AAYAxis aAYAxis) {
        Intrinsics.isThisObjectNull(aAYAxis, "prop");
        this.yAxis = aAYAxis;
        return this;
    }

    public final AAOptions yAxisArray(AAYAxis[] aAYAxisArr) {
        Intrinsics.isThisObjectNull(aAYAxisArr, "prop");
        this.yAxisArray = aAYAxisArr;
        return this;
    }
}
