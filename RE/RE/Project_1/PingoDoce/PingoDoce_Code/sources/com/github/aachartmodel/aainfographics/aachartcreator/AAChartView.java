package com.github.aachartmodel.aainfographics.aachartcreator;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView;
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart;
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer;
import com.google.gson.C4364f;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import p181jd.Intrinsics;
import sa.C10124h;
import sd.StringsJVM;

/* compiled from: AAChartView.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001UB\u0011\b\u0016\u0012\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OB\u001b\b\u0016\u0012\u0006\u0010M\u001a\u00020L\u0012\b\u0010Q\u001a\u0004\u0018\u00010P¢\u0006\u0004\bN\u0010RB#\b\u0016\u0012\u0006\u0010M\u001a\u00020L\u0012\b\u0010Q\u001a\u0004\u0018\u00010P\u0012\u0006\u0010S\u001a\u00020%¢\u0006\u0004\bN\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u001c\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0007J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004J\u001b\u0010\u001d\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001d\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010!J\u0016\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001fJ\"\u0010(\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020\f2\b\b\u0002\u0010'\u001a\u00020\u001fH\u0007J.\u0010(\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u000e\u0010*\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u001bJ\u000e\u0010-\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u000e\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u000bR\u0018\u00100\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R.\u00103\u001a\u0004\u0018\u00010\u001f2\b\u00102\u001a\u0004\u0018\u00010\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R.\u0010:\u001a\u0004\u0018\u0001092\b\u00102\u001a\u0004\u0018\u0001098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR.\u0010G\u001a\u0004\u0018\u0001092\b\u00102\u001a\u0004\u0018\u0001098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010;\u001a\u0004\bH\u0010=\"\u0004\bI\u0010?R.\u0010J\u001a\u0004\u0018\u00010\u001f2\b\u00102\u001a\u0004\u0018\u00010\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u00104\u001a\u0004\bJ\u00106\"\u0004\bK\u00108¨\u0006V"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView;", "Landroid/webkit/WebView;", "Lyc/u;", "setupBasicContent", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAOptions;", "aaOptions", "loadLocalFilesAndDrawChart", "chartOptions", "configureChartOptionsAndDrawChart", "showJavaScriptAlertView", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "messageBody", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAMoveOverEventMessageModel;", "getEventMessageModel", "javaScriptString", "safeEvaluateJavaScriptString", "message", "androidMethod", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartModel;", "chartModel", "aa_drawChartWithChartModel", "aa_refreshChartWithChartModel", "aa_drawChartWithChartOptions", "aa_refreshChartWithChartOptions", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;", "seriesElementsArr", "aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray", "([Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;)V", BuildConfig.VERSION_NAME, "animation", "([Lcom/github/aachartmodel/aainfographics/aachartcreator/AASeriesElement;Z)V", "options", "redraw", "aa_updateChartWithOptions", BuildConfig.VERSION_NAME, "elementIndex", "shift", "aa_addPointToChartSeriesElement", "aa_showTheSeriesElementContent", "aa_hideTheSeriesElementContent", "aaSeriesElement", "aa_addElementToChartSeries", "aa_removeElementFromChartSeries", "jsFunctionStr", "aa_evaluateTheJavaScriptStringFunction", "optionsJson", "Ljava/lang/String;", "value", "chartSeriesHidden", "Ljava/lang/Boolean;", "getChartSeriesHidden", "()Ljava/lang/Boolean;", "setChartSeriesHidden", "(Ljava/lang/Boolean;)V", BuildConfig.VERSION_NAME, "contentWidth", "Ljava/lang/Float;", "getContentWidth", "()Ljava/lang/Float;", "setContentWidth", "(Ljava/lang/Float;)V", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView$AAChartViewCallBack;", "callBack", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView$AAChartViewCallBack;", "getCallBack", "()Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView$AAChartViewCallBack;", "setCallBack", "(Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView$AAChartViewCallBack;)V", "contentHeight", "getContentHeight", "setContentHeight", "isClearBackgroundColor", "setClearBackgroundColor", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "AAChartViewCallBack", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAChartView extends WebView {
    private HashMap _$_findViewCache;
    private AAChartViewCallBack callBack;
    private Boolean chartSeriesHidden;
    private Float contentHeight;
    private Float contentWidth;
    private Boolean isClearBackgroundColor;
    private String optionsJson;

    /* compiled from: AAChartView.kt */
    @Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView$AAChartViewCallBack;", BuildConfig.VERSION_NAME, "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAChartView;", "aaChartView", "Lyc/u;", "chartViewDidFinishLoad", "Lcom/github/aachartmodel/aainfographics/aachartcreator/AAMoveOverEventMessageModel;", "messageModel", "chartViewMoveOverEventMessage", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public interface AAChartViewCallBack {
        void chartViewDidFinishLoad(AAChartView aAChartView);

        void chartViewMoveOverEventMessage(AAChartView aAChartView, AAMoveOverEventMessageModel aAMoveOverEventMessageModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AAChartView(Context context) {
        super(context);
        Intrinsics.isThisObjectNull(context, "context");
        setupBasicContent();
    }

    public static /* synthetic */ void aa_addPointToChartSeriesElement$default(AAChartView aAChartView, int i, Object obj, boolean z, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        aAChartView.aa_addPointToChartSeriesElement(i, obj, z);
    }

    public static final /* synthetic */ void access$configureChartOptionsAndDrawChart(AAChartView aAChartView, AAOptions aAOptions) {
        aAChartView.configureChartOptionsAndDrawChart(aAOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureChartOptionsAndDrawChart(AAOptions aAOptions) {
        Boolean bool = this.isClearBackgroundColor;
        Intrinsics.ifNullDoSomething(bool);
        if (bool.booleanValue()) {
            AAChart chart = aAOptions.getChart();
            Intrinsics.ifNullDoSomething(chart);
            chart.backgroundColor("rgba(0,0,0,0)");
        }
        String m27788r = new C4364f().m27788r(aAOptions);
        this.optionsJson = m27788r;
        safeEvaluateJavaScriptString("loadTheHighChartView('" + m27788r + "','" + this.contentWidth + "','" + this.contentHeight + "')");
    }

    private final AAMoveOverEventMessageModel getEventMessageModel(Map map) {
        AAMoveOverEventMessageModel aAMoveOverEventMessageModel = new AAMoveOverEventMessageModel();
        aAMoveOverEventMessageModel.setName(String.valueOf(map.get("name")));
        aAMoveOverEventMessageModel.setX((Double) map.get("x"));
        aAMoveOverEventMessageModel.setY((Double) map.get("y"));
        aAMoveOverEventMessageModel.setCategory(String.valueOf(map.get("category")));
        aAMoveOverEventMessageModel.setOffset((C10124h) map.get("offset"));
        Double d = (Double) map.get("index");
        aAMoveOverEventMessageModel.setIndex(d != null ? Integer.valueOf((int) d.doubleValue()) : null);
        return aAMoveOverEventMessageModel;
    }

    private final void loadLocalFilesAndDrawChart(final AAOptions aAOptions) {
        loadUrl("file:///android_asset/AAChartView.html");
        setWebViewClient(new WebViewClient() { // from class: com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$loadLocalFilesAndDrawChart$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                Intrinsics.isThisObjectNull(webView, "view");
                Intrinsics.isThisObjectNull(str, "url");
                AAChartView.this.configureChartOptionsAndDrawChart(aAOptions);
                AAChartView.AAChartViewCallBack callBack = AAChartView.this.getCallBack();
                if (callBack != null) {
                    callBack.chartViewDidFinishLoad(AAChartView.this);
                }
            }
        });
    }

    private final void safeEvaluateJavaScriptString(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            evaluateJavascript("javascript:" + str, AAChartView$safeEvaluateJavaScriptString$1.INSTANCE);
            return;
        }
        loadUrl("javascript:" + str);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void setupBasicContent() {
        setContentWidth(Float.valueOf(420.0f));
        setContentHeight(Float.valueOf(580.0f));
        setClearBackgroundColor(Boolean.FALSE);
        WebSettings settings = getSettings();
        Intrinsics.checkIfNull(settings, "settings");
        settings.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        addJavascriptInterface(this, "androidObject");
    }

    private final void showJavaScriptAlertView() {
        setWebChromeClient(new WebChromeClient() { // from class: com.github.aachartmodel.aainfographics.aachartcreator.AAChartView$showJavaScriptAlertView$1
            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                Intrinsics.isThisObjectNull(webView, "view");
                Intrinsics.isThisObjectNull(str, "url");
                Intrinsics.isThisObjectNull(str2, "message");
                Intrinsics.isThisObjectNull(jsResult, "result");
                super.onJsAlert(webView, str, str2, jsResult);
                new AlertDialog.Builder(AAChartView.this.getContext()).setTitle("JavaScript alert Information").setMessage(("url --->" + str + "\n\n\n") + ("message --->" + str2 + "\n\n\n") + ("result --->" + jsResult)).setNeutralButton("sure", (DialogInterface.OnClickListener) null).show();
                return true;
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public final void aa_addElementToChartSeries(AASeriesElement aASeriesElement) {
        Intrinsics.isThisObjectNull(aASeriesElement, "aaSeriesElement");
        String m27788r = new C4364f().m27788r(aASeriesElement);
        safeEvaluateJavaScriptString("addElementToChartSeriesWithElement('" + m27788r + "')");
    }

    public final void aa_addPointToChartSeriesElement(int i, Object obj) {
        aa_addPointToChartSeriesElement$default(this, i, obj, false, 4, null);
    }

    public final void aa_addPointToChartSeriesElement(int i, Object obj, boolean z) {
        Intrinsics.isThisObjectNull(obj, "options");
        aa_addPointToChartSeriesElement(i, obj, true, z, true);
    }

    public final void aa_drawChartWithChartModel(AAChartModel aAChartModel) {
        Intrinsics.isThisObjectNull(aAChartModel, "chartModel");
        aa_drawChartWithChartOptions(AAChartModelKt.aa_toAAOptions(aAChartModel));
    }

    public final void aa_drawChartWithChartOptions(AAOptions aAOptions) {
        Intrinsics.isThisObjectNull(aAOptions, "chartOptions");
        if (this.optionsJson != null) {
            aa_refreshChartWithChartOptions(aAOptions);
            return;
        }
        loadLocalFilesAndDrawChart(aAOptions);
        showJavaScriptAlertView();
    }

    public final void aa_evaluateTheJavaScriptStringFunction(String str) {
        Intrinsics.isThisObjectNull(str, "jsFunctionStr");
        String pureJavaScriptFunctionString = AAJSStringPurer.INSTANCE.pureJavaScriptFunctionString(str);
        safeEvaluateJavaScriptString("evaluateTheJavaScriptStringFunction('" + pureJavaScriptFunctionString + "')");
    }

    public final void aa_hideTheSeriesElementContent(int i) {
        safeEvaluateJavaScriptString("hideTheSeriesElementContentWithIndex('" + i + "')");
    }

    public final void aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(AASeriesElement[] aASeriesElementArr) {
        Intrinsics.isThisObjectNull(aASeriesElementArr, "seriesElementsArr");
        aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(aASeriesElementArr, true);
    }

    public final void aa_refreshChartWithChartModel(AAChartModel aAChartModel) {
        Intrinsics.isThisObjectNull(aAChartModel, "chartModel");
        aa_refreshChartWithChartOptions(AAChartModelKt.aa_toAAOptions(aAChartModel));
    }

    public final void aa_refreshChartWithChartOptions(AAOptions aAOptions) {
        Intrinsics.isThisObjectNull(aAOptions, "chartOptions");
        configureChartOptionsAndDrawChart(aAOptions);
    }

    public final void aa_removeElementFromChartSeries(int i) {
        safeEvaluateJavaScriptString("removeElementFromChartSeriesWithElementIndex('" + i + "')");
    }

    public final void aa_showTheSeriesElementContent(int i) {
        safeEvaluateJavaScriptString("showTheSeriesElementContentWithIndex('" + i + "')");
    }

    public final void aa_updateChartWithOptions(Object obj, boolean z) {
        String m8935y;
        Intrinsics.isThisObjectNull(obj, "options");
        String simpleName = obj.getClass().getSimpleName();
        Intrinsics.checkIfNull(simpleName, "classNameStr");
        m8935y = StringsJVM.m8935y(simpleName, "AA", BuildConfig.VERSION_NAME, false, 4, null);
        Objects.requireNonNull(m8935y, "null cannot be cast to non-null type java.lang.String");
        String substring = m8935y.substring(0, 1);
        Intrinsics.checkIfNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase();
        Intrinsics.checkIfNull(lowerCase, "(this as java.lang.String).toLowerCase()");
        String substring2 = m8935y.substring(1);
        Intrinsics.checkIfNull(substring2, "(this as java.lang.String).substring(startIndex)");
        String str = lowerCase + substring2;
        HashMap hashMap = new HashMap();
        hashMap.put(str, obj);
        safeEvaluateJavaScriptString("updateChart('" + new C4364f().m27788r(hashMap) + "','" + z + "')");
    }

    @JavascriptInterface
    public final String androidMethod(String str) {
        Object m27797i = new C4364f().m27797i(str, new HashMap().getClass());
        Intrinsics.checkIfNull(m27797i, "Gson().fromJson(message, messageBody.javaClass)");
        AAMoveOverEventMessageModel eventMessageModel = getEventMessageModel((HashMap) m27797i);
        AAChartViewCallBack aAChartViewCallBack = this.callBack;
        if (aAChartViewCallBack != null) {
            aAChartViewCallBack.chartViewMoveOverEventMessage(this, eventMessageModel);
            return BuildConfig.VERSION_NAME;
        }
        return BuildConfig.VERSION_NAME;
    }

    public final AAChartViewCallBack getCallBack() {
        return this.callBack;
    }

    public final Boolean getChartSeriesHidden() {
        return this.chartSeriesHidden;
    }

    public final Float getContentHeight() {
        return this.contentHeight;
    }

    public final Float getContentWidth() {
        return this.contentWidth;
    }

    public final Boolean isClearBackgroundColor() {
        return this.isClearBackgroundColor;
    }

    public final void setCallBack(AAChartViewCallBack aAChartViewCallBack) {
        this.callBack = aAChartViewCallBack;
    }

    public final void setChartSeriesHidden(Boolean bool) {
        this.chartSeriesHidden = bool;
        safeEvaluateJavaScriptString("setChartSeriesHidden('" + this.chartSeriesHidden + "')");
    }

    public final void setClearBackgroundColor(Boolean bool) {
        this.isClearBackgroundColor = bool;
        if (Intrinsics.equals(bool, Boolean.TRUE)) {
            setBackgroundColor(0);
            Drawable background = getBackground();
            if (background != null) {
                background.setAlpha(0);
                return;
            }
            return;
        }
        setBackgroundColor(1);
        Drawable background2 = getBackground();
        if (background2 != null) {
            background2.setAlpha(255);
        }
    }

    public final void setContentHeight(Float f) {
        this.contentHeight = f;
        safeEvaluateJavaScriptString("setTheChartViewContentHeight('" + this.contentHeight + "')");
    }

    public final void setContentWidth(Float f) {
        this.contentWidth = f;
        safeEvaluateJavaScriptString("setTheChartViewContentWidth('" + this.contentWidth + "')");
    }

    public final void aa_addPointToChartSeriesElement(int i, Object obj, boolean z, boolean z2, boolean z3) {
        String obj2;
        Intrinsics.isThisObjectNull(obj, "options");
        if (!(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Double)) {
            obj2 = new C4364f().m27788r(obj);
            Intrinsics.checkIfNull(obj2, "Gson().toJson(options)");
        } else {
            obj2 = obj.toString();
        }
        safeEvaluateJavaScriptString("addPointToChartSeries('" + i + "','" + obj2 + "','" + z + "','" + z2 + "','" + z3 + "')");
    }

    public final void aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(AASeriesElement[] aASeriesElementArr, boolean z) {
        Intrinsics.isThisObjectNull(aASeriesElementArr, "seriesElementsArr");
        String m27788r = new C4364f().m27788r(aASeriesElementArr);
        safeEvaluateJavaScriptString("onlyRefreshTheChartDataWithSeries('" + m27788r + "','" + z + "')");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AAChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.isThisObjectNull(context, "context");
        setupBasicContent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AAChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.isThisObjectNull(context, "context");
        setupBasicContent();
    }
}
