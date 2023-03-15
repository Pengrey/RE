package p364t6;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: t6.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C10386b implements Comparator {

    /* renamed from: w */
    public static final /* synthetic */ C10386b f27017w = new C10386b();

    private /* synthetic */ C10386b() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).m33512h().compareTo(((Scope) obj2).m33512h());
    }
}
