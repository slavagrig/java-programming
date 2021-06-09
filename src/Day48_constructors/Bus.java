package Day48_constructors;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Bus {
    Driver driver;
    Engine engine;

    public String toString() {
        return driver.getName();
    }
}
