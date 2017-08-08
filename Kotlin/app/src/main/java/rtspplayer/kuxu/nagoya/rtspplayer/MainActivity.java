package rtspplayer.kuxu.nagoya.rtspplayer;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rtspplayer.kuxu.nagoya.rtspplayer.databinding.ActivityMainBinding;
import rtspplayer.kuxu.nagoya.rtspplayer.viewModels.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        MainActivityViewModel mainActivityViewModel = new MainActivityViewModel("Hello People");

        binding.setViewModel(mainActivityViewModel);

    }
}
