import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Example of using Getter and Setter annotations
 * @author CodeCoderCoding
 */
public class GetterSetter {
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PRIVATE)
    private String url;

}
