package com.github.aachartmodel.aainfographics.aaoptionsmodel;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartFontWeightType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AAStyle.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bG\u0018\u0000 S2\u00020\u0001:\u0001SB\u0007¢\u0006\u0004\bQ\u0010RJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001d\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R$\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001d\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010!R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010!R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001d\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010!R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u001a\u0004\bC\u0010\u001f\"\u0004\bD\u0010!R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001d\u001a\u0004\bE\u0010\u001f\"\u0004\bF\u0010!R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001d\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010!R$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010,\u001a\u0004\bI\u0010.\"\u0004\bJ\u00100R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\bK\u0010\u001f\"\u0004\bL\u0010!R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u001a\u0004\bM\u0010\u001f\"\u0004\bN\u0010!R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u001a\u0004\bO\u0010\u001f\"\u0004\bP\u0010!¨\u0006T"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "prop", "background", "backgroundColor", "border", BuildConfig.VERSION_NAME, "borderRadius", "color", "cursor", "fontFamily", "fontSize", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartFontWeightType;", "fontWeight", "height", "lineWidth", "opacity", "padding", "pointerEvents", "position", "textAlign", "textDecoration", "textOutline", "textOverflow", "top", "transition", "whiteSpace", "width", "Ljava/lang/String;", "getTextOverflow", "()Ljava/lang/String;", "setTextOverflow", "(Ljava/lang/String;)V", "getPadding", "setPadding", "getTextOutline", "setTextOutline", "getPosition", "setPosition", "getCursor", "setCursor", "getFontFamily", "setFontFamily", "Ljava/lang/Number;", "getWidth", "()Ljava/lang/Number;", "setWidth", "(Ljava/lang/Number;)V", "getColor", "setColor", "getPointerEvents", "setPointerEvents", "getTextDecoration", "setTextDecoration", "getWhiteSpace", "setWhiteSpace", "getBorderRadius", "setBorderRadius", "getLineWidth", "setLineWidth", "getHeight", "setHeight", "getFontWeight", "setFontWeight", "getFontSize", "setFontSize", "getBackground", "setBackground", "getTransition", "setTransition", "getTextAlign", "setTextAlign", "getOpacity", "setOpacity", "getBackgroundColor", "setBackgroundColor", "getTop", "setTop", "getBorder", "setBorder", "<init>", "()V", "Companion", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAStyle {
    public static final Companion Companion = new Companion(null);
    private String background;
    private String backgroundColor;
    private String border;
    private String borderRadius;
    private String color;
    private String cursor;
    private String fontFamily;
    private String fontSize;
    private String fontWeight;
    private Number height;
    private Number lineWidth;
    private Number opacity;
    private String padding;
    private String pointerEvents;
    private String position;
    private String textAlign;
    private String textDecoration;
    private String textOutline;
    private String textOverflow;
    private String top;
    private String transition;
    private String whiteSpace;
    private Number width;

    /* compiled from: AAStyle.kt */
    @Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J!\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0005\u0010\bJ+\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ5\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u0010"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle$Companion;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "color", "Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "style", BuildConfig.VERSION_NAME, "fontSize", "(Ljava/lang/String;Ljava/lang/Float;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartFontWeightType;", "fontWeight", "(Ljava/lang/String;Ljava/lang/Float;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartFontWeightType;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "textOutline", "(Ljava/lang/String;Ljava/lang/Float;Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartFontWeightType;Ljava/lang/String;)Lcom/github/aachartmodel/aainfographics/aaoptionsmodel/AAStyle;", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final AAStyle style(String str) {
            return style(str, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AAStyle style(String str, Float f) {
            return style(str, f, null);
        }

        public final AAStyle style(String str, Float f, AAChartFontWeightType aAChartFontWeightType) {
            return style(str, f, aAChartFontWeightType, null);
        }

        public final AAStyle style(String str, Float f, AAChartFontWeightType aAChartFontWeightType, String str2) {
            return new AAStyle().color(str).fontSize(f).fontWeight(aAChartFontWeightType).textOutline(str2);
        }
    }

    public final AAStyle background(String str) {
        this.background = str;
        return this;
    }

    public final AAStyle backgroundColor(String str) {
        this.backgroundColor = str;
        return this;
    }

    public final AAStyle border(String str) {
        this.border = str;
        return this;
    }

    public final AAStyle borderRadius(Number number) {
        if (number != null) {
            this.borderRadius = number + "px";
        }
        return this;
    }

    public final AAStyle color(String str) {
        this.color = str;
        return this;
    }

    public final AAStyle cursor(String str) {
        this.cursor = str;
        return this;
    }

    public final AAStyle fontFamily(String str) {
        this.fontFamily = str;
        return this;
    }

    public final AAStyle fontSize(Number number) {
        if (number != null) {
            this.fontSize = number + "px";
        }
        return this;
    }

    public final AAStyle fontWeight(AAChartFontWeightType aAChartFontWeightType) {
        this.fontWeight = aAChartFontWeightType != null ? aAChartFontWeightType.getValue() : null;
        return this;
    }

    public final String getBackground() {
        return this.background;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorder() {
        return this.border;
    }

    public final String getBorderRadius() {
        return this.borderRadius;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontSize() {
        return this.fontSize;
    }

    public final String getFontWeight() {
        return this.fontWeight;
    }

    public final Number getHeight() {
        return this.height;
    }

    public final Number getLineWidth() {
        return this.lineWidth;
    }

    public final Number getOpacity() {
        return this.opacity;
    }

    public final String getPadding() {
        return this.padding;
    }

    public final String getPointerEvents() {
        return this.pointerEvents;
    }

    public final String getPosition() {
        return this.position;
    }

    public final String getTextAlign() {
        return this.textAlign;
    }

    public final String getTextDecoration() {
        return this.textDecoration;
    }

    public final String getTextOutline() {
        return this.textOutline;
    }

    public final String getTextOverflow() {
        return this.textOverflow;
    }

    public final String getTop() {
        return this.top;
    }

    public final String getTransition() {
        return this.transition;
    }

    public final String getWhiteSpace() {
        return this.whiteSpace;
    }

    public final Number getWidth() {
        return this.width;
    }

    public final AAStyle height(Number number) {
        this.height = number;
        return this;
    }

    public final AAStyle lineWidth(Number number) {
        this.lineWidth = number;
        return this;
    }

    public final AAStyle opacity(Number number) {
        this.opacity = number;
        return this;
    }

    public final AAStyle padding(Number number) {
        if (number != null) {
            this.padding = number + "px";
        }
        return this;
    }

    public final AAStyle pointerEvents(String str) {
        this.pointerEvents = str;
        return this;
    }

    public final AAStyle position(String str) {
        this.position = str;
        return this;
    }

    public final void setBackground(String str) {
        this.background = str;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setBorder(String str) {
        this.border = str;
    }

    public final void setBorderRadius(String str) {
        this.borderRadius = str;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setCursor(String str) {
        this.cursor = str;
    }

    public final void setFontFamily(String str) {
        this.fontFamily = str;
    }

    public final void setFontSize(String str) {
        this.fontSize = str;
    }

    public final void setFontWeight(String str) {
        this.fontWeight = str;
    }

    public final void setHeight(Number number) {
        this.height = number;
    }

    public final void setLineWidth(Number number) {
        this.lineWidth = number;
    }

    public final void setOpacity(Number number) {
        this.opacity = number;
    }

    public final void setPadding(String str) {
        this.padding = str;
    }

    public final void setPointerEvents(String str) {
        this.pointerEvents = str;
    }

    public final void setPosition(String str) {
        this.position = str;
    }

    public final void setTextAlign(String str) {
        this.textAlign = str;
    }

    public final void setTextDecoration(String str) {
        this.textDecoration = str;
    }

    public final void setTextOutline(String str) {
        this.textOutline = str;
    }

    public final void setTextOverflow(String str) {
        this.textOverflow = str;
    }

    public final void setTop(String str) {
        this.top = str;
    }

    public final void setTransition(String str) {
        this.transition = str;
    }

    public final void setWhiteSpace(String str) {
        this.whiteSpace = str;
    }

    public final void setWidth(Number number) {
        this.width = number;
    }

    public final AAStyle textAlign(String str) {
        this.textAlign = str;
        return this;
    }

    public final AAStyle textDecoration(String str) {
        this.textDecoration = str;
        return this;
    }

    public final AAStyle textOutline(String str) {
        this.textOutline = str;
        return this;
    }

    public final AAStyle textOverflow(String str) {
        this.textOverflow = str;
        return this;
    }

    public final AAStyle top(String str) {
        this.top = str;
        return this;
    }

    public final AAStyle transition(String str) {
        this.transition = str;
        return this;
    }

    public final AAStyle whiteSpace(String str) {
        this.whiteSpace = str;
        return this;
    }

    public final AAStyle width(Number number) {
        this.width = number;
        return this;
    }
}
