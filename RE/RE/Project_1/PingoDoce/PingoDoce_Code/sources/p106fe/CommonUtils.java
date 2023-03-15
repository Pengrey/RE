package p106fe;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.net.ParseException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import p181jd.Intrinsics;

/* renamed from: fe.a */
/* loaded from: classes2.dex */
public final class CommonUtils {

    /* renamed from: a */
    public static final CommonUtils f15361a = new CommonUtils();

    /* compiled from: CommonUtils.kt */
    /* renamed from: fe.a$a */
    /* loaded from: classes2.dex */
    public static final class C5455a implements TypeEvaluator {
        C5455a() {
        }

        /* renamed from: a */
        public Float m24294a(float f, float f2, float f3) {
            return Float.valueOf(f2 + ((f3 - f2) * f));
        }

        public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            return m24294a(f, ((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }
    }

    private CommonUtils() {
    }

    /* renamed from: e */
    private final int m24297e(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkIfNull(obtain, "obtain()");
        bundle.writeToParcel(obtain, 0);
        int dataSize = obtain.dataSize();
        obtain.recycle();
        return dataSize;
    }

    /* renamed from: a */
    public final ValueAnimator m24301a(float f, float f2, long j) {
        return m24300b(f, f2, j, new DecelerateInterpolator());
    }

    /* renamed from: b */
    public final ValueAnimator m24300b(float f, float f2, long j, TimeInterpolator timeInterpolator) {
        Intrinsics.isThisObjectNull(timeInterpolator, "interpolator");
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(timeInterpolator);
        valueAnimator.setDuration(j);
        valueAnimator.setObjectValues(Float.valueOf(f), Float.valueOf(f2));
        valueAnimator.setEvaluator(new C5455a());
        return valueAnimator;
    }

    /* renamed from: c */
    public final boolean m24299c(Bundle bundle) {
        Intrinsics.isThisObjectNull(bundle, "extras");
        return m24297e(bundle) >= 524288;
    }

    /* renamed from: d */
    public final boolean m24298d(View view) {
        int stableInsetBottom;
        Intrinsics.isThisObjectNull(view, "view");
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                stableInsetBottom = view.getRootWindowInsets().getInsets(WindowInsets.Type.navigationBars()).bottom;
            } else {
                stableInsetBottom = view.getRootWindowInsets().getStableInsetBottom();
            }
            return stableInsetBottom > 50;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public final float m24296f(float f, float f2, float f3, float f4, float f5) {
        return (((f5 - f4) * (f - f2)) / (f3 - f2)) + f4;
    }

    /* renamed from: g */
    public final String m24295g(String str, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2) {
        String str2;
        Date parse;
        Intrinsics.isThisObjectNull(str, "date");
        Intrinsics.isThisObjectNull(simpleDateFormat, "from");
        Intrinsics.isThisObjectNull(simpleDateFormat2, "to");
        try {
            parse = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            str2 = BuildConfig.VERSION_NAME;
        }
        if (parse != null) {
            str2 = simpleDateFormat2.format(parse);
            Intrinsics.checkIfNull(str2, "to.format(from.parse(date) as Date)");
            return str2.length() == 0 ? BuildConfig.VERSION_NAME : str2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.Date");
    }
}
