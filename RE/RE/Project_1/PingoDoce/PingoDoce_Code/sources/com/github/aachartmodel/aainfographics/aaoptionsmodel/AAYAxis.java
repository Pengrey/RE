package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: AAYAxis.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\bt\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u0014J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010 \u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b \u0010\u0014J\u0017\u0010\"\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\fJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\fJ\u0017\u0010'\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b'\u0010\u0014J\u0010\u0010(\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\fJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0017\u0010*\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b*\u0010\u0014J\u0010\u0010+\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\fJ\u0017\u0010,\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b,\u0010\u0014J\u001b\u0010-\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b/\u0010\u0011J\u0017\u00100\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b0\u0010\u0011J\u0017\u00101\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010!¢\u0006\u0004\b1\u0010#J\u000e\u00103\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u000202J\u000e\u00104\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fJ\u0017\u00105\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b5\u0010\u0014J\u0017\u00106\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b6\u0010\u0014J\u000e\u00107\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fR$\u00106\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00108\u001a\u0004\bQ\u0010:\"\u0004\bR\u0010<R$\u0010%\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010G\u001a\u0004\bS\u0010I\"\u0004\bT\u0010KR*\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00108\u001a\u0004\bZ\u0010:\"\u0004\b[\u0010<R$\u0010+\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010G\u001a\u0004\b\\\u0010I\"\u0004\b]\u0010KR$\u0010 \u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00108\u001a\u0004\b^\u0010:\"\u0004\b_\u0010<R$\u0010,\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u00108\u001a\u0004\b`\u0010:\"\u0004\ba\u0010<R$\u00101\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u00104\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010G\u001a\u0004\bg\u0010I\"\u0004\bh\u0010KR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00108\u001a\u0004\bi\u0010:\"\u0004\bj\u0010<R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010G\u001a\u0004\bp\u0010I\"\u0004\bq\u0010KR$\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u00105\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00108\u001a\u0004\bw\u0010:\"\u0004\bx\u0010<R$\u00107\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010G\u001a\u0004\by\u0010I\"\u0004\bz\u0010KR$\u0010*\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u00108\u001a\u0004\b{\u0010:\"\u0004\b|\u0010<R,\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0007\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0017\u0010G\u001a\u0005\b\u0082\u0001\u0010I\"\u0005\b\u0083\u0001\u0010KR&\u0010/\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b/\u0010r\u001a\u0005\b\u0084\u0001\u0010t\"\u0005\b\u0085\u0001\u0010vR&\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0018\u0010G\u001a\u0005\b\u0086\u0001\u0010I\"\u0005\b\u0087\u0001\u0010KR&\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\"\u0010b\u001a\u0005\b\u0088\u0001\u0010d\"\u0005\b\u0089\u0001\u0010fR&\u0010'\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b'\u00108\u001a\u0005\b\u008a\u0001\u0010:\"\u0005\b\u008b\u0001\u0010<R&\u00100\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b0\u0010r\u001a\u0005\b\u008c\u0001\u0010t\"\u0005\b\u008d\u0001\u0010vR&\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0015\u0010G\u001a\u0005\b\u008e\u0001\u0010I\"\u0005\b\u008f\u0001\u0010KR&\u0010$\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b$\u0010b\u001a\u0005\b\u0090\u0001\u0010d\"\u0005\b\u0091\u0001\u0010fR&\u0010(\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b(\u0010G\u001a\u0005\b\u0092\u0001\u0010I\"\u0005\b\u0093\u0001\u0010KR/\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\r\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R&\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0010\u0010r\u001a\u0005\b\u0099\u0001\u0010t\"\u0005\b\u009a\u0001\u0010vR)\u0010)\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b)\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R&\u0010&\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b&\u0010G\u001a\u0005\b \u0001\u0010I\"\u0005\b¡\u0001\u0010KR&\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u001f\u00108\u001a\u0005\b¢\u0001\u0010:\"\u0005\b£\u0001\u0010<¨\u0006¦\u0001"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "prop", "title", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "plotBands", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "plotLines", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", BuildConfig.VERSION_NAME, "categories", "([Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", BuildConfig.VERSION_NAME, "reversed", "(Ljava/lang/Boolean;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", BuildConfig.VERSION_NAME, "gridLineWidth", "(Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "gridLineColor", "gridLineDashStyle", "alternateGridColor", "gridLineInterpolation", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "labels", "lineWidth", "lineColor", "off", "allowDecimals", "max", "min", BuildConfig.VERSION_NAME, "minRange", "(Ljava/lang/Integer;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "minTickInterval", "minorGridLineColor", "minorGridLineDashStyle", "minorGridLineWidth", "minorTickColor", "minorTickInterval", "minorTickLength", "minorTickPosition", "minorTickWidth", "tickPositions", "([Ljava/lang/Object;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAYAxis;", "visible", "opposite", "tickInterval", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "crosshair", "stackLabels", "tickWidth", "tickLength", "tickPosition", "Ljava/lang/Float;", "getTickLength", "()Ljava/lang/Float;", "setTickLength", "(Ljava/lang/Float;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "getCrosshair", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;", "setCrosshair", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AACrosshair;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "getLabels", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;", "setLabels", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AALabels;)V", "Ljava/lang/String;", "getGridLineDashStyle", "()Ljava/lang/String;", "setGridLineDashStyle", "(Ljava/lang/String;)V", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "getTitle", "()Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;", "setTitle", "(Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AATitle;)V", "getOff", "setOff", "getMinorGridLineColor", "setMinorGridLineColor", "[Ljava/lang/Object;", "getTickPositions", "()[Ljava/lang/Object;", "setTickPositions", "([Ljava/lang/Object;)V", "getLineWidth", "setLineWidth", "getMinorTickPosition", "setMinorTickPosition", "getMin", "setMin", "getMinorTickWidth", "setMinorTickWidth", "Ljava/lang/Integer;", "getTickInterval", "()Ljava/lang/Integer;", "setTickInterval", "(Ljava/lang/Integer;)V", "getStackLabels", "setStackLabels", "getGridLineWidth", "setGridLineWidth", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "getPlotLines", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;", "setPlotLines", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotLinesElement;)V", "getLineColor", "setLineColor", "Ljava/lang/Boolean;", "getAllowDecimals", "()Ljava/lang/Boolean;", "setAllowDecimals", "(Ljava/lang/Boolean;)V", "getTickWidth", "setTickWidth", "getTickPosition", "setTickPosition", "getMinorTickLength", "setMinorTickLength", "[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "getPlotBands", "()[Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;", "setPlotBands", "([Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAPlotBandsElement;)V", "getAlternateGridColor", "setAlternateGridColor", "getVisible", "setVisible", "getGridLineInterpolation", "setGridLineInterpolation", "getMinRange", "setMinRange", "getMinorGridLineWidth", "setMinorGridLineWidth", "getOpposite", "setOpposite", "getGridLineColor", "setGridLineColor", "getMinTickInterval", "setMinTickInterval", "getMinorTickColor", "setMinorTickColor", "[Ljava/lang/String;", "getCategories", "()[Ljava/lang/String;", "setCategories", "([Ljava/lang/String;)V", "getReversed", "setReversed", "Ljava/lang/Object;", "getMinorTickInterval", "()Ljava/lang/Object;", "setMinorTickInterval", "(Ljava/lang/Object;)V", "getMinorGridLineDashStyle", "setMinorGridLineDashStyle", "getMax", "setMax", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAYAxis {
    private Boolean allowDecimals;
    private String alternateGridColor;
    private String[] categories;
    private AACrosshair crosshair;
    private String gridLineColor;
    private String gridLineDashStyle;
    private String gridLineInterpolation;
    private Float gridLineWidth;
    private AALabels labels;
    private String lineColor;
    private Float lineWidth;
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
    private String stackLabels;
    private Integer tickInterval;
    private Float tickLength;
    private String tickPosition;
    private Object[] tickPositions;
    private Float tickWidth;
    private AATitle title;
    private Boolean visible;

    public final AAYAxis allowDecimals(Boolean bool) {
        this.allowDecimals = bool;
        return this;
    }

    public final AAYAxis alternateGridColor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.alternateGridColor = str;
        return this;
    }

    public final AAYAxis categories(String[] strArr) {
        Intrinsics.isThisObjectNull(strArr, "prop");
        this.categories = strArr;
        return this;
    }

    public final AAYAxis crosshair(AACrosshair aACrosshair) {
        Intrinsics.isThisObjectNull(aACrosshair, "prop");
        this.crosshair = aACrosshair;
        return this;
    }

    public final Boolean getAllowDecimals() {
        return this.allowDecimals;
    }

    public final String getAlternateGridColor() {
        return this.alternateGridColor;
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

    public final String getGridLineInterpolation() {
        return this.gridLineInterpolation;
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

    public final String getStackLabels() {
        return this.stackLabels;
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

    public final Object[] getTickPositions() {
        return this.tickPositions;
    }

    public final Float getTickWidth() {
        return this.tickWidth;
    }

    public final AATitle getTitle() {
        return this.title;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public final AAYAxis gridLineColor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.gridLineColor = str;
        return this;
    }

    public final AAYAxis gridLineDashStyle(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.gridLineDashStyle = str;
        return this;
    }

    public final AAYAxis gridLineInterpolation(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.gridLineInterpolation = str;
        return this;
    }

    public final AAYAxis gridLineWidth(Float f) {
        this.gridLineWidth = f;
        return this;
    }

    public final AAYAxis labels(AALabels aALabels) {
        Intrinsics.isThisObjectNull(aALabels, "prop");
        this.labels = aALabels;
        return this;
    }

    public final AAYAxis lineColor(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.lineColor = str;
        return this;
    }

    public final AAYAxis lineWidth(Float f) {
        this.lineWidth = f;
        return this;
    }

    public final AAYAxis max(Float f) {
        this.max = f;
        return this;
    }

    public final AAYAxis min(Float f) {
        this.min = f;
        return this;
    }

    public final AAYAxis minRange(Integer num) {
        this.minRange = num;
        return this;
    }

    public final AAYAxis minTickInterval(Integer num) {
        this.minTickInterval = num;
        return this;
    }

    public final AAYAxis minorGridLineColor(String str) {
        this.minorGridLineColor = str;
        return this;
    }

    public final AAYAxis minorGridLineDashStyle(String str) {
        this.minorGridLineDashStyle = str;
        return this;
    }

    public final AAYAxis minorGridLineWidth(Float f) {
        this.minorGridLineWidth = f;
        return this;
    }

    public final AAYAxis minorTickColor(String str) {
        this.minorTickColor = str;
        return this;
    }

    public final AAYAxis minorTickInterval(Object obj) {
        this.minorTickInterval = obj;
        return this;
    }

    public final AAYAxis minorTickLength(Float f) {
        this.minorTickLength = f;
        return this;
    }

    public final AAYAxis minorTickPosition(String str) {
        this.minorTickPosition = str;
        return this;
    }

    public final AAYAxis minorTickWidth(Float f) {
        this.minorTickWidth = f;
        return this;
    }

    public final AAYAxis off(Float f) {
        this.off = f;
        return this;
    }

    public final AAYAxis opposite(Boolean bool) {
        this.opposite = bool;
        return this;
    }

    public final AAYAxis plotBands(AAPlotBandsElement[] aAPlotBandsElementArr) {
        Intrinsics.isThisObjectNull(aAPlotBandsElementArr, "prop");
        this.plotBands = aAPlotBandsElementArr;
        return this;
    }

    public final AAYAxis plotLines(AAPlotLinesElement[] aAPlotLinesElementArr) {
        Intrinsics.isThisObjectNull(aAPlotLinesElementArr, "prop");
        this.plotLines = aAPlotLinesElementArr;
        return this;
    }

    public final AAYAxis reversed(Boolean bool) {
        this.reversed = bool;
        return this;
    }

    public final void setAllowDecimals(Boolean bool) {
        this.allowDecimals = bool;
    }

    public final void setAlternateGridColor(String str) {
        this.alternateGridColor = str;
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

    public final void setGridLineInterpolation(String str) {
        this.gridLineInterpolation = str;
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

    public final void setStackLabels(String str) {
        this.stackLabels = str;
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

    public final void setTickPositions(Object[] objArr) {
        this.tickPositions = objArr;
    }

    public final void setTickWidth(Float f) {
        this.tickWidth = f;
    }

    public final void setTitle(AATitle aATitle) {
        this.title = aATitle;
    }

    public final void setVisible(Boolean bool) {
        this.visible = bool;
    }

    public final AAYAxis stackLabels(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.stackLabels = str;
        return this;
    }

    public final AAYAxis tickInterval(Integer num) {
        this.tickInterval = num;
        return this;
    }

    public final AAYAxis tickLength(Float f) {
        this.tickLength = f;
        return this;
    }

    public final AAYAxis tickPosition(String str) {
        Intrinsics.isThisObjectNull(str, "prop");
        this.tickPosition = str;
        return this;
    }

    public final AAYAxis tickPositions(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "prop");
        this.tickPositions = objArr;
        return this;
    }

    public final AAYAxis tickWidth(Float f) {
        this.tickWidth = f;
        return this;
    }

    public final AAYAxis title(AATitle aATitle) {
        Intrinsics.isThisObjectNull(aATitle, "prop");
        this.title = aATitle;
        return this;
    }

    public final AAYAxis visible(Boolean bool) {
        this.visible = bool;
        return this;
    }
}
