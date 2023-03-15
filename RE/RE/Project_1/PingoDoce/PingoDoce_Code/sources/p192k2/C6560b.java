package p192k2;

import android.annotation.SuppressLint;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.C1070c;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: k2.b */
/* loaded from: classes.dex */
public final class C6560b {

    /* compiled from: InputConnectionCompat.java */
    /* renamed from: k2.b$a */
    /* loaded from: classes.dex */
    class C6561a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6563c f17795a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6561a(InputConnection inputConnection, boolean z, InterfaceC6563c interfaceC6563c) {
            super(inputConnection, z);
            this.f17795a = interfaceC6563c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f17795a.mo20572a(C6564c.m20566f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    /* renamed from: k2.b$b */
    /* loaded from: classes.dex */
    class C6562b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6563c f17796a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6562b(InputConnection inputConnection, boolean z, InterfaceC6563c interfaceC6563c) {
            super(inputConnection, z);
            this.f17796a = interfaceC6563c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C6560b.m20573b(str, bundle, this.f17796a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    /* renamed from: k2.b$c */
    /* loaded from: classes.dex */
    public interface InterfaceC6563c {
        /* renamed from: a */
        boolean mo20572a(C6564c c6564c, int i, Bundle bundle);
    }

    @Deprecated
    /* renamed from: a */
    public static InputConnection m20574a(InputConnection inputConnection, EditorInfo editorInfo, InterfaceC6563c interfaceC6563c) {
        C1070c.m38631d(inputConnection, "inputConnection must be non-null");
        C1070c.m38631d(editorInfo, "editorInfo must be non-null");
        C1070c.m38631d(interfaceC6563c, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new C6561a(inputConnection, false, interfaceC6563c);
        }
        return C6558a.m20583a(editorInfo).length == 0 ? inputConnection : new C6562b(inputConnection, false, interfaceC6563c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: b */
    static boolean m20573b(String str, Bundle bundle, InterfaceC6563c interfaceC6563c) {
        boolean z;
        ResultReceiver resultReceiver;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
            Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
            int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
            Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
            if (uri != null && clipDescription != null) {
                r0 = interfaceC6563c.mo20572a(new C6564c(uri, clipDescription, uri2), i, bundle2);
            }
            if (resultReceiver != 0) {
                resultReceiver.send(r0, null);
            }
            return r0;
        } catch (Throwable th3) {
            th = th3;
            if (resultReceiver != 0) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }
}
