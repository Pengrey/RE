package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import p177j9.C6378d;
import p177j9.InterfaceC6388i;
import p489zc.CollectionsJVM;
import pa.C8590h;

@Keep
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, m20207d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lj9/i;", BuildConfig.VERSION_NAME, "Lj9/d;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-common-ktx"}, m20206k = 1, m20205mv = {1, 4, 0})
/* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar */
/* loaded from: classes.dex */
public final class Firebase implements InterfaceC6388i {
    @Override // p177j9.InterfaceC6388i
    public List<C6378d<?>> getComponents() {
        List<C6378d<?>> m202b;
        m202b = CollectionsJVM.m202b(C8590h.m15081b("fire-core-ktx", "20.0.0"));
        return m202b;
    }
}
