package Generator;

import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * @author CodeCoderCoding
 */
@AllArgsConstructor
public class AllArgsConstructorDemo {
    @NonNull
    private Integer id;
    private String name = "Supremepole";
    private final String url;
}
