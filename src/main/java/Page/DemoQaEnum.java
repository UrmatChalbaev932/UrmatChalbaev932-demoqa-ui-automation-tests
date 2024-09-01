import ConfigReader.ConfigReader;
import lombok.Getter;

@Getter
public enum DemoQaEnum {
    LOGIN_PAGE("http://" + ConfigReader.getValue("domain")),
    TEXT_BOX("/text-box");
    public final String URL;

    DemoQaEnum(String URL) {
        this.URL = URL;
    }
}
