package Generator;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author CodeCoderCoding
 */
@RequiredArgsConstructor
public class RequiredArgsConstructorDemo {
    @NonNull
    private Integer id;
    private String name = "Supremepole";
    private final String url;
}
