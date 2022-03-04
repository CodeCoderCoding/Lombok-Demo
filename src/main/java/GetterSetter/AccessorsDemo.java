package GetterSetter;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author CodeCoderCoding
 */
@Data
@Accessors(fluent = true, chain = true, prefix = "abc")
public class AccessorsDemo {
    private Integer id;
    private String name;
    private String abcUrl;
}
