package p484z6;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.C2597i;
import p439x6.C12287b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: z6.f */
/* loaded from: classes.dex */
public class C13708f {

    /* renamed from: a */
    private final Resources f34824a;

    /* renamed from: b */
    private final String f34825b;

    public C13708f(Context context) {
        C2597i.m33076j(context);
        Resources resources = context.getResources();
        this.f34824a = resources;
        this.f34825b = resources.getResourcePackageName(C12287b.common_google_play_services_unknown_issue);
    }

    /* renamed from: a */
    public String m563a(String str) {
        int identifier = this.f34824a.getIdentifier(str, "string", this.f34825b);
        if (identifier == 0) {
            return null;
        }
        return this.f34824a.getString(identifier);
    }
}
