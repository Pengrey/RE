package android.support.p016v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p016v4.media.MediaMetadataCompat;
import android.support.p016v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes.dex */
public interface InterfaceC0256a extends IInterface {

    /* compiled from: IMediaControllerCallback.java */
    /* renamed from: android.support.v4.media.session.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0257a extends Binder implements InterfaceC0256a {
        public AbstractBinderC0257a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41419E(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41411o();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41416J1(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41414T(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41408w(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41412n(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41409u(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41415R1(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41413g0(parcel.readInt());
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41417I(parcel.readInt() != 0);
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41410t1(parcel.readInt() != 0);
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41420A0(parcel.readInt());
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo41418E0();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
    }

    /* renamed from: A0 */
    void mo41420A0(int i) throws RemoteException;

    /* renamed from: E */
    void mo41419E(String str, Bundle bundle) throws RemoteException;

    /* renamed from: E0 */
    void mo41418E0() throws RemoteException;

    /* renamed from: I */
    void mo41417I(boolean z) throws RemoteException;

    /* renamed from: J1 */
    void mo41416J1(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    /* renamed from: R1 */
    void mo41415R1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    /* renamed from: T */
    void mo41414T(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    /* renamed from: g0 */
    void mo41413g0(int i) throws RemoteException;

    /* renamed from: n */
    void mo41412n(CharSequence charSequence) throws RemoteException;

    /* renamed from: o */
    void mo41411o() throws RemoteException;

    /* renamed from: t1 */
    void mo41410t1(boolean z) throws RemoteException;

    /* renamed from: u */
    void mo41409u(Bundle bundle) throws RemoteException;

    /* renamed from: w */
    void mo41408w(List<MediaSessionCompat.QueueItem> list) throws RemoteException;
}
