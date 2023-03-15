package p201kb;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.zxing.EnumC4399d;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: kb.g */
/* loaded from: classes2.dex */
public final class C6629g {

    /* renamed from: a */
    private static final String f17898a = "g";

    static {
        Pattern.compile(",");
    }

    /* renamed from: a */
    public static Map<EnumC4399d, Object> m20429a(Intent intent) {
        EnumC4399d[] values;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC4399d.class);
        for (EnumC4399d enumC4399d : EnumC4399d.values()) {
            if (enumC4399d != EnumC4399d.CHARACTER_SET && enumC4399d != EnumC4399d.NEED_RESULT_POINT_CALLBACK && enumC4399d != EnumC4399d.POSSIBLE_FORMATS) {
                String name = enumC4399d.name();
                if (extras.containsKey(name)) {
                    if (enumC4399d.getValueType().equals(Void.class)) {
                        enumMap.put((EnumMap) enumC4399d, (EnumC4399d) Boolean.TRUE);
                    } else {
                        Object obj = extras.get(name);
                        if (enumC4399d.getValueType().isInstance(obj)) {
                            enumMap.put((EnumMap) enumC4399d, (EnumC4399d) obj);
                        } else {
                            Log.w(f17898a, "Ignoring hint " + enumC4399d + " because it is not assignable from " + obj);
                        }
                    }
                }
            }
        }
        Log.i(f17898a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
