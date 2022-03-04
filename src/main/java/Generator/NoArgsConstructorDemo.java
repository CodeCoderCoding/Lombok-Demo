package Generator;

import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author CodeCoderCoding
 */
@NoArgsConstructor(force = true)
public class NoArgsConstructorDemo {
    @NonNull private Integer id;
    private String name;
    private final String url;
}
