package p201kb;

import android.media.MediaPlayer;

/* renamed from: kb.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6626d implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public static final /* synthetic */ C6626d f17884a = new C6626d();

    private /* synthetic */ C6626d() {
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        boolean m20435d;
        m20435d = C6627e.m20435d(mediaPlayer, i, i2);
        return m20435d;
    }
}
