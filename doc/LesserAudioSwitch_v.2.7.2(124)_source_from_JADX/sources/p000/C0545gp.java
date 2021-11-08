package p000;

import android.util.SparseArray;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: gp */
public class C0545gp {

    /* renamed from: a */
    public static final SparseArray<Integer> f2411a;

    /* renamed from: b */
    public static final SparseArray<Integer> f2412b;

    static {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        f2411a = sparseArray;
        SparseArray<Integer> sparseArray2 = new SparseArray<>();
        f2412b = sparseArray2;
        sparseArray.append(0, Integer.valueOf(R.string.iap_purchase_error_ok));
        sparseArray.append(1, Integer.valueOf(R.string.iap_purchase_error_error));
        sparseArray.append(2, Integer.valueOf(R.string.iap_purchase_error_user_cancelled));
        sparseArray.append(3, Integer.valueOf(R.string.iap_purchase_error_billing_unavailable));
        sparseArray.append(4, Integer.valueOf(R.string.iap_purchase_error_feature_not_supported));
        sparseArray.append(5, Integer.valueOf(R.string.iap_purchase_error_item_already_owned));
        sparseArray.append(6, Integer.valueOf(R.string.iap_purchase_error_item_unavailable));
        Integer valueOf = Integer.valueOf(R.string.iap_purchase_error_service_connection_problem);
        sparseArray.append(7, valueOf);
        sparseArray.append(8, valueOf);
        sparseArray.append(9, Integer.valueOf(R.string.iap_purchase_error_purchase_pending));
        sparseArray.append(10, Integer.valueOf(R.string.iap_purchase_error_null));
        sparseArray.append(11, Integer.valueOf(R.string.iap_purchase_error_unexpected_error));
        sparseArray.append(12, Integer.valueOf(R.string.iap_purchase_error_verification_failed));
        sparseArray.append(13, Integer.valueOf(R.string.iap_purchase_error_verification_tampered));
        sparseArray2.append(0, Integer.valueOf(R.string.iap_purchase_error_short_ok));
        sparseArray2.append(1, Integer.valueOf(R.string.iap_purchase_error_short_error));
        sparseArray2.append(2, Integer.valueOf(R.string.iap_purchase_error_short_user_cancelled));
        sparseArray2.append(3, Integer.valueOf(R.string.iap_purchase_error_short_billing_unavailable));
        sparseArray2.append(4, Integer.valueOf(R.string.iap_purchase_error_short_feature_not_supported));
        sparseArray2.append(5, Integer.valueOf(R.string.iap_purchase_error_short_item_already_owned));
        sparseArray2.append(6, Integer.valueOf(R.string.iap_purchase_error_short_item_unavailable));
        Integer valueOf2 = Integer.valueOf(R.string.iap_purchase_error_short_service_connection_problem);
        sparseArray2.append(7, valueOf2);
        sparseArray2.append(8, valueOf2);
        sparseArray2.append(9, Integer.valueOf(R.string.iap_purchase_error_short_purchase_pending));
        sparseArray2.append(10, Integer.valueOf(R.string.iap_purchase_error_short_null));
        sparseArray2.append(11, Integer.valueOf(R.string.iap_purchase_error_short_unexpected_error));
        sparseArray2.append(12, Integer.valueOf(R.string.iap_purchase_error_short_verification_failed));
        sparseArray2.append(13, Integer.valueOf(R.string.iap_purchase_error_short_verification_tampered));
    }
}
