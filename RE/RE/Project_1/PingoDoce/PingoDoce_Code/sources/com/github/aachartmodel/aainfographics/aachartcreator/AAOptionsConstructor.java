package com.github.aachartmodel.aainfographics.aachartcreator;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAAnimation;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AABar;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAColumn;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAColumnrange;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPie;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotOptions;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASeries;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis;
import com.github.aachartmodel.aainfographics.aatools.AAColor;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAOptions.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptionsConstructor;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", "aaChartModel", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotOptions;", "aaPlotOptions", "Lyc/u;", "configureAAPlotOptionsMarkerStyle", "configureAAPlotOptionsDataLabels", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "aaOptions", "configureAxisContentAndStyle", "configureChartOptions", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAOptionsConstructor {
    public static final AAOptionsConstructor INSTANCE = new AAOptionsConstructor();

    @Metadata(m20209bv = {1, 0, 3}, m20208d1 = {}, m20207d2 = {}, m20206k = 3, m20205mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AAChartType.values().length];
            $EnumSwitchMapping$0 = iArr;
            AAChartType aAChartType = AAChartType.Area;
            iArr[aAChartType.ordinal()] = 1;
            AAChartType aAChartType2 = AAChartType.Areaspline;
            iArr[aAChartType2.ordinal()] = 2;
            AAChartType aAChartType3 = AAChartType.Line;
            iArr[aAChartType3.ordinal()] = 3;
            AAChartType aAChartType4 = AAChartType.Spline;
            iArr[aAChartType4.ordinal()] = 4;
            AAChartType aAChartType5 = AAChartType.Scatter;
            iArr[aAChartType5.ordinal()] = 5;
            int[] iArr2 = new int[AAChartType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            AAChartType aAChartType6 = AAChartType.Column;
            iArr2[aAChartType6.ordinal()] = 1;
            AAChartType aAChartType7 = AAChartType.Bar;
            iArr2[aAChartType7.ordinal()] = 2;
            iArr2[AAChartType.Pie.ordinal()] = 3;
            AAChartType aAChartType8 = AAChartType.Columnrange;
            iArr2[aAChartType8.ordinal()] = 4;
            int[] iArr3 = new int[AAChartType.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[aAChartType6.ordinal()] = 1;
            iArr3[aAChartType7.ordinal()] = 2;
            iArr3[aAChartType.ordinal()] = 3;
            iArr3[aAChartType2.ordinal()] = 4;
            iArr3[aAChartType3.ordinal()] = 5;
            iArr3[aAChartType4.ordinal()] = 6;
            iArr3[aAChartType5.ordinal()] = 7;
            iArr3[AAChartType.Bubble.ordinal()] = 8;
            iArr3[aAChartType8.ordinal()] = 9;
            iArr3[AAChartType.Arearange.ordinal()] = 10;
            iArr3[AAChartType.Areasplinerange.ordinal()] = 11;
            iArr3[AAChartType.Boxplot.ordinal()] = 12;
            iArr3[AAChartType.Waterfall.ordinal()] = 13;
            iArr3[AAChartType.Polygon.ordinal()] = 14;
            iArr3[AAChartType.Gauge.ordinal()] = 15;
        }
    }

    private AAOptionsConstructor() {
    }

    private final void configureAAPlotOptionsDataLabels(AAPlotOptions aAPlotOptions, AAChartModel aAChartModel) {
        AADataLabels aADataLabels = new AADataLabels();
        Boolean dataLabelsEnabled = aAChartModel.getDataLabelsEnabled();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.equals(dataLabelsEnabled, bool)) {
            aADataLabels.enabled(bool).style(aAChartModel.getDataLabelsStyle());
        }
        AAChartType chartType = aAChartModel.getChartType();
        if (chartType != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[chartType.ordinal()];
            if (i == 1) {
                AAColumn borderRadius = new AAColumn().borderWidth(Float.valueOf(0.0f)).borderRadius(aAChartModel.getBorderRadius());
                if (Intrinsics.equals(aAChartModel.getPolar(), bool)) {
                    borderRadius.pointPadding(Float.valueOf(0.0f)).groupPadding(Float.valueOf(0.005f));
                }
                aAPlotOptions.column(borderRadius);
            } else if (i == 2) {
                AABar borderRadius2 = new AABar().borderWidth(Float.valueOf(0.0f)).borderRadius(aAChartModel.getBorderRadius());
                if (Intrinsics.equals(aAChartModel.getPolar(), bool)) {
                    borderRadius2.pointPadding(Float.valueOf(0.0f)).groupPadding(Float.valueOf(0.005f));
                }
                aAPlotOptions.bar(borderRadius2);
            } else if (i == 3) {
                AAPie showInLegend = new AAPie().allowPointSelect(bool).cursor("pointer").showInLegend(bool);
                if (Intrinsics.equals(aAChartModel.getDataLabelsEnabled(), bool)) {
                    aADataLabels.format("<b>{point.name}</b>: {point.percentage:.1f} %");
                }
                aAPlotOptions.pie(showInLegend);
            } else if (i == 4) {
                aAPlotOptions.columnrange(new AAColumnrange().borderRadius(Float.valueOf(0.0f)).borderWidth(Float.valueOf(0.0f)));
            }
        }
        AASeries series = aAPlotOptions.getSeries();
        if (series != null) {
            series.dataLabels(aADataLabels);
        }
    }

    private final void configureAAPlotOptionsMarkerStyle(AAChartModel aAChartModel, AAPlotOptions aAPlotOptions) {
        AAChartType chartType = aAChartModel.getChartType();
        if (chartType == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[chartType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            AAMarker radius = new AAMarker().radius(aAChartModel.getMarkerRadius());
            AAChartSymbolType markerSymbol = aAChartModel.getMarkerSymbol();
            AAMarker symbol = radius.symbol(markerSymbol != null ? markerSymbol.getValue() : null);
            if (aAChartModel.getMarkerSymbolStyle() == AAChartSymbolStyleType.InnerBlank) {
                symbol.fillColor(AAColor.INSTANCE.getWhite()).lineWidth(Float.valueOf(2.0f)).lineColor(BuildConfig.VERSION_NAME);
            } else if (aAChartModel.getMarkerSymbolStyle() == AAChartSymbolStyleType.BorderBlank) {
                symbol.lineWidth(Float.valueOf(2.0f)).lineColor(aAChartModel.getBackgroundColor());
            }
            AASeries series = aAPlotOptions.getSeries();
            if (series != null) {
                series.marker(symbol);
            }
        }
    }

    private final void configureAxisContentAndStyle(AAOptions aAOptions, AAChartModel aAChartModel) {
        AAChartType chartType = aAChartModel.getChartType();
        if (chartType == null) {
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$2[chartType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                if (chartType != AAChartType.Gauge) {
                    Boolean xAxisLabelsEnabled = aAChartModel.getXAxisLabelsEnabled();
                    AALabels enabled = new AALabels().enabled(xAxisLabelsEnabled);
                    Intrinsics.ifNullDoSomething(xAxisLabelsEnabled);
                    if (xAxisLabelsEnabled.booleanValue()) {
                        enabled.style(new AAStyle().color(aAChartModel.getAxesTextColor()));
                    }
                    aAOptions.xAxis(new AAXAxis().labels(enabled).reversed(aAChartModel.getXAxisReversed()).gridLineWidth(aAChartModel.getXAxisGridLineWidth()).categories(aAChartModel.getCategories()).visible(aAChartModel.getXAxisVisible()).tickInterval(aAChartModel.getXAxisTickInterval()));
                }
                Boolean yAxisLabelsEnabled = aAChartModel.getYAxisLabelsEnabled();
                AALabels enabled2 = new AALabels().enabled(aAChartModel.getYAxisLabelsEnabled());
                Intrinsics.ifNullDoSomething(yAxisLabelsEnabled);
                if (yAxisLabelsEnabled.booleanValue()) {
                    enabled2.style(new AAStyle().color(aAChartModel.getAxesTextColor()));
                }
                aAOptions.yAxis(new AAYAxis().labels(enabled2).min(aAChartModel.getYAxisMin()).max(aAChartModel.getYAxisMax()).allowDecimals(aAChartModel.getYAxisAllowDecimals()).reversed(aAChartModel.getYAxisReversed()).gridLineWidth(aAChartModel.getYAxisGridLineWidth()).title(new AATitle().text(aAChartModel.getYAxisTitle()).style(new AAStyle().color(aAChartModel.getAxesTextColor()))).lineWidth(aAChartModel.getYAxisLineWidth()).visible(aAChartModel.getYAxisVisible()));
                return;
            default:
                return;
        }
    }

    public final AAOptions configureChartOptions(AAChartModel aAChartModel) {
        AASeries series;
        Intrinsics.isThisObjectNull(aAChartModel, "aaChartModel");
        AAChart pinchType = new AAChart().type(aAChartModel.getChartType()).inverted(aAChartModel.getInverted()).backgroundColor(aAChartModel.getBackgroundColor()).pinchType(aAChartModel.getZoomType());
        Boolean bool = Boolean.TRUE;
        AAChart scrollablePlotArea = pinchType.panning(bool).polar(aAChartModel.getPolar()).margin(aAChartModel.getMargin()).scrollablePlotArea(aAChartModel.getScrollablePlotArea());
        AATitle style = new AATitle().text(aAChartModel.getTitle()).style(aAChartModel.getTitleStyle());
        AASubtitle style2 = new AASubtitle().text(aAChartModel.getSubtitle()).align(aAChartModel.getSubtitleAlign()).style(aAChartModel.getSubtitleStyle());
        AATooltip valueSuffix = new AATooltip().enabled(aAChartModel.getTooltipEnabled()).shared(bool).valueSuffix(aAChartModel.getTooltipValueSuffix());
        AAPlotOptions series2 = new AAPlotOptions().series(new AASeries().stacking(aAChartModel.getStacking()));
        if (aAChartModel.getAnimationType() != AAChartAnimationType.Linear && (series = series2.getSeries()) != null) {
            series.animation(new AAAnimation().easing(aAChartModel.getAnimationType()).duration(aAChartModel.getAnimationDuration()));
        }
        configureAAPlotOptionsMarkerStyle(aAChartModel, series2);
        configureAAPlotOptionsDataLabels(series2, aAChartModel);
        AAOptions aAOptions = new AAOptions().chart(scrollablePlotArea).title(style).subtitle(style2).tooltip(valueSuffix).plotOptions(series2).legend(new AALegend().enabled(aAChartModel.getLegendEnabled()).itemStyle(new AAItemStyle().color(aAChartModel.getAxesTextColor()))).series(aAChartModel.getSeries()).colors(aAChartModel.getColorsTheme()).touchEventEnabled(aAChartModel.getTouchEventEnabled());
        configureAxisContentAndStyle(aAOptions, aAChartModel);
        return aAOptions;
    }
}
