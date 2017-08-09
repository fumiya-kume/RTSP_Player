package rtspplayer.kuxu.nagoya.rtspplayer.viewModels;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

/**
 * Created by gurag on 2017/08/08.
 */

public class MainActivityViewModel extends BaseObservable {
    public ObservableField<String> RTSPURL = new ObservableField<>();

    public boolean ValidURL(){
        return RTSPURL.get() != "";
    }
}
