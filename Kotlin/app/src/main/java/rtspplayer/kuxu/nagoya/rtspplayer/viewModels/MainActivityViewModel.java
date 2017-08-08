package rtspplayer.kuxu.nagoya.rtspplayer.viewModels;

/**
 * Created by gurag on 2017/08/08.
 */

public class MainActivityViewModel {
    private final String Greeting;

    public MainActivityViewModel(String greeting) {
        Greeting = greeting;
    }

    public String getGreeting() {
        return Greeting;
    }
}
