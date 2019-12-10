package interfaces;

public class PrivateInterfaceCaller implements PrivateInterface{

    public void callInterface() {
        doSomething();
    }

    public void callInterfaceStatic() {
        PrivateInterface.doSomethingStatic();
    }
}
