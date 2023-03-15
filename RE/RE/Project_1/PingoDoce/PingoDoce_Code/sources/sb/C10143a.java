package sb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: sb.a */
/* loaded from: classes2.dex */
public class C10143a {

    /* renamed from: e */
    public static final Collection<String> f26445e = m9066f("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14");

    /* renamed from: f */
    public static final Collection<String> f26446f = m9066f("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED");

    /* renamed from: a */
    private final Activity f26447a;

    /* renamed from: b */
    private final Map<String, Object> f26448b = new HashMap(3);

    /* renamed from: c */
    private Collection<String> f26449c;

    /* renamed from: d */
    private Class<?> f26450d;

    public C10143a(Activity activity) {
        this.f26447a = activity;
    }

    /* renamed from: b */
    private void m9070b(Intent intent) {
        for (Map.Entry<String, Object> entry : this.f26448b.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                intent.putExtra(key, (Integer) value);
            } else if (value instanceof Long) {
                intent.putExtra(key, (Long) value);
            } else if (value instanceof Boolean) {
                intent.putExtra(key, (Boolean) value);
            } else if (value instanceof Double) {
                intent.putExtra(key, (Double) value);
            } else if (value instanceof Float) {
                intent.putExtra(key, (Float) value);
            } else if (value instanceof Bundle) {
                intent.putExtra(key, (Bundle) value);
            } else if (value instanceof int[]) {
                intent.putExtra(key, (int[]) value);
            } else if (value instanceof long[]) {
                intent.putExtra(key, (long[]) value);
            } else if (value instanceof boolean[]) {
                intent.putExtra(key, (boolean[]) value);
            } else if (value instanceof double[]) {
                intent.putExtra(key, (double[]) value);
            } else if (value instanceof float[]) {
                intent.putExtra(key, (float[]) value);
            } else if (value instanceof String[]) {
                intent.putExtra(key, (String[]) value);
            } else {
                intent.putExtra(key, value.toString());
            }
        }
    }

    /* renamed from: f */
    private static List<String> m9066f(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    /* renamed from: g */
    public static C10144b m9065g(int i, Intent intent) {
        if (i == -1) {
            String stringExtra = intent.getStringExtra("SCAN_RESULT");
            String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
            byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
            int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", Integer.MIN_VALUE);
            return new C10144b(stringExtra, stringExtra2, byteArrayExtra, intExtra == Integer.MIN_VALUE ? null : Integer.valueOf(intExtra), intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"), intent.getStringExtra("SCAN_RESULT_IMAGE_PATH"), intent);
        }
        return new C10144b(intent);
    }

    /* renamed from: a */
    public final C10143a m9071a(String str, Object obj) {
        this.f26448b.put(str, obj);
        return this;
    }

    /* renamed from: c */
    public Intent m9069c() {
        Intent intent = new Intent(this.f26447a, m9068d());
        intent.setAction("com.google.zxing.client.android.SCAN");
        if (this.f26449c != null) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : this.f26449c) {
                if (sb2.length() > 0) {
                    sb2.append(',');
                }
                sb2.append(str);
            }
            intent.putExtra("SCAN_FORMATS", sb2.toString());
        }
        intent.addFlags(67108864);
        intent.addFlags(524288);
        m9070b(intent);
        return intent;
    }

    /* renamed from: d */
    public Class<?> m9068d() {
        if (this.f26450d == null) {
            this.f26450d = m9067e();
        }
        return this.f26450d;
    }

    /* renamed from: e */
    protected Class<?> m9067e() {
        return CaptureActivity.class;
    }

    /* renamed from: h */
    public C10143a m9064h(boolean z) {
        m9071a("BEEP_ENABLED", Boolean.valueOf(z));
        return this;
    }

    /* renamed from: i */
    public C10143a m9063i(int i) {
        if (i >= 0) {
            m9071a("SCAN_CAMERA_ID", Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: j */
    public C10143a m9062j(String... strArr) {
        this.f26449c = Arrays.asList(strArr);
        return this;
    }

    /* renamed from: k */
    public C10143a m9061k(boolean z) {
        m9071a("SCAN_ORIENTATION_LOCKED", Boolean.valueOf(z));
        return this;
    }

    /* renamed from: l */
    public final C10143a m9060l(String str) {
        if (str != null) {
            m9071a("PROMPT_MESSAGE", str);
        }
        return this;
    }
}
