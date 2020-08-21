package tech.lvjiawen.demo.sample.database;

public class MySql implements IConnect {
    private String ip;
    private Integer port;

    public MySql(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }

    public void connect() {
        System.out.println(this.ip + ": " + this.port);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
