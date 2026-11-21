package school.sptech.pool_service.entity;

public class HelloMessage {
    private String hello;

    public HelloMessage(String hello) {
        this.hello = hello;
    }

    public HelloMessage() {
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
