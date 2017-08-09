package rtspplayer.kuxu.nagoya.rtspplayer;

import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import rtspplayer.kuxu.nagoya.rtspplayer.databinding.ActivityMainBinding;
import rtspplayer.kuxu.nagoya.rtspplayer.viewModels.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MainActivityViewModel mainActivityViewModel = new MainActivityViewModel();

        binding.setViewModel(mainActivityViewModel);
        binding.setActivity(this);

        binding.getViewModel().RTSPURL.set("rtsp://mpv.cdn3.bigCDN.com:554/bigCDN/_definst_/mp4:bigbuckbunnyiphone_400.mp4");
    }

    public void PlayVideo(){
        String url = binding.getViewModel().RTSPURL.get();
        if(url == null || url == "") return;
        binding.videoView.setVideoURI(Uri.parse(url));

        binding.videoView.start();
    }
}
