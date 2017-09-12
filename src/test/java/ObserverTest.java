import br.com.jairomfj.observer.Observable;
import br.com.jairomfj.observer.Observer;
import br.com.jairomfj.observer.RedDress;
import br.com.jairomfj.observer.User;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void testNotifyingUsers() throws Exception {
        Observable redDress = new RedDress();
        Observer user = new User(redDress);
        redDress.addObserver(user);

        redDress.notifyObserver();
    }
}
