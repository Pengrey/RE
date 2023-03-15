package fm;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0325c;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.text.Normalizer;
import java.util.Objects;
import mg.TransactionCacheManager;
import p106fe.IntentUtils;
import p181jd.Intrinsics;
import p426wg.AbstractC11737e0;
import pt.pingodoce.app.data.remote.models.response.Flyer;
import sd.C10156i;
import sd.C10171u;
import sj.FlyerActivity;

/* compiled from: UtilsExtensions.kt */
/* renamed from: fm.c */
/* loaded from: classes2.dex */
public final class C5579c {
    /* renamed from: a */
    public static final void m23718a(Activity activity) {
        Intrinsics.isThisObjectNull(activity, "<this>");
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        activity.getWindow().setAttributes(attributes);
    }

    /* renamed from: b */
    public static final String m23717b(ClickableSpan clickableSpan, TextView textView) {
        Intrinsics.isThisObjectNull(clickableSpan, "<this>");
        Intrinsics.isThisObjectNull(textView, "textView");
        CharSequence text = textView.getText();
        Objects.requireNonNull(text, "null cannot be cast to non-null type android.text.Spanned");
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan)).toString();
    }

    /* renamed from: c */
    public static final String m23716c(String str, String str2) {
        CharSequence m8915K0;
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "unit");
        m8915K0 = C10171u.m8915K0(str + "€ " + str2);
        return m8915K0.toString();
    }

    /* renamed from: d */
    public static /* synthetic */ String m23715d(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = BuildConfig.VERSION_NAME;
        }
        return m23716c(str, str2);
    }

    /* renamed from: e */
    public static final ValueAnimator m23714e(int i, int i2, long j) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(j);
        Intrinsics.checkIfNull(ofObject, "ofObject(ArgbEvaluator()…his.duration = duration }");
        return ofObject;
    }

    /* renamed from: f */
    public static final void m23713f(AbstractC11737e0 abstractC11737e0, ActivityC0325c activityC0325c, Flyer flyer, TransactionCacheManager transactionCacheManager) {
        Intrinsics.isThisObjectNull(abstractC11737e0, "<this>");
        Intrinsics.isThisObjectNull(activityC0325c, "context");
        Intrinsics.isThisObjectNull(flyer, "flyer");
        Intrinsics.isThisObjectNull(transactionCacheManager, "cache");
        if (flyer.m13832m()) {
            IntentUtils.m24293a(activityC0325c, flyer.m13836h());
        } else {
            FlyerActivity.m8458a(activityC0325c, flyer, transactionCacheManager);
        }
    }

    /* renamed from: g */
    public static final String m23712g(String str) {
        Intrinsics.isThisObjectNull(str, "<this>");
        C10156i c10156i = new C10156i("\\p{InCombiningDiacriticalMarks}+");
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        Intrinsics.checkIfNull(normalize, "temp");
        return c10156i.m9020e(normalize, BuildConfig.VERSION_NAME);
    }

    @SuppressLint({"DirectColorInSource"})
    /* renamed from: h */
    public static final ColorStateList m23711h(String str) {
        int parseColor;
        Intrinsics.isThisObjectNull(str, "<this>");
        int[][] iArr = {new int[]{16842910}, new int[]{-16842910}, new int[]{-16842919}, new int[]{16842919}};
        try {
            parseColor = Color.parseColor(str);
        } catch (Exception unused) {
            parseColor = Color.parseColor("#FFFFFFFF");
        }
        return new ColorStateList(iArr, new int[]{parseColor, parseColor, parseColor, parseColor});
    }
}
