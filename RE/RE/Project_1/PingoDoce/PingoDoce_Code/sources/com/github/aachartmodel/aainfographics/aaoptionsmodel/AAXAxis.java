package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAXAxis.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bl\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0017\u0010\"\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0017\u0010$\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0017\u0010&\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b&\u0010\u0017J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010)\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b)\u0010\u0017J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020*J\u0017\u0010,\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b,\u0010\u0013J\u0017\u0010-\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b-\u0010\u0013J\u0017\u0010.\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b.\u0010\u0010J\u000e\u00100\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020/J\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u00102\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b2\u0010\u0017J\u0017\u00103\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b3\u0010\u0017J\u000e\u00104\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010,\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010.\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u00102\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010X\u001a\u0004\b]\u0010Z\"\u0004\b^\u0010\\R$\u0010)\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010N\u001a\u0004\b_\u0010P\"\u0004\b`\u0010RR$\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010I\u001a\u0004\ba\u0010K\"\u0004\bb\u0010MR$\u00104\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010X\u001a\u0004\bc\u0010Z\"\u0004\bd\u0010\\R$\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010N\u001a\u0004\be\u0010P\"\u0004\bf\u0010RR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010I\u001a\u0004\bg\u0010K\"\u0004\bh\u0010MR$\u0010-\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010:\u001a\u0004\bi\u0010<\"\u0004\bj\u0010>R$\u0010\"\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010N\u001a\u0004\bk\u0010P\"\u0004\bl\u0010RR$\u0010\u001f\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010N\u001a\u0004\bm\u0010P\"\u0004\bn\u0010RR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010X\u001a\u0004\bo\u0010Z\"\u0004\bp\u0010\\R$\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010X\u001a\u0004\bq\u0010Z\"\u0004\br\u0010\\R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010:\u001a\u0004\bs\u0010<\"\u0004\bt\u0010>R$\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010N\u001a\u0004\bu\u0010P\"\u0004\bv\u0010RR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010N\u001a\u0004\bw\u0010P\"\u0004\bx\u0010RR$\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010I\u001a\u0004\by\u0010K\"\u0004\bz\u0010MR$\u0010!\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR&\u0010&\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b&\u0010N\u001a\u0005\b\u0080\u0001\u0010P\"\u0005\b\u0081\u0001\u0010RR&\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u001e\u0010X\u001a\u0005\b\u0082\u0001\u0010Z\"\u0005\b\u0083\u0001\u0010\\R&\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u001d\u0010X\u001a\u0005\b\u0084\u0001\u0010Z\"\u0005\b\u0085\u0001\u0010\\R&\u00103\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b3\u0010N\u001a\u0005\b\u0086\u0001\u0010P\"\u0005\b\u0087\u0001\u0010RR/\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\n\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R&\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0014\u0010:\u001a\u0005\b\u008d\u0001\u0010<\"\u0005\b\u008e\u0001\u0010>R&\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b'\u0010X\u001a\u0005\b\u008f\u0001\u0010Z\"\u0005\b\u0090\u0001\u0010\\R&\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b%\u0010X\u001a\u0005\b\u0091\u0001\u0010Z\"\u0005\b\u0092\u0001\u0010\\R&\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b \u0010X\u001a\u0005\b\u0093\u0001\u0010Z\"\u0005\b\u0094\u0001\u0010\\R&\u0010$\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b$\u0010N\u001a\u0005\b\u0095\u0001\u0010P\"\u0005\b\u0096\u0001\u0010RR&\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b#\u0010X\u001a\u0005\b\u0097\u0001\u0010Z\"\u0005\b\u0098\u0001\u0010\\¨\u0006\u009b\u0001"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "type", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "plotBands", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "plotLines", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "categories", "([Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", BuildConfig.VERSION_NAME, "linkedTo", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", BuildConfig.VERSION_NAME, "reversed", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "opposite", BuildConfig.VERSION_NAME, "lineWidth", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAXAxis;", "lineColor", "max", "min", "minRange", "minTickInterval", "minorGridLineColor", "minorGridLineDashStyle", "minorGridLineWidth", "minorTickColor", "minorTickInterval", "minorTickLength", "minorTickPosition", "minorTickWidth", "tickColor", "gridLineWidth", "gridLineColor", "gridLineDashStyle", "off", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "labels", "visible", "startOnTick", "tickInterval", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "crosshair", "tickmarkPlacement", "tickWidth", "tickLength", "tickPosition", "[Ljava/lang/String;", "getCategories", "()[Ljava/lang/String;", "setCategories", "([Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "setVisible", "(Ljava/lang/Boolean;)V", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "getPlotBands", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "setPlotBands", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "getLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "setLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;)V", "Ljava/lang/Integer;", "getTickInterval", "()Ljava/lang/Integer;", "setTickInterval", "(Ljava/lang/Integer;)V", "Ljava/lang/Float;", "getTickWidth", "()Ljava/lang/Float;", "setTickWidth", "(Ljava/lang/Float;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "getCrosshair", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "setCrosshair", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;)V", "Ljava/lang/String;", "getLineColor", "()Ljava/lang/String;", "setLineColor", "(Ljava/lang/String;)V", "getTickmarkPlacement", "setTickmarkPlacement", "getOff", "setOff", "getMinTickInterval", "setMinTickInterval", "getTickPosition", "setTickPosition", "getMin", "setMin", "getLinkedTo", "setLinkedTo", "getStartOnTick", "setStartOnTick", "getMinorTickLength", "setMinorTickLength", "getMinorGridLineWidth", "setMinorGridLineWidth", "getType", "setType", "getGridLineDashStyle", "setGridLineDashStyle", "getReversed", "setReversed", "getMax", "setMax", "getLineWidth", "setLineWidth", "getMinRange", "setMinRange", "Ljava/lang/Object;", "getMinorTickInterval", "()Ljava/lang/Object;", "setMinorTickInterval", "(Ljava/lang/Object;)V", "getGridLineWidth", "setGridLineWidth", "getMinorGridLineDashStyle", "setMinorGridLineDashStyle", "getMinorGridLineColor", "setMinorGridLineColor", "getTickLength", "setTickLength", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "getPlotLines", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "setPlotLines", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;)V", "getOpposite", "setOpposite", "getGridLineColor", "setGridLineColor", "getTickColor", "setTickColor", "getMinorTickColor", "setMinorTickColor", "getMinorTickWidth", "setMinorTickWidth", "getMinorTickPosition", "setMinorTickPosition", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAXAxis {
    private String[] categories;
    private AACrosshair crosshair;
    private String gridLineColor;
    private String gridLineDashStyle;
    private Float gridLineWidth;
    private AALabels labels;
    private String lineColor;
    private Float lineWidth;
    private Integer linkedTo;
    private Float max;
    private Float min;
    private Integer minRange;
    private Integer minTickInterval;
    private String minorGridLineColor;
    private String minorGridLineDashStyle;
    private Float minorGridLineWidth;
    private String minorTickColor;
    private Object minorTickInterval;
    private Float minorTickLength;
    private String minorTickPosition;
    private Float minorTickWidth;
    private Float off;
    private Boolean opposite;
    private AAPlotBandsElement[] plotBands;
    private AAPlotLinesElement[] plotLines;
    private Boolean reversed;
    private Boolean startOnTick;
    private String tickColor;
    private Integer tickInterval;
    private Float tickLength;
    private String tickPosition;
    private Float tickWidth;
    private String tickmarkPlacement;
    private String type;
    private Boolean visible;

    public final AAXAxis categories(String[] strArr) {
        this.categories = strArr;
        return this;
    }

    public final AAXAxis crosshair(AACrosshair aACrosshair) {
        Intrinsics.isThisObjectNull(aACrosshair, "prop");
        this.crosshair = aACrosshair;
        return this;
    }

    public final String[] getCategories() {
        return this.categories;
    }

    public final AACrosshair getCrosshair() {
        return this.crosshair;
    }

    public final String getGridLineColor() {
        return this.gridLineColor;
    }

    public final String getGridLineDashStyle() {
        return this.gridLineDashStyle;
    }

    public final Float getGridLineWidth() {
        return this.gridLineWidth;
    }

    public final AALabels getLabels() {
        return this.labels;
    }

    public final String getLineColor() {
        return this.lineColor;
    }

    public final Float getLineWidth() {
        return this.lineWidth;
    }

    public final Integer getLinkedTo() {
        return this.linkedTo;
    }

    public final Float getMax() {
        return this.max;
    }

    public final Float getMin() {
        return this.min;
    }

    public final Integer getMinRange() {
        return this.minRange;
    }

    public final Integer getMinTickInterval() {
        return this.minTickInterval;
    }

    public final String getMinorGridLineColor() {
        return this.minorGridLineColor;
    }

    public final String getMinorGridLineDashStyle() {
        return this.minorGridLineDashStyle;
    }

    public final Float getMinorGridLineWidth() {
        return this.minorGridLineWidth;
    }

    public final String getMinorTickColor() {
        return this.minorTickColor;
    }

    public final Object getMinorTickInterval() {
        return this.minorTickInterval;
    }

    public final Float getMinorTickLength() {
        return this.minorTickLength;
    }

    public final String getMinorTickPosition() {
        return this.minorTickPosition;
    }

    public final Float getMinorTickWidth() {
        return this.minorTickWidth;
    }

    public final Float getOff() {
        return this.off;
    }

    public final Boolean getOpposite() {
        return this.opposite;
    }

    public final AAPlotBandsElement[] getPlotBands() {
        return this.plotBands;
    }

    public final AAPlotLinesElement[] getPlotLines() {
        return this.plotLines;
    }

    public final Boolean getReversed() {
        return this.reversed;
    }

    public final Boolean getStartOnTick() {
        return this.startOnTick;
    }

    public final String getTickColor() {
        return this.tickColor;
    }

    public final Integer getTickInterval() {
        return this.tickInterval;
    }

    public final Float getTickLength() {
        return this.tickLength;
    }

    public final String getTickPosition() {
        return this.tickPosition;
    }

    public final Float getTickWidth() {
        return this.tickWidth;
    }

    public final String getTickmarkPlacement() {
        return this.tickmarkPlacement;
    }

    public final String getType() {
        return this.type;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public final AAXAxis gridLineColor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.gridLineColor = str;
        return this;
    }

    public final AAXAxis gridLineDashStyle(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.gridLineDashStyle = str;
        return this;
    }

    public final AAXAxis gridLineWidth(Float f) {
        this.gridLineWidth = f;
        return this;
    }

    public final AAXAxis labels(AALabels aALabels) {
        Intrinsics.isThisObjectNull(aALabels, "prop");
        this.labels = aALabels;
        return this;
    }

    public final AAXAxis lineColor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.lineColor = str;
        return this;
    }

    public final AAXAxis lineWidth(Float f) {
        this.lineWidth = f;
        return this;
    }

    public final AAXAxis linkedTo(Integer num) {
        this.linkedTo = num;
        return this;
    }

    public final AAXAxis max(Float f) {
        this.max = f;
        return this;
    }

    public final AAXAxis min(Float f) {
        this.min = f;
        return this;
    }

    public final AAXAxis minRange(Integer num) {
        this.minRange = num;
        return this;
    }

    public final AAXAxis minTickInterval(Integer num) {
        this.minTickInterval = num;
        return this;
    }

    public final AAXAxis minorGridLineColor(String str) {
        this.minorGridLineColor = str;
        return this;
    }

    public final AAXAxis minorGridLineDashStyle(String str) {
        this.minorGridLineDashStyle = str;
        return this;
    }

    public final AAXAxis minorGridLineWidth(Float f) {
        this.minorGridLineWidth = f;
        return this;
    }

    public final AAXAxis minorTickColor(String str) {
        this.minorTickColor = str;
        return this;
    }

    public final AAXAxis minorTickInterval(Object obj) {
        this.minorTickInterval = obj;
        return this;
    }

    public final AAXAxis minorTickLength(Float f) {
        this.minorTickLength = f;
        return this;
    }

    public final AAXAxis minorTickPosition(String str) {
        this.minorTickPosition = str;
        return this;
    }

    public final AAXAxis minorTickWidth(Float f) {
        this.minorTickWidth = f;
        return this;
    }

    public final AAXAxis off(Float f) {
        this.off = f;
        return this;
    }

    public final AAXAxis opposite(Boolean bool) {
        this.opposite = bool;
        return this;
    }

    public final AAXAxis plotBands(AAPlotBandsElement[] aAPlotBandsElementArr) {
        Intrinsics.isThisObjectNull(aAPlotBandsElementArr, "prop");
        this.plotBands = aAPlotBandsElementArr;
        return this;
    }

    public final AAXAxis plotLines(AAPlotLinesElement[] aAPlotLinesElementArr) {
        Intrinsics.isThisObjectNull(aAPlotLinesElementArr, "prop");
        this.plotLines = aAPlotLinesElementArr;
        return this;
    }

    public final AAXAxis reversed(Boolean bool) {
        this.reversed = bool;
        return this;
    }

    public final void setCategories(String[] strArr) {
        this.categories = strArr;
    }

    public final void setCrosshair(AACrosshair aACrosshair) {
        this.crosshair = aACrosshair;
    }

    public final void setGridLineColor(String str) {
        this.gridLineColor = str;
    }

    public final void setGridLineDashStyle(String str) {
        this.gridLineDashStyle = str;
    }

    public final void setGridLineWidth(Float f) {
        this.gridLineWidth = f;
    }

    public final void setLabels(AALabels aALabels) {
        this.labels = aALabels;
    }

    public final void setLineColor(String str) {
        this.lineColor = str;
    }

    public final void setLineWidth(Float f) {
        this.lineWidth = f;
    }

    public final void setLinkedTo(Integer num) {
        this.linkedTo = num;
    }

    public final void setMax(Float f) {
        this.max = f;
    }

    public final void setMin(Float f) {
        this.min = f;
    }

    public final void setMinRange(Integer num) {
        this.minRange = num;
    }

    public final void setMinTickInterval(Integer num) {
        this.minTickInterval = num;
    }

    public final void setMinorGridLineColor(String str) {
        this.minorGridLineColor = str;
    }

    public final void setMinorGridLineDashStyle(String str) {
        this.minorGridLineDashStyle = str;
    }

    public final void setMinorGridLineWidth(Float f) {
        this.minorGridLineWidth = f;
    }

    public final void setMinorTickColor(String str) {
        this.minorTickColor = str;
    }

    public final void setMinorTickInterval(Object obj) {
        this.minorTickInterval = obj;
    }

    public final void setMinorTickLength(Float f) {
        this.minorTickLength = f;
    }

    public final void setMinorTickPosition(String str) {
        this.minorTickPosition = str;
    }

    public final void setMinorTickWidth(Float f) {
        this.minorTickWidth = f;
    }

    public final void setOff(Float f) {
        this.off = f;
    }

    public final void setOpposite(Boolean bool) {
        this.opposite = bool;
    }

    public final void setPlotBands(AAPlotBandsElement[] aAPlotBandsElementArr) {
        this.plotBands = aAPlotBandsElementArr;
    }

    public final void setPlotLines(AAPlotLinesElement[] aAPlotLinesElementArr) {
        this.plotLines = aAPlotLinesElementArr;
    }

    public final void setReversed(Boolean bool) {
        this.reversed = bool;
    }

    public final void setStartOnTick(Boolean bool) {
        this.startOnTick = bool;
    }

    public final void setTickColor(String str) {
        this.tickColor = str;
    }

    public final void setTickInterval(Integer num) {
        this.tickInterval = num;
    }

    public final void setTickLength(Float f) {
        this.tickLength = f;
    }

    public final void setTickPosition(String str) {
        this.tickPosition = str;
    }

    public final void setTickWidth(Float f) {
        this.tickWidth = f;
    }

    public final void setTickmarkPlacement(String str) {
        this.tickmarkPlacement = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVisible(Boolean bool) {
        this.visible = bool;
    }

    public final AAXAxis startOnTick(Boolean bool) {
        this.startOnTick = bool;
        return this;
    }

    public final AAXAxis tickColor(String str) {
        this.tickColor = str;
        return this;
    }

    public final AAXAxis tickInterval(Integer num) {
        this.tickInterval = num;
        return this;
    }

    public final AAXAxis tickLength(Float f) {
        this.tickLength = f;
        return this;
    }

    public final AAXAxis tickPosition(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.tickPosition = str;
        return this;
    }

    public final AAXAxis tickWidth(Float f) {
        this.tickWidth = f;
        return this;
    }

    public final AAXAxis tickmarkPlacement(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.tickmarkPlacement = str;
        return this;
    }

    public final AAXAxis type(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.type = str;
        return this;
    }

    public final AAXAxis visible(Boolean bool) {
        this.visible = bool;
        return this;
    }
}
